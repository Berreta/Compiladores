// Generated from br\u005Cufscar\dc\compiladores\rpg\maker\RpgGram.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.rpg.maker;

  import br.ufscar.dc.compiladores.rpg.maker.File;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RpgGramParser}.
 */
public interface RpgGramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(RpgGramParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(RpgGramParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(RpgGramParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(RpgGramParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(RpgGramParser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(RpgGramParser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#classe}.
	 * @param ctx the parse tree
	 */
	void enterClasse(RpgGramParser.ClasseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#classe}.
	 * @param ctx the parse tree
	 */
	void exitClasse(RpgGramParser.ClasseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#status}.
	 * @param ctx the parse tree
	 */
	void enterStatus(RpgGramParser.StatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#status}.
	 * @param ctx the parse tree
	 */
	void exitStatus(RpgGramParser.StatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(RpgGramParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(RpgGramParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#cmdAtaque}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtaque(RpgGramParser.CmdAtaqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#cmdAtaque}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtaque(RpgGramParser.CmdAtaqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#cmdDefenda}.
	 * @param ctx the parse tree
	 */
	void enterCmdDefenda(RpgGramParser.CmdDefendaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#cmdDefenda}.
	 * @param ctx the parse tree
	 */
	void exitCmdDefenda(RpgGramParser.CmdDefendaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#cmdFuja}.
	 * @param ctx the parse tree
	 */
	void enterCmdFuja(RpgGramParser.CmdFujaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#cmdFuja}.
	 * @param ctx the parse tree
	 */
	void exitCmdFuja(RpgGramParser.CmdFujaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#cmdCure}.
	 * @param ctx the parse tree
	 */
	void enterCmdCure(RpgGramParser.CmdCureContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#cmdCure}.
	 * @param ctx the parse tree
	 */
	void exitCmdCure(RpgGramParser.CmdCureContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#encantamentoAtaque}.
	 * @param ctx the parse tree
	 */
	void enterEncantamentoAtaque(RpgGramParser.EncantamentoAtaqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#encantamentoAtaque}.
	 * @param ctx the parse tree
	 */
	void exitEncantamentoAtaque(RpgGramParser.EncantamentoAtaqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#encantamentoDefesa}.
	 * @param ctx the parse tree
	 */
	void enterEncantamentoDefesa(RpgGramParser.EncantamentoDefesaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#encantamentoDefesa}.
	 * @param ctx the parse tree
	 */
	void exitEncantamentoDefesa(RpgGramParser.EncantamentoDefesaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#encantamentoFuga}.
	 * @param ctx the parse tree
	 */
	void enterEncantamentoFuga(RpgGramParser.EncantamentoFugaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#encantamentoFuga}.
	 * @param ctx the parse tree
	 */
	void exitEncantamentoFuga(RpgGramParser.EncantamentoFugaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#encantamentoCura}.
	 * @param ctx the parse tree
	 */
	void enterEncantamentoCura(RpgGramParser.EncantamentoCuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#encantamentoCura}.
	 * @param ctx the parse tree
	 */
	void exitEncantamentoCura(RpgGramParser.EncantamentoCuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#encantamentoAtaqueAnimago}.
	 * @param ctx the parse tree
	 */
	void enterEncantamentoAtaqueAnimago(RpgGramParser.EncantamentoAtaqueAnimagoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#encantamentoAtaqueAnimago}.
	 * @param ctx the parse tree
	 */
	void exitEncantamentoAtaqueAnimago(RpgGramParser.EncantamentoAtaqueAnimagoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#encantamentoDefesaAnimago}.
	 * @param ctx the parse tree
	 */
	void enterEncantamentoDefesaAnimago(RpgGramParser.EncantamentoDefesaAnimagoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#encantamentoDefesaAnimago}.
	 * @param ctx the parse tree
	 */
	void exitEncantamentoDefesaAnimago(RpgGramParser.EncantamentoDefesaAnimagoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#encantamentoFugaAnimago}.
	 * @param ctx the parse tree
	 */
	void enterEncantamentoFugaAnimago(RpgGramParser.EncantamentoFugaAnimagoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#encantamentoFugaAnimago}.
	 * @param ctx the parse tree
	 */
	void exitEncantamentoFugaAnimago(RpgGramParser.EncantamentoFugaAnimagoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#encantamentoCuraAnimago}.
	 * @param ctx the parse tree
	 */
	void enterEncantamentoCuraAnimago(RpgGramParser.EncantamentoCuraAnimagoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#encantamentoCuraAnimago}.
	 * @param ctx the parse tree
	 */
	void exitEncantamentoCuraAnimago(RpgGramParser.EncantamentoCuraAnimagoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#encantamentoAtaqueEspadachim}.
	 * @param ctx the parse tree
	 */
	void enterEncantamentoAtaqueEspadachim(RpgGramParser.EncantamentoAtaqueEspadachimContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#encantamentoAtaqueEspadachim}.
	 * @param ctx the parse tree
	 */
	void exitEncantamentoAtaqueEspadachim(RpgGramParser.EncantamentoAtaqueEspadachimContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#encantamentoDefesaEspadachim}.
	 * @param ctx the parse tree
	 */
	void enterEncantamentoDefesaEspadachim(RpgGramParser.EncantamentoDefesaEspadachimContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#encantamentoDefesaEspadachim}.
	 * @param ctx the parse tree
	 */
	void exitEncantamentoDefesaEspadachim(RpgGramParser.EncantamentoDefesaEspadachimContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#encantamentoFugaEspadachim}.
	 * @param ctx the parse tree
	 */
	void enterEncantamentoFugaEspadachim(RpgGramParser.EncantamentoFugaEspadachimContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#encantamentoFugaEspadachim}.
	 * @param ctx the parse tree
	 */
	void exitEncantamentoFugaEspadachim(RpgGramParser.EncantamentoFugaEspadachimContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#encantamentoCuraEspadachim}.
	 * @param ctx the parse tree
	 */
	void enterEncantamentoCuraEspadachim(RpgGramParser.EncantamentoCuraEspadachimContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#encantamentoCuraEspadachim}.
	 * @param ctx the parse tree
	 */
	void exitEncantamentoCuraEspadachim(RpgGramParser.EncantamentoCuraEspadachimContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#encantamentoAtaqueNecromante}.
	 * @param ctx the parse tree
	 */
	void enterEncantamentoAtaqueNecromante(RpgGramParser.EncantamentoAtaqueNecromanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#encantamentoAtaqueNecromante}.
	 * @param ctx the parse tree
	 */
	void exitEncantamentoAtaqueNecromante(RpgGramParser.EncantamentoAtaqueNecromanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#encantamentoDefesaNecromante}.
	 * @param ctx the parse tree
	 */
	void enterEncantamentoDefesaNecromante(RpgGramParser.EncantamentoDefesaNecromanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#encantamentoDefesaNecromante}.
	 * @param ctx the parse tree
	 */
	void exitEncantamentoDefesaNecromante(RpgGramParser.EncantamentoDefesaNecromanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#encantamentoFugaNecromante}.
	 * @param ctx the parse tree
	 */
	void enterEncantamentoFugaNecromante(RpgGramParser.EncantamentoFugaNecromanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#encantamentoFugaNecromante}.
	 * @param ctx the parse tree
	 */
	void exitEncantamentoFugaNecromante(RpgGramParser.EncantamentoFugaNecromanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#encantamentoCuraNecromante}.
	 * @param ctx the parse tree
	 */
	void enterEncantamentoCuraNecromante(RpgGramParser.EncantamentoCuraNecromanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#encantamentoCuraNecromante}.
	 * @param ctx the parse tree
	 */
	void exitEncantamentoCuraNecromante(RpgGramParser.EncantamentoCuraNecromanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#encantamentoAtaquePaladino}.
	 * @param ctx the parse tree
	 */
	void enterEncantamentoAtaquePaladino(RpgGramParser.EncantamentoAtaquePaladinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#encantamentoAtaquePaladino}.
	 * @param ctx the parse tree
	 */
	void exitEncantamentoAtaquePaladino(RpgGramParser.EncantamentoAtaquePaladinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#encantamentoDefesaPaladino}.
	 * @param ctx the parse tree
	 */
	void enterEncantamentoDefesaPaladino(RpgGramParser.EncantamentoDefesaPaladinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#encantamentoDefesaPaladino}.
	 * @param ctx the parse tree
	 */
	void exitEncantamentoDefesaPaladino(RpgGramParser.EncantamentoDefesaPaladinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#encantamentoFugaPaladino}.
	 * @param ctx the parse tree
	 */
	void enterEncantamentoFugaPaladino(RpgGramParser.EncantamentoFugaPaladinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#encantamentoFugaPaladino}.
	 * @param ctx the parse tree
	 */
	void exitEncantamentoFugaPaladino(RpgGramParser.EncantamentoFugaPaladinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#encantamentoCuraPaladino}.
	 * @param ctx the parse tree
	 */
	void enterEncantamentoCuraPaladino(RpgGramParser.EncantamentoCuraPaladinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#encantamentoCuraPaladino}.
	 * @param ctx the parse tree
	 */
	void exitEncantamentoCuraPaladino(RpgGramParser.EncantamentoCuraPaladinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#encantamentoAtaqueBardo}.
	 * @param ctx the parse tree
	 */
	void enterEncantamentoAtaqueBardo(RpgGramParser.EncantamentoAtaqueBardoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#encantamentoAtaqueBardo}.
	 * @param ctx the parse tree
	 */
	void exitEncantamentoAtaqueBardo(RpgGramParser.EncantamentoAtaqueBardoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#encantamentoDefesaBardo}.
	 * @param ctx the parse tree
	 */
	void enterEncantamentoDefesaBardo(RpgGramParser.EncantamentoDefesaBardoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#encantamentoDefesaBardo}.
	 * @param ctx the parse tree
	 */
	void exitEncantamentoDefesaBardo(RpgGramParser.EncantamentoDefesaBardoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#encantamentoFugaBardo}.
	 * @param ctx the parse tree
	 */
	void enterEncantamentoFugaBardo(RpgGramParser.EncantamentoFugaBardoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#encantamentoFugaBardo}.
	 * @param ctx the parse tree
	 */
	void exitEncantamentoFugaBardo(RpgGramParser.EncantamentoFugaBardoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RpgGramParser#encantamentoCuraBardo}.
	 * @param ctx the parse tree
	 */
	void enterEncantamentoCuraBardo(RpgGramParser.EncantamentoCuraBardoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RpgGramParser#encantamentoCuraBardo}.
	 * @param ctx the parse tree
	 */
	void exitEncantamentoCuraBardo(RpgGramParser.EncantamentoCuraBardoContext ctx);
}