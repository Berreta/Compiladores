// Generated from br\u005Cufscar\dc\compiladores\rpg\maker\RpgGram.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.rpg.maker;

  import br.ufscar.dc.compiladores.rpg.maker.File;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RpgGramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RpgGramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(RpgGramParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(RpgGramParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#declaracao_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_local(RpgGramParser.Declaracao_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#classe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasse(RpgGramParser.ClasseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#status}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatus(RpgGramParser.StatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(RpgGramParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#cmdAtaque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAtaque(RpgGramParser.CmdAtaqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#cmdDefenda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdDefenda(RpgGramParser.CmdDefendaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#cmdFuja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdFuja(RpgGramParser.CmdFujaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#cmdCure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCure(RpgGramParser.CmdCureContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#encantamentoAtaque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncantamentoAtaque(RpgGramParser.EncantamentoAtaqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#encantamentoDefesa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncantamentoDefesa(RpgGramParser.EncantamentoDefesaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#encantamentoFuga}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncantamentoFuga(RpgGramParser.EncantamentoFugaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#encantamentoCura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncantamentoCura(RpgGramParser.EncantamentoCuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#encantamentoAtaqueAnimago}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncantamentoAtaqueAnimago(RpgGramParser.EncantamentoAtaqueAnimagoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#encantamentoDefesaAnimago}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncantamentoDefesaAnimago(RpgGramParser.EncantamentoDefesaAnimagoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#encantamentoFugaAnimago}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncantamentoFugaAnimago(RpgGramParser.EncantamentoFugaAnimagoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#encantamentoCuraAnimago}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncantamentoCuraAnimago(RpgGramParser.EncantamentoCuraAnimagoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#encantamentoAtaqueEspadachim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncantamentoAtaqueEspadachim(RpgGramParser.EncantamentoAtaqueEspadachimContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#encantamentoDefesaEspadachim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncantamentoDefesaEspadachim(RpgGramParser.EncantamentoDefesaEspadachimContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#encantamentoFugaEspadachim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncantamentoFugaEspadachim(RpgGramParser.EncantamentoFugaEspadachimContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#encantamentoCuraEspadachim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncantamentoCuraEspadachim(RpgGramParser.EncantamentoCuraEspadachimContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#encantamentoAtaqueNecromante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncantamentoAtaqueNecromante(RpgGramParser.EncantamentoAtaqueNecromanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#encantamentoDefesaNecromante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncantamentoDefesaNecromante(RpgGramParser.EncantamentoDefesaNecromanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#encantamentoFugaNecromante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncantamentoFugaNecromante(RpgGramParser.EncantamentoFugaNecromanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#encantamentoCuraNecromante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncantamentoCuraNecromante(RpgGramParser.EncantamentoCuraNecromanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#encantamentoAtaquePaladino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncantamentoAtaquePaladino(RpgGramParser.EncantamentoAtaquePaladinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#encantamentoDefesaPaladino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncantamentoDefesaPaladino(RpgGramParser.EncantamentoDefesaPaladinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#encantamentoFugaPaladino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncantamentoFugaPaladino(RpgGramParser.EncantamentoFugaPaladinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#encantamentoCuraPaladino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncantamentoCuraPaladino(RpgGramParser.EncantamentoCuraPaladinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#encantamentoAtaqueBardo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncantamentoAtaqueBardo(RpgGramParser.EncantamentoAtaqueBardoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#encantamentoDefesaBardo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncantamentoDefesaBardo(RpgGramParser.EncantamentoDefesaBardoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#encantamentoFugaBardo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncantamentoFugaBardo(RpgGramParser.EncantamentoFugaBardoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RpgGramParser#encantamentoCuraBardo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncantamentoCuraBardo(RpgGramParser.EncantamentoCuraBardoContext ctx);
}