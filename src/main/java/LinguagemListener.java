// Generated from C:/Users/ferre/Downloads/antlr-java_MODELO/antlr-java_MODELO/src/main/antlr4/com/uepb/Linguagem.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LinguagemParser}.
 */
public interface LinguagemListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LinguagemParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LinguagemParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LinguagemParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LinguagemParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(LinguagemParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(LinguagemParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LinguagemParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LinguagemParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(LinguagemParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(LinguagemParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(LinguagemParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(LinguagemParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(LinguagemParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(LinguagemParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link LinguagemParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(LinguagemParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link LinguagemParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(LinguagemParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link LinguagemParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(LinguagemParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link LinguagemParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(LinguagemParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LinguagemParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(LinguagemParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LinguagemParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(LinguagemParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LinguagemParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(LinguagemParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LinguagemParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(LinguagemParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link LinguagemParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(LinguagemParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link LinguagemParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(LinguagemParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(LinguagemParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(LinguagemParser.ConditionContext ctx);
}