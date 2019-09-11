// Generated from /Users/f3i/IdeaProjects/antlr/Dhl.g4 by ANTLR 4.7
package SVParser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DhlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, FS=15, NET_STATE=16, 
		PROTO_MSG=17, DB=18, READ=19, WRITE=20, CRASH=21, FINAL=22, TOE=23, HARVEST=24, 
		NAME=25, NEWLINE=26, WS=27;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_obsr = 2, RULE_primitive = 3, RULE_stage = 4, 
		RULE_var = 5, RULE_domain = 6, RULE_pid = 7, RULE_dic = 8;
	public static final String[] ruleNames = {
		"prog", "stat", "obsr", "primitive", "stage", "var", "domain", "pid", 
		"dic"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'then'", "'('", "')'", "')@'", "'->'", "'&'", "'||'", "'$var_'", 
		"'$'", "'fuzzy('", "'::'", "'.'", "'!'", "'fs'", "'net_state'", "'proto_msg'", 
		"'db'", "'read'", "'write'", "'crash'", "'final'", "'toe'", "'harvest'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "FS", "NET_STATE", "PROTO_MSG", "DB", "READ", "WRITE", 
		"CRASH", "FINAL", "TOE", "HARVEST", "NAME", "NEWLINE", "WS"
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

	@Override
	public String getGrammarFileName() { return "Dhl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DhlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewNodeContext extends ProgContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public NewNodeContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).enterNewNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).exitNewNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhlVisitor ) return ((DhlVisitor<? extends T>)visitor).visitNewNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new NewNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				stat();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << READ) | (1L << WRITE) | (1L << CRASH) | (1L << NEWLINE))) != 0) );
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlankContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(DhlParser.NEWLINE, 0); }
		public BlankContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).enterBlank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).exitBlank(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhlVisitor ) return ((DhlVisitor<? extends T>)visitor).visitBlank(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleObsrContext extends StatContext {
		public ObsrContext obsr() {
			return getRuleContext(ObsrContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(DhlParser.NEWLINE, 0); }
		public SingleObsrContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).enterSingleObsr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).exitSingleObsr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhlVisitor ) return ((DhlVisitor<? extends T>)visitor).visitSingleObsr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
			case T__9:
			case T__10:
			case READ:
			case WRITE:
			case CRASH:
				_localctx = new SingleObsrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				obsr(0);
				setState(24);
				match(NEWLINE);
				}
				break;
			case NEWLINE:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(NEWLINE);
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

	public static class ObsrContext extends ParserRuleContext {
		public ObsrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obsr; }
	 
		public ObsrContext() { }
		public void copyFrom(ObsrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrEffectContext extends ObsrContext {
		public List<ObsrContext> obsr() {
			return getRuleContexts(ObsrContext.class);
		}
		public ObsrContext obsr(int i) {
			return getRuleContext(ObsrContext.class,i);
		}
		public OrEffectContext(ObsrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).enterOrEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).exitOrEffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhlVisitor ) return ((DhlVisitor<? extends T>)visitor).visitOrEffect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends ObsrContext {
		public ObsrContext obsr() {
			return getRuleContext(ObsrContext.class,0);
		}
		public ParensContext(ObsrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhlVisitor ) return ((DhlVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndEffectContext extends ObsrContext {
		public List<ObsrContext> obsr() {
			return getRuleContexts(ObsrContext.class);
		}
		public ObsrContext obsr(int i) {
			return getRuleContext(ObsrContext.class,i);
		}
		public AndEffectContext(ObsrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).enterAndEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).exitAndEffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhlVisitor ) return ((DhlVisitor<? extends T>)visitor).visitAndEffect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleEffectContext extends ObsrContext {
		public DomainContext domain() {
			return getRuleContext(DomainContext.class,0);
		}
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public SingleEffectContext(ObsrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).enterSingleEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).exitSingleEffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhlVisitor ) return ((DhlVisitor<? extends T>)visitor).visitSingleEffect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LocalCauseContext extends ObsrContext {
		public List<ObsrContext> obsr() {
			return getRuleContexts(ObsrContext.class);
		}
		public ObsrContext obsr(int i) {
			return getRuleContext(ObsrContext.class,i);
		}
		public LocalCauseContext(ObsrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).enterLocalCause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).exitLocalCause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhlVisitor ) return ((DhlVisitor<? extends T>)visitor).visitLocalCause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttackStageContext extends ObsrContext {
		public ObsrContext obsr() {
			return getRuleContext(ObsrContext.class,0);
		}
		public StageContext stage() {
			return getRuleContext(StageContext.class,0);
		}
		public AttackStageContext(ObsrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).enterAttackStage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).exitAttackStage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhlVisitor ) return ((DhlVisitor<? extends T>)visitor).visitAttackStage(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescContext extends ObsrContext {
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public DescContext(ObsrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).enterDesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).exitDesc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhlVisitor ) return ((DhlVisitor<? extends T>)visitor).visitDesc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObsrContext obsr() throws RecognitionException {
		return obsr(0);
	}

	private ObsrContext obsr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ObsrContext _localctx = new ObsrContext(_ctx, _parentState);
		ObsrContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_obsr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new LocalCauseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(30);
				match(T__0);
				setState(31);
				obsr(0);
				setState(32);
				match(T__1);
				setState(33);
				obsr(7);
				}
				break;
			case 2:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				match(T__2);
				setState(36);
				obsr(0);
				setState(37);
				match(T__3);
				}
				break;
			case 3:
				{
				_localctx = new AttackStageContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				match(T__2);
				setState(40);
				obsr(0);
				setState(41);
				match(T__4);
				setState(42);
				stage();
				}
				break;
			case 4:
				{
				_localctx = new SingleEffectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44);
				domain();
				setState(45);
				match(T__5);
				setState(46);
				primitive();
				}
				break;
			case 5:
				{
				_localctx = new DescContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				primitive();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(57);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new AndEffectContext(new ObsrContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_obsr);
						setState(51);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(52);
						match(T__6);
						setState(53);
						obsr(4);
						}
						break;
					case 2:
						{
						_localctx = new OrEffectContext(new ObsrContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_obsr);
						setState(54);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(55);
						match(T__7);
						setState(56);
						obsr(3);
						}
						break;
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimitiveContext extends ParserRuleContext {
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
	 
		public PrimitiveContext() { }
		public void copyFrom(PrimitiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadVarContext extends PrimitiveContext {
		public TerminalNode READ() { return getToken(DhlParser.READ, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ReadVarContext(PrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).enterReadVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).exitReadVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhlVisitor ) return ((DhlVisitor<? extends T>)visitor).visitReadVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CrashVarContext extends PrimitiveContext {
		public TerminalNode CRASH() { return getToken(DhlParser.CRASH, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public CrashVarContext(PrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).enterCrashVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).exitCrashVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhlVisitor ) return ((DhlVisitor<? extends T>)visitor).visitCrashVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteVarContext extends PrimitiveContext {
		public TerminalNode WRITE() { return getToken(DhlParser.WRITE, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public WriteVarContext(PrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).enterWriteVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).exitWriteVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhlVisitor ) return ((DhlVisitor<? extends T>)visitor).visitWriteVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_primitive);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				_localctx = new ReadVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(READ);
				setState(63);
				var();
				}
				break;
			case WRITE:
				_localctx = new WriteVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(WRITE);
				setState(65);
				var();
				}
				break;
			case CRASH:
				_localctx = new CrashVarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(CRASH);
				setState(67);
				var();
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

	public static class StageContext extends ParserRuleContext {
		public StageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stage; }
	 
		public StageContext() { }
		public void copyFrom(StageContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToeStageContext extends StageContext {
		public TerminalNode TOE() { return getToken(DhlParser.TOE, 0); }
		public ToeStageContext(StageContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).enterToeStage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).exitToeStage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhlVisitor ) return ((DhlVisitor<? extends T>)visitor).visitToeStage(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HarvestStageContext extends StageContext {
		public TerminalNode HARVEST() { return getToken(DhlParser.HARVEST, 0); }
		public HarvestStageContext(StageContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).enterHarvestStage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).exitHarvestStage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhlVisitor ) return ((DhlVisitor<? extends T>)visitor).visitHarvestStage(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FinalStageContext extends StageContext {
		public TerminalNode FINAL() { return getToken(DhlParser.FINAL, 0); }
		public FinalStageContext(StageContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).enterFinalStage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).exitFinalStage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhlVisitor ) return ((DhlVisitor<? extends T>)visitor).visitFinalStage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StageContext stage() throws RecognitionException {
		StageContext _localctx = new StageContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stage);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				_localctx = new FinalStageContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(FINAL);
				}
				break;
			case TOE:
				_localctx = new ToeStageContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(TOE);
				}
				break;
			case HARVEST:
				_localctx = new HarvestStageContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				match(HARVEST);
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

	public static class VarContext extends ParserRuleContext {
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	 
		public VarContext() { }
		public void copyFrom(VarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleVarContext extends VarContext {
		public TerminalNode NAME() { return getToken(DhlParser.NAME, 0); }
		public SingleVarContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).enterSingleVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).exitSingleVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhlVisitor ) return ((DhlVisitor<? extends T>)visitor).visitSingleVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var);
		try {
			_localctx = new SingleVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__8);
			setState(76);
			match(NAME);
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

	public static class DomainContext extends ParserRuleContext {
		public DomainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domain; }
	 
		public DomainContext() { }
		public void copyFrom(DomainContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuzzMatchContext extends DomainContext {
		public DomainContext domain() {
			return getRuleContext(DomainContext.class,0);
		}
		public FuzzMatchContext(DomainContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).enterFuzzMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).exitFuzzMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhlVisitor ) return ((DhlVisitor<? extends T>)visitor).visitFuzzMatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalPathContext extends DomainContext {
		public PidContext pid() {
			return getRuleContext(PidContext.class,0);
		}
		public NormalPathContext(DomainContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).enterNormalPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).exitNormalPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhlVisitor ) return ((DhlVisitor<? extends T>)visitor).visitNormalPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DomainContext domain() throws RecognitionException {
		DomainContext _localctx = new DomainContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_domain);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				_localctx = new NormalPathContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(T__9);
				setState(79);
				pid();
				}
				break;
			case T__10:
				_localctx = new FuzzMatchContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(T__10);
				setState(81);
				domain();
				setState(82);
				match(T__3);
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

	public static class PidContext extends ParserRuleContext {
		public PidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pid; }
	 
		public PidContext() { }
		public void copyFrom(PidContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WebPathContext extends PidContext {
		public TerminalNode NET_STATE() { return getToken(DhlParser.NET_STATE, 0); }
		public DicContext dic() {
			return getRuleContext(DicContext.class,0);
		}
		public WebPathContext(PidContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).enterWebPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).exitWebPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhlVisitor ) return ((DhlVisitor<? extends T>)visitor).visitWebPath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DpPathContext extends PidContext {
		public TerminalNode PROTO_MSG() { return getToken(DhlParser.PROTO_MSG, 0); }
		public DicContext dic() {
			return getRuleContext(DicContext.class,0);
		}
		public DpPathContext(PidContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).enterDpPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).exitDpPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhlVisitor ) return ((DhlVisitor<? extends T>)visitor).visitDpPath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FileSystemPathContext extends PidContext {
		public TerminalNode FS() { return getToken(DhlParser.FS, 0); }
		public DicContext dic() {
			return getRuleContext(DicContext.class,0);
		}
		public FileSystemPathContext(PidContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).enterFileSystemPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).exitFileSystemPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhlVisitor ) return ((DhlVisitor<? extends T>)visitor).visitFileSystemPath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DbPathContext extends PidContext {
		public TerminalNode DB() { return getToken(DhlParser.DB, 0); }
		public DicContext dic() {
			return getRuleContext(DicContext.class,0);
		}
		public DbPathContext(PidContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).enterDbPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).exitDbPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhlVisitor ) return ((DhlVisitor<? extends T>)visitor).visitDbPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PidContext pid() throws RecognitionException {
		PidContext _localctx = new PidContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pid);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FS:
				_localctx = new FileSystemPathContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(FS);
				setState(87);
				match(T__11);
				setState(88);
				dic(0);
				}
				break;
			case NET_STATE:
				_localctx = new WebPathContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(NET_STATE);
				setState(90);
				match(T__11);
				setState(91);
				dic(0);
				}
				break;
			case DB:
				_localctx = new DbPathContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(DB);
				setState(93);
				match(T__11);
				setState(94);
				dic(0);
				}
				break;
			case PROTO_MSG:
				_localctx = new DpPathContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				match(PROTO_MSG);
				setState(96);
				match(T__11);
				setState(97);
				dic(0);
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

	public static class DicContext extends ParserRuleContext {
		public DicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dic; }
	 
		public DicContext() { }
		public void copyFrom(DicContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiPathContext extends DicContext {
		public DicContext dic() {
			return getRuleContext(DicContext.class,0);
		}
		public TerminalNode NAME() { return getToken(DhlParser.NAME, 0); }
		public MultiPathContext(DicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).enterMultiPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).exitMultiPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhlVisitor ) return ((DhlVisitor<? extends T>)visitor).visitMultiPath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotPathContext extends DicContext {
		public DicContext dic() {
			return getRuleContext(DicContext.class,0);
		}
		public NotPathContext(DicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).enterNotPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).exitNotPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhlVisitor ) return ((DhlVisitor<? extends T>)visitor).visitNotPath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RootDicContext extends DicContext {
		public RootDicContext(DicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).enterRootDic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).exitRootDic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhlVisitor ) return ((DhlVisitor<? extends T>)visitor).visitRootDic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SinglePathContext extends DicContext {
		public TerminalNode NAME() { return getToken(DhlParser.NAME, 0); }
		public SinglePathContext(DicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).enterSinglePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DhlListener ) ((DhlListener)listener).exitSinglePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DhlVisitor ) return ((DhlVisitor<? extends T>)visitor).visitSinglePath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DicContext dic() throws RecognitionException {
		return dic(0);
	}

	private DicContext dic(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DicContext _localctx = new DicContext(_ctx, _parentState);
		DicContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_dic, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				{
				_localctx = new RootDicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(101);
				match(T__12);
				}
				break;
			case T__13:
				{
				_localctx = new NotPathContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				match(T__13);
				setState(103);
				dic(3);
				}
				break;
			case NAME:
				{
				_localctx = new SinglePathContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiPathContext(new DicContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_dic);
					setState(107);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(108);
					match(T__12);
					setState(109);
					match(NAME);
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return obsr_sempred((ObsrContext)_localctx, predIndex);
		case 8:
			return dic_sempred((DicContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean obsr_sempred(ObsrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean dic_sempred(DicContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35v\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\3\3\3\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\64\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5G\n\5\3\6\3\6\3\6\5\6L\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bW"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\te\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\5\nl\n\n\3\n\3\n\3\n\7\nq\n\n\f\n\16\nt\13\n\3\n\2\4\6\22"+
		"\13\2\4\6\b\n\f\16\20\22\2\2\2\177\2\25\3\2\2\2\4\35\3\2\2\2\6\63\3\2"+
		"\2\2\bF\3\2\2\2\nK\3\2\2\2\fM\3\2\2\2\16V\3\2\2\2\20d\3\2\2\2\22k\3\2"+
		"\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2"+
		"\2\2\30\3\3\2\2\2\31\32\5\6\4\2\32\33\7\34\2\2\33\36\3\2\2\2\34\36\7\34"+
		"\2\2\35\31\3\2\2\2\35\34\3\2\2\2\36\5\3\2\2\2\37 \b\4\1\2 !\7\3\2\2!\""+
		"\5\6\4\2\"#\7\4\2\2#$\5\6\4\t$\64\3\2\2\2%&\7\5\2\2&\'\5\6\4\2\'(\7\6"+
		"\2\2(\64\3\2\2\2)*\7\5\2\2*+\5\6\4\2+,\7\7\2\2,-\5\n\6\2-\64\3\2\2\2."+
		"/\5\16\b\2/\60\7\b\2\2\60\61\5\b\5\2\61\64\3\2\2\2\62\64\5\b\5\2\63\37"+
		"\3\2\2\2\63%\3\2\2\2\63)\3\2\2\2\63.\3\2\2\2\63\62\3\2\2\2\64=\3\2\2\2"+
		"\65\66\f\5\2\2\66\67\7\t\2\2\67<\5\6\4\689\f\4\2\29:\7\n\2\2:<\5\6\4\5"+
		";\65\3\2\2\2;8\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\7\3\2\2\2?=\3\2"+
		"\2\2@A\7\25\2\2AG\5\f\7\2BC\7\26\2\2CG\5\f\7\2DE\7\27\2\2EG\5\f\7\2F@"+
		"\3\2\2\2FB\3\2\2\2FD\3\2\2\2G\t\3\2\2\2HL\7\30\2\2IL\7\31\2\2JL\7\32\2"+
		"\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2L\13\3\2\2\2MN\7\13\2\2NO\7\33\2\2O\r"+
		"\3\2\2\2PQ\7\f\2\2QW\5\20\t\2RS\7\r\2\2ST\5\16\b\2TU\7\6\2\2UW\3\2\2\2"+
		"VP\3\2\2\2VR\3\2\2\2W\17\3\2\2\2XY\7\21\2\2YZ\7\16\2\2Ze\5\22\n\2[\\\7"+
		"\22\2\2\\]\7\16\2\2]e\5\22\n\2^_\7\24\2\2_`\7\16\2\2`e\5\22\n\2ab\7\23"+
		"\2\2bc\7\16\2\2ce\5\22\n\2dX\3\2\2\2d[\3\2\2\2d^\3\2\2\2da\3\2\2\2e\21"+
		"\3\2\2\2fg\b\n\1\2gl\7\17\2\2hi\7\20\2\2il\5\22\n\5jl\7\33\2\2kf\3\2\2"+
		"\2kh\3\2\2\2kj\3\2\2\2lr\3\2\2\2mn\f\4\2\2no\7\17\2\2oq\7\33\2\2pm\3\2"+
		"\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\23\3\2\2\2tr\3\2\2\2\r\27\35\63;="+
		"FKVdkr";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}