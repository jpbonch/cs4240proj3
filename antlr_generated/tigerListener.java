// Generated from ./tiger.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tigerParser}.
 */
public interface tigerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tigerParser#tigerProgram}.
	 * @param ctx the parse tree
	 */
	void enterTigerProgram(tigerParser.TigerProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#tigerProgram}.
	 * @param ctx the parse tree
	 */
	void exitTigerProgram(tigerParser.TigerProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#declarationSegment}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSegment(tigerParser.DeclarationSegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#declarationSegment}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSegment(tigerParser.DeclarationSegmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#varDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarationList(tigerParser.VarDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#varDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarationList(tigerParser.VarDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(tigerParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(tigerParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#functDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterFunctDeclarationList(tigerParser.FunctDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#functDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitFunctDeclarationList(tigerParser.FunctDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#functDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctDeclaration(tigerParser.FunctDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#functDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctDeclaration(tigerParser.FunctDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(tigerParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(tigerParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#typeId}.
	 * @param ctx the parse tree
	 */
	void enterTypeId(tigerParser.TypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#typeId}.
	 * @param ctx the parse tree
	 */
	void exitTypeId(tigerParser.TypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(tigerParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(tigerParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#optionalInit}.
	 * @param ctx the parse tree
	 */
	void enterOptionalInit(tigerParser.OptionalInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#optionalInit}.
	 * @param ctx the parse tree
	 */
	void exitOptionalInit(tigerParser.OptionalInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(tigerParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(tigerParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(tigerParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(tigerParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#retType}.
	 * @param ctx the parse tree
	 */
	void enterRetType(tigerParser.RetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#retType}.
	 * @param ctx the parse tree
	 */
	void exitRetType(tigerParser.RetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#statSeq}.
	 * @param ctx the parse tree
	 */
	void enterStatSeq(tigerParser.StatSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#statSeq}.
	 * @param ctx the parse tree
	 */
	void exitStatSeq(tigerParser.StatSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(tigerParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(tigerParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#statIfTail}.
	 * @param ctx the parse tree
	 */
	void enterStatIfTail(tigerParser.StatIfTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#statIfTail}.
	 * @param ctx the parse tree
	 */
	void exitStatIfTail(tigerParser.StatIfTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#statIdTail}.
	 * @param ctx the parse tree
	 */
	void enterStatIdTail(tigerParser.StatIdTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#statIdTail}.
	 * @param ctx the parse tree
	 */
	void exitStatIdTail(tigerParser.StatIdTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(tigerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(tigerParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#exprOr}.
	 * @param ctx the parse tree
	 */
	void enterExprOr(tigerParser.ExprOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#exprOr}.
	 * @param ctx the parse tree
	 */
	void exitExprOr(tigerParser.ExprOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#exprAnd}.
	 * @param ctx the parse tree
	 */
	void enterExprAnd(tigerParser.ExprAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#exprAnd}.
	 * @param ctx the parse tree
	 */
	void exitExprAnd(tigerParser.ExprAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#exprRel}.
	 * @param ctx the parse tree
	 */
	void enterExprRel(tigerParser.ExprRelContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#exprRel}.
	 * @param ctx the parse tree
	 */
	void exitExprRel(tigerParser.ExprRelContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#exprAdd}.
	 * @param ctx the parse tree
	 */
	void enterExprAdd(tigerParser.ExprAddContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#exprAdd}.
	 * @param ctx the parse tree
	 */
	void exitExprAdd(tigerParser.ExprAddContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#exprMult}.
	 * @param ctx the parse tree
	 */
	void enterExprMult(tigerParser.ExprMultContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#exprMult}.
	 * @param ctx the parse tree
	 */
	void exitExprMult(tigerParser.ExprMultContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(tigerParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(tigerParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#atomTail}.
	 * @param ctx the parse tree
	 */
	void enterAtomTail(tigerParser.AtomTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#atomTail}.
	 * @param ctx the parse tree
	 */
	void exitAtomTail(tigerParser.AtomTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#const}.
	 * @param ctx the parse tree
	 */
	void enterConst(tigerParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#const}.
	 * @param ctx the parse tree
	 */
	void exitConst(tigerParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(tigerParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(tigerParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#opRel}.
	 * @param ctx the parse tree
	 */
	void enterOpRel(tigerParser.OpRelContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#opRel}.
	 * @param ctx the parse tree
	 */
	void exitOpRel(tigerParser.OpRelContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#opAdd}.
	 * @param ctx the parse tree
	 */
	void enterOpAdd(tigerParser.OpAddContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#opAdd}.
	 * @param ctx the parse tree
	 */
	void exitOpAdd(tigerParser.OpAddContext ctx);
	/**
	 * Enter a parse tree produced by {@link tigerParser#opMult}.
	 * @param ctx the parse tree
	 */
	void enterOpMult(tigerParser.OpMultContext ctx);
	/**
	 * Exit a parse tree produced by {@link tigerParser#opMult}.
	 * @param ctx the parse tree
	 */
	void exitOpMult(tigerParser.OpMultContext ctx);
}