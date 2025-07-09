// Generated from d:/Documentos/REPL-with-ANTLR/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, VAR=8, INT=9, 
		WS=10;
	public static final int
		RULE_prog = 0, RULE_expr = 1, RULE_term = 2, RULE_fact = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expr", "term", "fact"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "VAR", "INT", "WS"
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

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ExprParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			setState(12);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(8);
				match(VAR);
				setState(9);
				match(T__0);
				setState(10);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			term();
			setState(19);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(15);
				match(T__1);
				setState(16);
				expr();
				}
				break;
			case T__2:
				{
				setState(17);
				match(T__2);
				setState(18);
				expr();
				}
				break;
			case EOF:
			case T__6:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			fact();
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(22);
				match(T__3);
				setState(23);
				term();
				}
				break;
			case T__4:
				{
				setState(24);
				match(T__4);
				setState(25);
				term();
				}
				break;
			case EOF:
			case T__1:
			case T__2:
			case T__6:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TerminalNode VAR() { return getToken(ExprParser.VAR, 0); }
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fact);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(T__5);
				setState(29);
				expr();
				setState(30);
				match(T__6);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				match(INT);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				match(VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\n%\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\r\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0014\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u001b\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003#\b\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006"+
		"\u0000\u0000\'\u0000\f\u0001\u0000\u0000\u0000\u0002\u000e\u0001\u0000"+
		"\u0000\u0000\u0004\u0015\u0001\u0000\u0000\u0000\u0006\"\u0001\u0000\u0000"+
		"\u0000\b\t\u0005\b\u0000\u0000\t\n\u0005\u0001\u0000\u0000\n\r\u0003\u0002"+
		"\u0001\u0000\u000b\r\u0003\u0002\u0001\u0000\f\b\u0001\u0000\u0000\u0000"+
		"\f\u000b\u0001\u0000\u0000\u0000\r\u0001\u0001\u0000\u0000\u0000\u000e"+
		"\u0013\u0003\u0004\u0002\u0000\u000f\u0010\u0005\u0002\u0000\u0000\u0010"+
		"\u0014\u0003\u0002\u0001\u0000\u0011\u0012\u0005\u0003\u0000\u0000\u0012"+
		"\u0014\u0003\u0002\u0001\u0000\u0013\u000f\u0001\u0000\u0000\u0000\u0013"+
		"\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014"+
		"\u0003\u0001\u0000\u0000\u0000\u0015\u001a\u0003\u0006\u0003\u0000\u0016"+
		"\u0017\u0005\u0004\u0000\u0000\u0017\u001b\u0003\u0004\u0002\u0000\u0018"+
		"\u0019\u0005\u0005\u0000\u0000\u0019\u001b\u0003\u0004\u0002\u0000\u001a"+
		"\u0016\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a"+
		"\u001b\u0001\u0000\u0000\u0000\u001b\u0005\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0005\u0006\u0000\u0000\u001d\u001e\u0003\u0002\u0001\u0000\u001e"+
		"\u001f\u0005\u0007\u0000\u0000\u001f#\u0001\u0000\u0000\u0000 #\u0005"+
		"\t\u0000\u0000!#\u0005\b\u0000\u0000\"\u001c\u0001\u0000\u0000\u0000\""+
		" \u0001\u0000\u0000\u0000\"!\u0001\u0000\u0000\u0000#\u0007\u0001\u0000"+
		"\u0000\u0000\u0004\f\u0013\u001a\"";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}