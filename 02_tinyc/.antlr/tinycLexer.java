// Generated from /home/michele/Desktop/lab_automi/02_tinyc/tinyc.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tinycLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, EQ=14, LT=15, LEQ=16, GT=17, GEQ=18, 
		NEQ=19, PLUS=20, MINUS=21, MULT=22, DIV=23, MOD=24, AND=25, OR=26, NOT=27, 
		ID=28, NUMBER=29, COMMENT=30, LINE_COMMENT=31, WS=32, ErrorChar=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "EQ", "LT", "LEQ", "GT", "GEQ", "NEQ", 
		"PLUS", "MINUS", "MULT", "DIV", "MOD", "AND", "OR", "NOT", "ID", "NUMBER", 
		"COMMENT", "LINE_COMMENT", "WS", "ErrorChar"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'int'", "'='", "'write'", "'('", "')'", "'\"'", "'read'", 
		"'if'", "'{'", "'}'", "'else'", "'while'", "'=='", "'<'", "'<='", "'>'", 
		"'>='", "'!='", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "EQ", "LT", "LEQ", "GT", "GEQ", "NEQ", "PLUS", "MINUS", "MULT", 
		"DIV", "MOD", "AND", "OR", "NOT", "ID", "NUMBER", "COMMENT", "LINE_COMMENT", 
		"WS", "ErrorChar"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public tinycLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "tinyc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00be\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\3\35\6\35\u0094\n\35\r\35\16\35\u0095\3\36\6\36\u0099\n"+
		"\36\r\36\16\36\u009a\3\37\3\37\3\37\3\37\7\37\u00a1\n\37\f\37\16\37\u00a4"+
		"\13\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \7 \u00af\n \f \16 \u00b2\13"+
		" \3 \3 \3!\6!\u00b7\n!\r!\16!\u00b8\3!\3!\3\"\3\"\3\u00a2\2#\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#\3\2\6\3\2c|\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u00c2\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2\2\7K\3"+
		"\2\2\2\tM\3\2\2\2\13S\3\2\2\2\rU\3\2\2\2\17W\3\2\2\2\21Y\3\2\2\2\23^\3"+
		"\2\2\2\25a\3\2\2\2\27c\3\2\2\2\31e\3\2\2\2\33j\3\2\2\2\35p\3\2\2\2\37"+
		"s\3\2\2\2!u\3\2\2\2#x\3\2\2\2%z\3\2\2\2\'}\3\2\2\2)\u0080\3\2\2\2+\u0082"+
		"\3\2\2\2-\u0084\3\2\2\2/\u0086\3\2\2\2\61\u0088\3\2\2\2\63\u008a\3\2\2"+
		"\2\65\u008d\3\2\2\2\67\u0090\3\2\2\29\u0093\3\2\2\2;\u0098\3\2\2\2=\u009c"+
		"\3\2\2\2?\u00aa\3\2\2\2A\u00b6\3\2\2\2C\u00bc\3\2\2\2EF\7=\2\2F\4\3\2"+
		"\2\2GH\7k\2\2HI\7p\2\2IJ\7v\2\2J\6\3\2\2\2KL\7?\2\2L\b\3\2\2\2MN\7y\2"+
		"\2NO\7t\2\2OP\7k\2\2PQ\7v\2\2QR\7g\2\2R\n\3\2\2\2ST\7*\2\2T\f\3\2\2\2"+
		"UV\7+\2\2V\16\3\2\2\2WX\7$\2\2X\20\3\2\2\2YZ\7t\2\2Z[\7g\2\2[\\\7c\2\2"+
		"\\]\7f\2\2]\22\3\2\2\2^_\7k\2\2_`\7h\2\2`\24\3\2\2\2ab\7}\2\2b\26\3\2"+
		"\2\2cd\7\177\2\2d\30\3\2\2\2ef\7g\2\2fg\7n\2\2gh\7u\2\2hi\7g\2\2i\32\3"+
		"\2\2\2jk\7y\2\2kl\7j\2\2lm\7k\2\2mn\7n\2\2no\7g\2\2o\34\3\2\2\2pq\7?\2"+
		"\2qr\7?\2\2r\36\3\2\2\2st\7>\2\2t \3\2\2\2uv\7>\2\2vw\7?\2\2w\"\3\2\2"+
		"\2xy\7@\2\2y$\3\2\2\2z{\7@\2\2{|\7?\2\2|&\3\2\2\2}~\7#\2\2~\177\7?\2\2"+
		"\177(\3\2\2\2\u0080\u0081\7-\2\2\u0081*\3\2\2\2\u0082\u0083\7/\2\2\u0083"+
		",\3\2\2\2\u0084\u0085\7,\2\2\u0085.\3\2\2\2\u0086\u0087\7\61\2\2\u0087"+
		"\60\3\2\2\2\u0088\u0089\7\'\2\2\u0089\62\3\2\2\2\u008a\u008b\7(\2\2\u008b"+
		"\u008c\7(\2\2\u008c\64\3\2\2\2\u008d\u008e\7~\2\2\u008e\u008f\7~\2\2\u008f"+
		"\66\3\2\2\2\u0090\u0091\7#\2\2\u00918\3\2\2\2\u0092\u0094\t\2\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096:\3\2\2\2\u0097\u0099\t\3\2\2\u0098\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b<\3\2\2\2\u009c"+
		"\u009d\7\61\2\2\u009d\u009e\7,\2\2\u009e\u00a2\3\2\2\2\u009f\u00a1\13"+
		"\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7,"+
		"\2\2\u00a6\u00a7\7\61\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\b\37\2\2\u00a9"+
		">\3\2\2\2\u00aa\u00ab\7\61\2\2\u00ab\u00ac\7\61\2\2\u00ac\u00b0\3\2\2"+
		"\2\u00ad\u00af\n\4\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00b4\b \2\2\u00b4@\3\2\2\2\u00b5\u00b7\t\5\2\2\u00b6\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00bb\b!\2\2\u00bbB\3\2\2\2\u00bc\u00bd\13\2\2\2\u00bdD\3\2"+
		"\2\2\b\2\u0095\u009a\u00a2\u00b0\u00b8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}