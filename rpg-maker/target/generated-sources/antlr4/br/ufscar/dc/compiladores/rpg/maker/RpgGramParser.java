// Generated from br\u005Cufscar\dc\compiladores\rpg\maker\RpgGram.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.rpg.maker;

  import br.ufscar.dc.compiladores.rpg.maker.File;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RpgGramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, PalavrasChave=38, 
		Delimitador=39, Abre=40, Fecha=41, Virgula=42, Nome=43, Nivel=44, Mana=45, 
		EncantamentoAtaque=46, EncantamentoCura=47, EncantamentoFuga=48, EncantamentoDefesa=49, 
		Comentario=50, WhiteSpace=51, ErroComentario=52, ANY=53;
	public static final int
		RULE_programa = 0, RULE_corpo = 1, RULE_declaracao_local = 2, RULE_classe = 3, 
		RULE_status = 4, RULE_cmd = 5, RULE_cmdAtaque = 6, RULE_cmdDefenda = 7, 
		RULE_cmdFuja = 8, RULE_cmdCure = 9, RULE_encantamentoAtaque = 10, RULE_encantamentoDefesa = 11, 
		RULE_encantamentoFuga = 12, RULE_encantamentoCura = 13, RULE_encantamentoAtaqueAnimago = 14, 
		RULE_encantamentoDefesaAnimago = 15, RULE_encantamentoFugaAnimago = 16, 
		RULE_encantamentoCuraAnimago = 17, RULE_encantamentoAtaqueEspadachim = 18, 
		RULE_encantamentoDefesaEspadachim = 19, RULE_encantamentoFugaEspadachim = 20, 
		RULE_encantamentoCuraEspadachim = 21, RULE_encantamentoAtaqueNecromante = 22, 
		RULE_encantamentoDefesaNecromante = 23, RULE_encantamentoFugaNecromante = 24, 
		RULE_encantamentoCuraNecromante = 25, RULE_encantamentoAtaquePaladino = 26, 
		RULE_encantamentoDefesaPaladino = 27, RULE_encantamentoFugaPaladino = 28, 
		RULE_encantamentoCuraPaladino = 29, RULE_encantamentoAtaqueBardo = 30, 
		RULE_encantamentoDefesaBardo = 31, RULE_encantamentoFugaBardo = 32, RULE_encantamentoCuraBardo = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "corpo", "declaracao_local", "classe", "status", "cmd", "cmdAtaque", 
			"cmdDefenda", "cmdFuja", "cmdCure", "encantamentoAtaque", "encantamentoDefesa", 
			"encantamentoFuga", "encantamentoCura", "encantamentoAtaqueAnimago", 
			"encantamentoDefesaAnimago", "encantamentoFugaAnimago", "encantamentoCuraAnimago", 
			"encantamentoAtaqueEspadachim", "encantamentoDefesaEspadachim", "encantamentoFugaEspadachim", 
			"encantamentoCuraEspadachim", "encantamentoAtaqueNecromante", "encantamentoDefesaNecromante", 
			"encantamentoFugaNecromante", "encantamentoCuraNecromante", "encantamentoAtaquePaladino", 
			"encantamentoDefesaPaladino", "encantamentoFugaPaladino", "encantamentoCuraPaladino", 
			"encantamentoAtaqueBardo", "encantamentoDefesaBardo", "encantamentoFugaBardo", 
			"encantamentoCuraBardo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio'", "'level'", "'especial'", "'fim'", "'animago'", "'espadachim'", 
			"'necromante'", "'bardo'", "'Paladino'", "'sim'", "'nao'", "'Ataque'", 
			"'('", "')'", "'Defenda'", "'Fuga'", "'Cure'", "'AtaqueAnimago'", "'DefesaAnimago'", 
			"'FugaAnimago'", "'CuraAnimago'", "'AtaqueEspadachim'", "'DefesaEspadachim'", 
			"'FugaEspadachim'", "'CuraEspadachim'", "'AtaqueNecromante'", "'DefesaNecromante'", 
			"'FugaNecromante'", "'CuraNecromante'", "'AtaquePaladino'", "'DefesaPaladino'", 
			"'FugaPaladino'", "'CuraPaladino'", "'AtaqueBardo'", "'DefesaBardo'", 
			"'FugaBardo'", "'CuraBardo'", null, "':'", null, null, "','", null, null, 
			null, null, null, null, null, null, null, "'/*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "PalavrasChave", "Delimitador", "Abre", "Fecha", "Virgula", 
			"Nome", "Nivel", "Mana", "EncantamentoAtaque", "EncantamentoCura", "EncantamentoFuga", 
			"EncantamentoDefesa", "Comentario", "WhiteSpace", "ErroComentario", "ANY"
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
	public String getGrammarFileName() { return "RpgGram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RpgGramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			corpo();
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

	public static class CorpoContext extends ParserRuleContext {
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				declaracao_local();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) {
				{
				{
				setState(75);
				cmd();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Declaracao_localContext extends ParserRuleContext {
		public TerminalNode Nome() { return getToken(RpgGramParser.Nome, 0); }
		public List<TerminalNode> Delimitador() { return getTokens(RpgGramParser.Delimitador); }
		public TerminalNode Delimitador(int i) {
			return getToken(RpgGramParser.Delimitador, i);
		}
		public ClasseContext classe() {
			return getRuleContext(ClasseContext.class,0);
		}
		public TerminalNode Nivel() { return getToken(RpgGramParser.Nivel, 0); }
		public StatusContext status() {
			return getRuleContext(StatusContext.class,0);
		}
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterDeclaracao_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitDeclaracao_local(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitDeclaracao_local(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao_local);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__0);
			setState(82);
			match(Nome);
			setState(83);
			match(Delimitador);
			setState(84);
			classe();
			setState(85);
			match(Nivel);
			setState(86);
			match(Delimitador);
			setState(87);
			match(T__1);
			setState(88);
			status();
			setState(89);
			match(Delimitador);
			setState(90);
			match(T__2);
			setState(91);
			match(T__3);
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

	public static class ClasseContext extends ParserRuleContext {
		public ClasseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterClasse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitClasse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitClasse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClasseContext classe() throws RecognitionException {
		ClasseContext _localctx = new ClasseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class StatusContext extends ParserRuleContext {
		public StatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_status; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterStatus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitStatus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitStatus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatusContext status() throws RecognitionException {
		StatusContext _localctx = new StatusContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_status);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class CmdContext extends ParserRuleContext {
		public CmdAtaqueContext cmdAtaque() {
			return getRuleContext(CmdAtaqueContext.class,0);
		}
		public CmdDefendaContext cmdDefenda() {
			return getRuleContext(CmdDefendaContext.class,0);
		}
		public CmdFujaContext cmdFuja() {
			return getRuleContext(CmdFujaContext.class,0);
		}
		public CmdCureContext cmdCure() {
			return getRuleContext(CmdCureContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				cmdAtaque();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				cmdDefenda();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				cmdFuja();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				cmdCure();
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

	public static class CmdAtaqueContext extends ParserRuleContext {
		public TerminalNode Nome() { return getToken(RpgGramParser.Nome, 0); }
		public List<TerminalNode> Virgula() { return getTokens(RpgGramParser.Virgula); }
		public TerminalNode Virgula(int i) {
			return getToken(RpgGramParser.Virgula, i);
		}
		public List<EncantamentoAtaqueContext> encantamentoAtaque() {
			return getRuleContexts(EncantamentoAtaqueContext.class);
		}
		public EncantamentoAtaqueContext encantamentoAtaque(int i) {
			return getRuleContext(EncantamentoAtaqueContext.class,i);
		}
		public CmdAtaqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtaque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterCmdAtaque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitCmdAtaque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitCmdAtaque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdAtaqueContext cmdAtaque() throws RecognitionException {
		CmdAtaqueContext _localctx = new CmdAtaqueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdAtaque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__11);
			setState(104);
			match(T__12);
			setState(105);
			match(Nome);
			setState(108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106);
				match(Virgula);
				setState(107);
				encantamentoAtaque();
				}
				}
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Virgula );
			setState(112);
			match(T__13);
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

	public static class CmdDefendaContext extends ParserRuleContext {
		public TerminalNode Nome() { return getToken(RpgGramParser.Nome, 0); }
		public List<TerminalNode> Virgula() { return getTokens(RpgGramParser.Virgula); }
		public TerminalNode Virgula(int i) {
			return getToken(RpgGramParser.Virgula, i);
		}
		public List<EncantamentoDefesaContext> encantamentoDefesa() {
			return getRuleContexts(EncantamentoDefesaContext.class);
		}
		public EncantamentoDefesaContext encantamentoDefesa(int i) {
			return getRuleContext(EncantamentoDefesaContext.class,i);
		}
		public CmdDefendaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdDefenda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterCmdDefenda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitCmdDefenda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitCmdDefenda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdDefendaContext cmdDefenda() throws RecognitionException {
		CmdDefendaContext _localctx = new CmdDefendaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdDefenda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__14);
			setState(115);
			match(T__12);
			setState(116);
			match(Nome);
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(117);
				match(Virgula);
				setState(118);
				encantamentoDefesa();
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Virgula );
			setState(123);
			match(T__13);
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

	public static class CmdFujaContext extends ParserRuleContext {
		public TerminalNode Nome() { return getToken(RpgGramParser.Nome, 0); }
		public List<TerminalNode> Virgula() { return getTokens(RpgGramParser.Virgula); }
		public TerminalNode Virgula(int i) {
			return getToken(RpgGramParser.Virgula, i);
		}
		public List<EncantamentoFugaContext> encantamentoFuga() {
			return getRuleContexts(EncantamentoFugaContext.class);
		}
		public EncantamentoFugaContext encantamentoFuga(int i) {
			return getRuleContext(EncantamentoFugaContext.class,i);
		}
		public CmdFujaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFuja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterCmdFuja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitCmdFuja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitCmdFuja(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdFujaContext cmdFuja() throws RecognitionException {
		CmdFujaContext _localctx = new CmdFujaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdFuja);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__15);
			setState(126);
			match(T__12);
			setState(127);
			match(Nome);
			setState(130); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128);
				match(Virgula);
				setState(129);
				encantamentoFuga();
				}
				}
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Virgula );
			setState(134);
			match(T__13);
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

	public static class CmdCureContext extends ParserRuleContext {
		public TerminalNode Nome() { return getToken(RpgGramParser.Nome, 0); }
		public List<TerminalNode> Virgula() { return getTokens(RpgGramParser.Virgula); }
		public TerminalNode Virgula(int i) {
			return getToken(RpgGramParser.Virgula, i);
		}
		public List<EncantamentoCuraContext> encantamentoCura() {
			return getRuleContexts(EncantamentoCuraContext.class);
		}
		public EncantamentoCuraContext encantamentoCura(int i) {
			return getRuleContext(EncantamentoCuraContext.class,i);
		}
		public CmdCureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterCmdCure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitCmdCure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitCmdCure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdCureContext cmdCure() throws RecognitionException {
		CmdCureContext _localctx = new CmdCureContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdCure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__16);
			setState(137);
			match(T__12);
			setState(138);
			match(Nome);
			setState(141); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(139);
				match(Virgula);
				setState(140);
				encantamentoCura();
				}
				}
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Virgula );
			setState(145);
			match(T__13);
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

	public static class EncantamentoAtaqueContext extends ParserRuleContext {
		public EncantamentoAtaqueAnimagoContext encantamentoAtaqueAnimago() {
			return getRuleContext(EncantamentoAtaqueAnimagoContext.class,0);
		}
		public EncantamentoAtaqueEspadachimContext encantamentoAtaqueEspadachim() {
			return getRuleContext(EncantamentoAtaqueEspadachimContext.class,0);
		}
		public EncantamentoAtaqueNecromanteContext encantamentoAtaqueNecromante() {
			return getRuleContext(EncantamentoAtaqueNecromanteContext.class,0);
		}
		public EncantamentoAtaqueBardoContext encantamentoAtaqueBardo() {
			return getRuleContext(EncantamentoAtaqueBardoContext.class,0);
		}
		public EncantamentoAtaquePaladinoContext encantamentoAtaquePaladino() {
			return getRuleContext(EncantamentoAtaquePaladinoContext.class,0);
		}
		public EncantamentoAtaqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encantamentoAtaque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterEncantamentoAtaque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitEncantamentoAtaque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitEncantamentoAtaque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncantamentoAtaqueContext encantamentoAtaque() throws RecognitionException {
		EncantamentoAtaqueContext _localctx = new EncantamentoAtaqueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_encantamentoAtaque);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				encantamentoAtaqueAnimago();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				encantamentoAtaqueEspadachim();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				encantamentoAtaqueNecromante();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				encantamentoAtaqueBardo();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				encantamentoAtaquePaladino();
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

	public static class EncantamentoDefesaContext extends ParserRuleContext {
		public EncantamentoDefesaAnimagoContext encantamentoDefesaAnimago() {
			return getRuleContext(EncantamentoDefesaAnimagoContext.class,0);
		}
		public EncantamentoDefesaEspadachimContext encantamentoDefesaEspadachim() {
			return getRuleContext(EncantamentoDefesaEspadachimContext.class,0);
		}
		public EncantamentoDefesaNecromanteContext encantamentoDefesaNecromante() {
			return getRuleContext(EncantamentoDefesaNecromanteContext.class,0);
		}
		public EncantamentoDefesaBardoContext encantamentoDefesaBardo() {
			return getRuleContext(EncantamentoDefesaBardoContext.class,0);
		}
		public EncantamentoDefesaPaladinoContext encantamentoDefesaPaladino() {
			return getRuleContext(EncantamentoDefesaPaladinoContext.class,0);
		}
		public EncantamentoDefesaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encantamentoDefesa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterEncantamentoDefesa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitEncantamentoDefesa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitEncantamentoDefesa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncantamentoDefesaContext encantamentoDefesa() throws RecognitionException {
		EncantamentoDefesaContext _localctx = new EncantamentoDefesaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_encantamentoDefesa);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				encantamentoDefesaAnimago();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				encantamentoDefesaEspadachim();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				encantamentoDefesaNecromante();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				encantamentoDefesaBardo();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				encantamentoDefesaPaladino();
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

	public static class EncantamentoFugaContext extends ParserRuleContext {
		public EncantamentoFugaAnimagoContext encantamentoFugaAnimago() {
			return getRuleContext(EncantamentoFugaAnimagoContext.class,0);
		}
		public EncantamentoFugaEspadachimContext encantamentoFugaEspadachim() {
			return getRuleContext(EncantamentoFugaEspadachimContext.class,0);
		}
		public EncantamentoFugaNecromanteContext encantamentoFugaNecromante() {
			return getRuleContext(EncantamentoFugaNecromanteContext.class,0);
		}
		public EncantamentoFugaBardoContext encantamentoFugaBardo() {
			return getRuleContext(EncantamentoFugaBardoContext.class,0);
		}
		public EncantamentoFugaPaladinoContext encantamentoFugaPaladino() {
			return getRuleContext(EncantamentoFugaPaladinoContext.class,0);
		}
		public EncantamentoFugaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encantamentoFuga; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterEncantamentoFuga(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitEncantamentoFuga(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitEncantamentoFuga(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncantamentoFugaContext encantamentoFuga() throws RecognitionException {
		EncantamentoFugaContext _localctx = new EncantamentoFugaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_encantamentoFuga);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				encantamentoFugaAnimago();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				encantamentoFugaEspadachim();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				encantamentoFugaNecromante();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				encantamentoFugaBardo();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				encantamentoFugaPaladino();
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

	public static class EncantamentoCuraContext extends ParserRuleContext {
		public EncantamentoCuraAnimagoContext encantamentoCuraAnimago() {
			return getRuleContext(EncantamentoCuraAnimagoContext.class,0);
		}
		public EncantamentoCuraEspadachimContext encantamentoCuraEspadachim() {
			return getRuleContext(EncantamentoCuraEspadachimContext.class,0);
		}
		public EncantamentoCuraNecromanteContext encantamentoCuraNecromante() {
			return getRuleContext(EncantamentoCuraNecromanteContext.class,0);
		}
		public EncantamentoCuraBardoContext encantamentoCuraBardo() {
			return getRuleContext(EncantamentoCuraBardoContext.class,0);
		}
		public EncantamentoCuraPaladinoContext encantamentoCuraPaladino() {
			return getRuleContext(EncantamentoCuraPaladinoContext.class,0);
		}
		public EncantamentoCuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encantamentoCura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterEncantamentoCura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitEncantamentoCura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitEncantamentoCura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncantamentoCuraContext encantamentoCura() throws RecognitionException {
		EncantamentoCuraContext _localctx = new EncantamentoCuraContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_encantamentoCura);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				encantamentoCuraAnimago();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				encantamentoCuraEspadachim();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				encantamentoCuraNecromante();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				encantamentoCuraBardo();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				encantamentoCuraPaladino();
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

	public static class EncantamentoAtaqueAnimagoContext extends ParserRuleContext {
		public EncantamentoAtaqueAnimagoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encantamentoAtaqueAnimago; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterEncantamentoAtaqueAnimago(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitEncantamentoAtaqueAnimago(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitEncantamentoAtaqueAnimago(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncantamentoAtaqueAnimagoContext encantamentoAtaqueAnimago() throws RecognitionException {
		EncantamentoAtaqueAnimagoContext _localctx = new EncantamentoAtaqueAnimagoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_encantamentoAtaqueAnimago);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__17);
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

	public static class EncantamentoDefesaAnimagoContext extends ParserRuleContext {
		public EncantamentoDefesaAnimagoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encantamentoDefesaAnimago; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterEncantamentoDefesaAnimago(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitEncantamentoDefesaAnimago(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitEncantamentoDefesaAnimago(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncantamentoDefesaAnimagoContext encantamentoDefesaAnimago() throws RecognitionException {
		EncantamentoDefesaAnimagoContext _localctx = new EncantamentoDefesaAnimagoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_encantamentoDefesaAnimago);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__18);
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

	public static class EncantamentoFugaAnimagoContext extends ParserRuleContext {
		public EncantamentoFugaAnimagoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encantamentoFugaAnimago; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterEncantamentoFugaAnimago(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitEncantamentoFugaAnimago(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitEncantamentoFugaAnimago(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncantamentoFugaAnimagoContext encantamentoFugaAnimago() throws RecognitionException {
		EncantamentoFugaAnimagoContext _localctx = new EncantamentoFugaAnimagoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_encantamentoFugaAnimago);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__19);
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

	public static class EncantamentoCuraAnimagoContext extends ParserRuleContext {
		public EncantamentoCuraAnimagoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encantamentoCuraAnimago; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterEncantamentoCuraAnimago(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitEncantamentoCuraAnimago(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitEncantamentoCuraAnimago(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncantamentoCuraAnimagoContext encantamentoCuraAnimago() throws RecognitionException {
		EncantamentoCuraAnimagoContext _localctx = new EncantamentoCuraAnimagoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_encantamentoCuraAnimago);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__20);
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

	public static class EncantamentoAtaqueEspadachimContext extends ParserRuleContext {
		public EncantamentoAtaqueEspadachimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encantamentoAtaqueEspadachim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterEncantamentoAtaqueEspadachim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitEncantamentoAtaqueEspadachim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitEncantamentoAtaqueEspadachim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncantamentoAtaqueEspadachimContext encantamentoAtaqueEspadachim() throws RecognitionException {
		EncantamentoAtaqueEspadachimContext _localctx = new EncantamentoAtaqueEspadachimContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_encantamentoAtaqueEspadachim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__21);
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

	public static class EncantamentoDefesaEspadachimContext extends ParserRuleContext {
		public EncantamentoDefesaEspadachimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encantamentoDefesaEspadachim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterEncantamentoDefesaEspadachim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitEncantamentoDefesaEspadachim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitEncantamentoDefesaEspadachim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncantamentoDefesaEspadachimContext encantamentoDefesaEspadachim() throws RecognitionException {
		EncantamentoDefesaEspadachimContext _localctx = new EncantamentoDefesaEspadachimContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_encantamentoDefesaEspadachim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__22);
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

	public static class EncantamentoFugaEspadachimContext extends ParserRuleContext {
		public EncantamentoFugaEspadachimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encantamentoFugaEspadachim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterEncantamentoFugaEspadachim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitEncantamentoFugaEspadachim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitEncantamentoFugaEspadachim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncantamentoFugaEspadachimContext encantamentoFugaEspadachim() throws RecognitionException {
		EncantamentoFugaEspadachimContext _localctx = new EncantamentoFugaEspadachimContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_encantamentoFugaEspadachim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__23);
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

	public static class EncantamentoCuraEspadachimContext extends ParserRuleContext {
		public EncantamentoCuraEspadachimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encantamentoCuraEspadachim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterEncantamentoCuraEspadachim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitEncantamentoCuraEspadachim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitEncantamentoCuraEspadachim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncantamentoCuraEspadachimContext encantamentoCuraEspadachim() throws RecognitionException {
		EncantamentoCuraEspadachimContext _localctx = new EncantamentoCuraEspadachimContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_encantamentoCuraEspadachim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__24);
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

	public static class EncantamentoAtaqueNecromanteContext extends ParserRuleContext {
		public EncantamentoAtaqueNecromanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encantamentoAtaqueNecromante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterEncantamentoAtaqueNecromante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitEncantamentoAtaqueNecromante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitEncantamentoAtaqueNecromante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncantamentoAtaqueNecromanteContext encantamentoAtaqueNecromante() throws RecognitionException {
		EncantamentoAtaqueNecromanteContext _localctx = new EncantamentoAtaqueNecromanteContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_encantamentoAtaqueNecromante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__25);
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

	public static class EncantamentoDefesaNecromanteContext extends ParserRuleContext {
		public EncantamentoDefesaNecromanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encantamentoDefesaNecromante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterEncantamentoDefesaNecromante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitEncantamentoDefesaNecromante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitEncantamentoDefesaNecromante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncantamentoDefesaNecromanteContext encantamentoDefesaNecromante() throws RecognitionException {
		EncantamentoDefesaNecromanteContext _localctx = new EncantamentoDefesaNecromanteContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_encantamentoDefesaNecromante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__26);
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

	public static class EncantamentoFugaNecromanteContext extends ParserRuleContext {
		public EncantamentoFugaNecromanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encantamentoFugaNecromante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterEncantamentoFugaNecromante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitEncantamentoFugaNecromante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitEncantamentoFugaNecromante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncantamentoFugaNecromanteContext encantamentoFugaNecromante() throws RecognitionException {
		EncantamentoFugaNecromanteContext _localctx = new EncantamentoFugaNecromanteContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_encantamentoFugaNecromante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__27);
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

	public static class EncantamentoCuraNecromanteContext extends ParserRuleContext {
		public EncantamentoCuraNecromanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encantamentoCuraNecromante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterEncantamentoCuraNecromante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitEncantamentoCuraNecromante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitEncantamentoCuraNecromante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncantamentoCuraNecromanteContext encantamentoCuraNecromante() throws RecognitionException {
		EncantamentoCuraNecromanteContext _localctx = new EncantamentoCuraNecromanteContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_encantamentoCuraNecromante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__28);
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

	public static class EncantamentoAtaquePaladinoContext extends ParserRuleContext {
		public EncantamentoAtaquePaladinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encantamentoAtaquePaladino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterEncantamentoAtaquePaladino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitEncantamentoAtaquePaladino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitEncantamentoAtaquePaladino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncantamentoAtaquePaladinoContext encantamentoAtaquePaladino() throws RecognitionException {
		EncantamentoAtaquePaladinoContext _localctx = new EncantamentoAtaquePaladinoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_encantamentoAtaquePaladino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__29);
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

	public static class EncantamentoDefesaPaladinoContext extends ParserRuleContext {
		public EncantamentoDefesaPaladinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encantamentoDefesaPaladino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterEncantamentoDefesaPaladino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitEncantamentoDefesaPaladino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitEncantamentoDefesaPaladino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncantamentoDefesaPaladinoContext encantamentoDefesaPaladino() throws RecognitionException {
		EncantamentoDefesaPaladinoContext _localctx = new EncantamentoDefesaPaladinoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_encantamentoDefesaPaladino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__30);
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

	public static class EncantamentoFugaPaladinoContext extends ParserRuleContext {
		public EncantamentoFugaPaladinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encantamentoFugaPaladino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterEncantamentoFugaPaladino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitEncantamentoFugaPaladino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitEncantamentoFugaPaladino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncantamentoFugaPaladinoContext encantamentoFugaPaladino() throws RecognitionException {
		EncantamentoFugaPaladinoContext _localctx = new EncantamentoFugaPaladinoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_encantamentoFugaPaladino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__31);
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

	public static class EncantamentoCuraPaladinoContext extends ParserRuleContext {
		public EncantamentoCuraPaladinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encantamentoCuraPaladino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterEncantamentoCuraPaladino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitEncantamentoCuraPaladino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitEncantamentoCuraPaladino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncantamentoCuraPaladinoContext encantamentoCuraPaladino() throws RecognitionException {
		EncantamentoCuraPaladinoContext _localctx = new EncantamentoCuraPaladinoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_encantamentoCuraPaladino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__32);
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

	public static class EncantamentoAtaqueBardoContext extends ParserRuleContext {
		public EncantamentoAtaqueBardoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encantamentoAtaqueBardo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterEncantamentoAtaqueBardo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitEncantamentoAtaqueBardo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitEncantamentoAtaqueBardo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncantamentoAtaqueBardoContext encantamentoAtaqueBardo() throws RecognitionException {
		EncantamentoAtaqueBardoContext _localctx = new EncantamentoAtaqueBardoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_encantamentoAtaqueBardo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__33);
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

	public static class EncantamentoDefesaBardoContext extends ParserRuleContext {
		public EncantamentoDefesaBardoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encantamentoDefesaBardo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterEncantamentoDefesaBardo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitEncantamentoDefesaBardo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitEncantamentoDefesaBardo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncantamentoDefesaBardoContext encantamentoDefesaBardo() throws RecognitionException {
		EncantamentoDefesaBardoContext _localctx = new EncantamentoDefesaBardoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_encantamentoDefesaBardo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__34);
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

	public static class EncantamentoFugaBardoContext extends ParserRuleContext {
		public EncantamentoFugaBardoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encantamentoFugaBardo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterEncantamentoFugaBardo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitEncantamentoFugaBardo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitEncantamentoFugaBardo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncantamentoFugaBardoContext encantamentoFugaBardo() throws RecognitionException {
		EncantamentoFugaBardoContext _localctx = new EncantamentoFugaBardoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_encantamentoFugaBardo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__35);
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

	public static class EncantamentoCuraBardoContext extends ParserRuleContext {
		public EncantamentoCuraBardoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encantamentoCuraBardo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).enterEncantamentoCuraBardo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RpgGramListener ) ((RpgGramListener)listener).exitEncantamentoCuraBardo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RpgGramVisitor ) return ((RpgGramVisitor<? extends T>)visitor).visitEncantamentoCuraBardo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncantamentoCuraBardoContext encantamentoCuraBardo() throws RecognitionException {
		EncantamentoCuraBardoContext _localctx = new EncantamentoCuraBardoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_encantamentoCuraBardo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__36);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u00da\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\6\3J\n\3\r\3\16\3K\3\3\7\3O\n\3\f\3\16\3"+
		"R\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\5\7h\n\7\3\b\3\b\3\b\3\b\3\b\6\bo\n\b\r\b\16\bp\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\6\tz\n\t\r\t\16\t{\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\6\n\u0085\n\n\r\n\16\n\u0086\3\n\3\n\3\13\3\13\3\13\3\13\3\13\6\13\u0090"+
		"\n\13\r\13\16\13\u0091\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u009b\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u00a2\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00a9\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00b0\n\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@BD\2\4\3\2\7\13\3\2\f\r\2\u00d0\2F\3\2\2\2\4I\3\2"+
		"\2\2\6S\3\2\2\2\b_\3\2\2\2\na\3\2\2\2\fg\3\2\2\2\16i\3\2\2\2\20t\3\2\2"+
		"\2\22\177\3\2\2\2\24\u008a\3\2\2\2\26\u009a\3\2\2\2\30\u00a1\3\2\2\2\32"+
		"\u00a8\3\2\2\2\34\u00af\3\2\2\2\36\u00b1\3\2\2\2 \u00b3\3\2\2\2\"\u00b5"+
		"\3\2\2\2$\u00b7\3\2\2\2&\u00b9\3\2\2\2(\u00bb\3\2\2\2*\u00bd\3\2\2\2,"+
		"\u00bf\3\2\2\2.\u00c1\3\2\2\2\60\u00c3\3\2\2\2\62\u00c5\3\2\2\2\64\u00c7"+
		"\3\2\2\2\66\u00c9\3\2\2\28\u00cb\3\2\2\2:\u00cd\3\2\2\2<\u00cf\3\2\2\2"+
		">\u00d1\3\2\2\2@\u00d3\3\2\2\2B\u00d5\3\2\2\2D\u00d7\3\2\2\2FG\5\4\3\2"+
		"G\3\3\2\2\2HJ\5\6\4\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LP\3\2\2"+
		"\2MO\5\f\7\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\5\3\2\2\2RP\3\2"+
		"\2\2ST\7\3\2\2TU\7-\2\2UV\7)\2\2VW\5\b\5\2WX\7.\2\2XY\7)\2\2YZ\7\4\2\2"+
		"Z[\5\n\6\2[\\\7)\2\2\\]\7\5\2\2]^\7\6\2\2^\7\3\2\2\2_`\t\2\2\2`\t\3\2"+
		"\2\2ab\t\3\2\2b\13\3\2\2\2ch\5\16\b\2dh\5\20\t\2eh\5\22\n\2fh\5\24\13"+
		"\2gc\3\2\2\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2h\r\3\2\2\2ij\7\16\2\2jk\7\17"+
		"\2\2kn\7-\2\2lm\7,\2\2mo\5\26\f\2nl\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2"+
		"\2\2qr\3\2\2\2rs\7\20\2\2s\17\3\2\2\2tu\7\21\2\2uv\7\17\2\2vy\7-\2\2w"+
		"x\7,\2\2xz\5\30\r\2yw\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2"+
		"}~\7\20\2\2~\21\3\2\2\2\177\u0080\7\22\2\2\u0080\u0081\7\17\2\2\u0081"+
		"\u0084\7-\2\2\u0082\u0083\7,\2\2\u0083\u0085\5\32\16\2\u0084\u0082\3\2"+
		"\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0089\7\20\2\2\u0089\23\3\2\2\2\u008a\u008b\7\23"+
		"\2\2\u008b\u008c\7\17\2\2\u008c\u008f\7-\2\2\u008d\u008e\7,\2\2\u008e"+
		"\u0090\5\34\17\2\u008f\u008d\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\7\20\2\2\u0094"+
		"\25\3\2\2\2\u0095\u009b\5\36\20\2\u0096\u009b\5&\24\2\u0097\u009b\5.\30"+
		"\2\u0098\u009b\5> \2\u0099\u009b\5\66\34\2\u009a\u0095\3\2\2\2\u009a\u0096"+
		"\3\2\2\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\27\3\2\2\2\u009c\u00a2\5 \21\2\u009d\u00a2\5(\25\2\u009e\u00a2\5\60\31"+
		"\2\u009f\u00a2\5@!\2\u00a0\u00a2\58\35\2\u00a1\u009c\3\2\2\2\u00a1\u009d"+
		"\3\2\2\2\u00a1\u009e\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\31\3\2\2\2\u00a3\u00a9\5\"\22\2\u00a4\u00a9\5*\26\2\u00a5\u00a9\5\62"+
		"\32\2\u00a6\u00a9\5B\"\2\u00a7\u00a9\5:\36\2\u00a8\u00a3\3\2\2\2\u00a8"+
		"\u00a4\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2"+
		"\2\2\u00a9\33\3\2\2\2\u00aa\u00b0\5$\23\2\u00ab\u00b0\5,\27\2\u00ac\u00b0"+
		"\5\64\33\2\u00ad\u00b0\5D#\2\u00ae\u00b0\5<\37\2\u00af\u00aa\3\2\2\2\u00af"+
		"\u00ab\3\2\2\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2"+
		"\2\2\u00b0\35\3\2\2\2\u00b1\u00b2\7\24\2\2\u00b2\37\3\2\2\2\u00b3\u00b4"+
		"\7\25\2\2\u00b4!\3\2\2\2\u00b5\u00b6\7\26\2\2\u00b6#\3\2\2\2\u00b7\u00b8"+
		"\7\27\2\2\u00b8%\3\2\2\2\u00b9\u00ba\7\30\2\2\u00ba\'\3\2\2\2\u00bb\u00bc"+
		"\7\31\2\2\u00bc)\3\2\2\2\u00bd\u00be\7\32\2\2\u00be+\3\2\2\2\u00bf\u00c0"+
		"\7\33\2\2\u00c0-\3\2\2\2\u00c1\u00c2\7\34\2\2\u00c2/\3\2\2\2\u00c3\u00c4"+
		"\7\35\2\2\u00c4\61\3\2\2\2\u00c5\u00c6\7\36\2\2\u00c6\63\3\2\2\2\u00c7"+
		"\u00c8\7\37\2\2\u00c8\65\3\2\2\2\u00c9\u00ca\7 \2\2\u00ca\67\3\2\2\2\u00cb"+
		"\u00cc\7!\2\2\u00cc9\3\2\2\2\u00cd\u00ce\7\"\2\2\u00ce;\3\2\2\2\u00cf"+
		"\u00d0\7#\2\2\u00d0=\3\2\2\2\u00d1\u00d2\7$\2\2\u00d2?\3\2\2\2\u00d3\u00d4"+
		"\7%\2\2\u00d4A\3\2\2\2\u00d5\u00d6\7&\2\2\u00d6C\3\2\2\2\u00d7\u00d8\7"+
		"\'\2\2\u00d8E\3\2\2\2\rKPgp{\u0086\u0091\u009a\u00a1\u00a8\u00af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}