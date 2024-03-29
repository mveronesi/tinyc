#include <iostream>
#include <string>
#include <exception>
#include "runtimeVisitor.h"

using namespace std;

antlrcpp::Any runtimeVisitor::visitDecl(tinycParser::DeclContext *ctx) {
    string varname = ctx->ID()->getText();
    this->vars[varname] = 0;
    return NULL;
}

antlrcpp::Any runtimeVisitor::visitAssign(tinycParser::AssignContext *ctx) {
    string varname = ctx->ID()->getText();
    int value = visitExpr(ctx->expr());
    this->vars[varname] = value;
    return NULL;
}

antlrcpp::Any runtimeVisitor::visitOut(tinycParser::OutContext *ctx) {
    // verifico se devo stampare intero o stringa
    if(ctx->expr() != NULL) {
        // caso stampa intero
        int value = visitExpr(ctx->expr());
        cout << value << endl;
    }
    else  // stampa stringa
    { // TODO: implementare il caso stampa di una stringa (fatto)
        string value = ctx->STRING()->getText();  // ottiene la stringa con apici
        value.erase(0,1);  // cancella 1 carattere a partire dal carattere 0, i.e. il primo apice
        value.erase(value.length()-1, 1);  // cancella 1 carattere a partire dall'ultimo carattere, i.e. l'ultimo apice
        cout << value << endl;  // stampa la stringa senza apici
    }
    return NULL;
}

antlrcpp::Any runtimeVisitor::visitInput(tinycParser::InputContext *ctx) {
    // TODO: implementa la lettura dell'input da tastiera
    // il metodo deve ritornare un valore intero (fatto)
    int value;
    cin >> value;
    return value;
}


antlrcpp::Any runtimeVisitor::visitBranch(tinycParser::BranchContext *ctx) {
    // stabilisce il valore della guardia
    bool guard = visitGuard(ctx->guard());
    if(guard) {
        // se guardia vera, esegue ramo then
        visitProgram(ctx->program(0));
    } 
    // TODO: implementa l'esecuzione del ramo else (se presente) quando la guardia è falsa 
    // (fatto)
    else if(ctx->program(1) != nullptr)
    {
        visitProgram(ctx->program(1));
    }
    return NULL;
}

antlrcpp::Any runtimeVisitor::visitLoop(tinycParser::LoopContext *ctx) {
    // TODO: implementa l'esecuzione del ciclo while (fatto)
    while(visitGuard(ctx->guard()))
        visitProgram(ctx->program());
    return NULL;
}

antlrcpp::Any runtimeVisitor::visitExpr(tinycParser::ExprContext *ctx) {
    // controllo in quale caso sono
    int value = 0;
    if(ctx->ID() != NULL) {
        // caso ID
        string varname = ctx->ID()->getText();
        value = this->vars[varname];
    } else if(ctx->NUMBER() != NULL) {
        // caso NUMBER
        string numtext = ctx->NUMBER()->getText();
        value = std::stoi(numtext); 
    } else if(ctx->input() != NULL) {
        // caso input
        value = visitInput(ctx->input());
    } else if(ctx->PLUS() != NULL) {
        // caso expr + expr
        // calcolo il valore della prima expr
        int left = visitExpr(ctx->expr(0));
        // calcolo il valore della seconda expr
        int right = visitExpr(ctx->expr(1));
        // il risultato finale è la somma
        value = left + right;
    } else if(ctx->MINUS() != NULL) {
        // caso expr - expr
        // calcolo il valore della prima expr
        int left = visitExpr(ctx->expr(0));
        // calcolo il valore della seconda expr
        int right = visitExpr(ctx->expr(1));
        // il risultato finale è la differenza
        value = left - right;
    } else if(ctx->TIMES() != NULL) {
        // caso expr * expr
        // calcolo il valore della prima expr
        int left = visitExpr(ctx->expr(0));
        // calcolo il valore della seconda expr
        int right = visitExpr(ctx->expr(1));
        // il risultato finale è la moltiplicazione
        value = left * right;
    } else if(ctx->DIV() != NULL) {
        // caso expr / expr
        // calcolo il valore della prima expr
        int left = visitExpr(ctx->expr(0));
        // calcolo il valore della seconda expr
        int right = visitExpr(ctx->expr(1));
        // il risultato finale è la divisione
        value = left / right;
    } else if(ctx->MOD() != NULL) {
        // caso expr % expr
        // calcolo il valore della prima expr
        int left = visitExpr(ctx->expr(0));
        // calcolo il valore della seconda expr
        int right = visitExpr(ctx->expr(1));
        // il risultato finale è il modulo
        value = left % right;
    } else if(ctx->expr().size() == 1) {
        // caso parentesi
        value = visitExpr(ctx->expr(0));
    } 
    return value;
}

antlrcpp::Any runtimeVisitor::visitGuard(tinycParser::GuardContext *ctx) {
    // TODO: implementa la valutazione di una espressione booleana
    // il metodo ritorna true se l'espressione è vera, false altrimenti
    // (fatto)
    bool value = false;
    if(ctx->relation())
        value = visitRelation(ctx->relation());
    else if(ctx->NOT())
            value = !(visitGuard(ctx->guard(0)));
    else if(ctx->AND())
        value = visitGuard(ctx->guard(0)) && visitGuard(ctx->guard(1));
    else if(ctx->OR())
        value = visitGuard(ctx->guard(0)) || visitGuard(ctx->guard(1));
    else //if(ctx->guard().size() == 1) // parentesi
        value = visitGuard(ctx->guard(0));
    return value; 
}

antlrcpp::Any runtimeVisitor::visitRelation(tinycParser::RelationContext *ctx) {
    // TODO: implementa la valutazione di un confronto 
    // il metodo ritorna true se il confronto è vero, false altrimenti
    // (fatto)
    bool value = false;
    int left = visitExpr(ctx->expr(0)), right = visitExpr(ctx->expr(1));
    if(ctx->LT())
        value = left < right;
    else if(ctx->LEQ())
        value = left <= right;
    else if(ctx->EQ())
        value = left == right;
    else if(ctx->NEQ())
        value = left != right;
    else if(ctx->GEQ())
        value = left >= right;
    else if(ctx->GT())
        value = left > right;
    return value;
}
