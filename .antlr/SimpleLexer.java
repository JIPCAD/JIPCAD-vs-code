// Generated from d:\DEV_JIPCAD\vscode_extension\nome3language\C_sharplanguage.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, WHILE=21, BOOL_OPERATOR=22, INTEGER=23, 
		FLOAT=24, STRING=25, BOOL=26, NULL=27, WS=28, IDENTIFIER=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "WHILE", "BOOL_OPERATOR", "INTEGER", "FLOAT", 
			"STRING", "BOOL", "NULL", "WS", "IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'if'", "'else'", "'*'", "'{'", "'}'", "','", "')'", "'('", 
			"'!'", "'/'", "'%'", "'+'", "'-'", "'=='", "'!='", "'>'", "'<'", "'>='", 
			"'<='", null, null, null, null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "WHILE", "BOOL_OPERATOR", 
			"INTEGER", "FLOAT", "STRING", "BOOL", "NULL", "WS", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public SimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "C_sharplanguage.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00c5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26x\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u0082\n\27\3\30\6\30\u0085\n\30\r\30\16\30\u0086"+
		"\3\31\6\31\u008a\n\31\r\31\16\31\u008b\3\31\3\31\7\31\u0090\n\31\f\31"+
		"\16\31\u0093\13\31\3\32\3\32\7\32\u0097\n\32\f\32\16\32\u009a\13\32\3"+
		"\32\3\32\3\32\7\32\u009f\n\32\f\32\16\32\u00a2\13\32\3\32\5\32\u00a5\n"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00b0\n\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\7\35\u00b8\n\35\f\35\16\35\u00bb\13\35\3\35"+
		"\3\35\3\36\3\36\7\36\u00c1\n\36\f\36\16\36\u00c4\13\36\2\2\37\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37\3\2\b\3"+
		"\2\62;\3\2$$\3\2))\4\2\13\f\17\17\5\2C\\aac|\5\2\62;C\\c|\2\u00d0\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\3=\3\2\2\2\5?\3\2\2\2\7B\3\2\2\2\tG\3\2\2\2\13I\3\2\2\2\rK\3\2\2\2"+
		"\17M\3\2\2\2\21O\3\2\2\2\23Q\3\2\2\2\25S\3\2\2\2\27U\3\2\2\2\31W\3\2\2"+
		"\2\33Y\3\2\2\2\35[\3\2\2\2\37]\3\2\2\2!`\3\2\2\2#c\3\2\2\2%e\3\2\2\2\'"+
		"g\3\2\2\2)j\3\2\2\2+w\3\2\2\2-\u0081\3\2\2\2/\u0084\3\2\2\2\61\u0089\3"+
		"\2\2\2\63\u00a4\3\2\2\2\65\u00af\3\2\2\2\67\u00b1\3\2\2\29\u00b9\3\2\2"+
		"\2;\u00be\3\2\2\2=>\7=\2\2>\4\3\2\2\2?@\7k\2\2@A\7h\2\2A\6\3\2\2\2BC\7"+
		"g\2\2CD\7n\2\2DE\7u\2\2EF\7g\2\2F\b\3\2\2\2GH\7,\2\2H\n\3\2\2\2IJ\7}\2"+
		"\2J\f\3\2\2\2KL\7\177\2\2L\16\3\2\2\2MN\7.\2\2N\20\3\2\2\2OP\7+\2\2P\22"+
		"\3\2\2\2QR\7*\2\2R\24\3\2\2\2ST\7#\2\2T\26\3\2\2\2UV\7\61\2\2V\30\3\2"+
		"\2\2WX\7\'\2\2X\32\3\2\2\2YZ\7-\2\2Z\34\3\2\2\2[\\\7/\2\2\\\36\3\2\2\2"+
		"]^\7?\2\2^_\7?\2\2_ \3\2\2\2`a\7#\2\2ab\7?\2\2b\"\3\2\2\2cd\7@\2\2d$\3"+
		"\2\2\2ef\7>\2\2f&\3\2\2\2gh\7@\2\2hi\7?\2\2i(\3\2\2\2jk\7>\2\2kl\7?\2"+
		"\2l*\3\2\2\2mn\7y\2\2no\7j\2\2op\7k\2\2pq\7n\2\2qx\7g\2\2rs\7w\2\2st\7"+
		"p\2\2tu\7v\2\2uv\7k\2\2vx\7n\2\2wm\3\2\2\2wr\3\2\2\2x,\3\2\2\2yz\7c\2"+
		"\2z{\7p\2\2{\u0082\7f\2\2|}\7q\2\2}\u0082\7t\2\2~\177\7z\2\2\177\u0080"+
		"\7q\2\2\u0080\u0082\7t\2\2\u0081y\3\2\2\2\u0081|\3\2\2\2\u0081~\3\2\2"+
		"\2\u0082.\3\2\2\2\u0083\u0085\t\2\2\2\u0084\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\60\3\2\2\2\u0088"+
		"\u008a\t\2\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0091\7\60\2\2\u008e"+
		"\u0090\t\2\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\62\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0098"+
		"\7$\2\2\u0095\u0097\n\3\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009b\u00a5\7$\2\2\u009c\u00a0\7)\2\2\u009d\u009f\n\4\2\2\u009e\u009d"+
		"\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\7)\2\2\u00a4\u0094\3\2"+
		"\2\2\u00a4\u009c\3\2\2\2\u00a5\64\3\2\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8"+
		"\7t\2\2\u00a8\u00a9\7w\2\2\u00a9\u00b0\7g\2\2\u00aa\u00ab\7h\2\2\u00ab"+
		"\u00ac\7c\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7u\2\2\u00ae\u00b0\7g\2\2"+
		"\u00af\u00a6\3\2\2\2\u00af\u00aa\3\2\2\2\u00b0\66\3\2\2\2\u00b1\u00b2"+
		"\7p\2\2\u00b2\u00b3\7w\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7n\2\2\u00b5"+
		"8\3\2\2\2\u00b6\u00b8\t\5\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2"+
		"\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bc\u00bd\b\35\2\2\u00bd:\3\2\2\2\u00be\u00c2\t\6\2\2\u00bf"+
		"\u00c1\t\7\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3<\3\2\2\2\u00c4\u00c2\3\2\2\2\16\2w\u0081"+
		"\u0086\u008b\u0091\u0098\u00a0\u00a4\u00af\u00b9\u00c2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}