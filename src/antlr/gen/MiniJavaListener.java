// Generated from F:/øŒ≥Ã/±‡“Î/MiniJava/src\MiniJava.g4 by ANTLR 4.6
package antlr.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code LabelGoal}
	 * labeled alternative in {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterLabelGoal(MiniJavaParser.LabelGoalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LabelGoal}
	 * labeled alternative in {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitLabelGoal(MiniJavaParser.LabelGoalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LabelMainClass}
	 * labeled alternative in {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterLabelMainClass(MiniJavaParser.LabelMainClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LabelMainClass}
	 * labeled alternative in {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitLabelMainClass(MiniJavaParser.LabelMainClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DclrClass}
	 * labeled alternative in {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDclrClass(MiniJavaParser.DclrClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DclrClass}
	 * labeled alternative in {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDclrClass(MiniJavaParser.DclrClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DclrVar}
	 * labeled alternative in {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDclrVar(MiniJavaParser.DclrVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DclrVar}
	 * labeled alternative in {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDclrVar(MiniJavaParser.DclrVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DclrMethod}
	 * labeled alternative in {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDclrMethod(MiniJavaParser.DclrMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DclrMethod}
	 * labeled alternative in {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDclrMethod(MiniJavaParser.DclrMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeArray}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeArray(MiniJavaParser.TypeArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeArray}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeArray(MiniJavaParser.TypeArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeBool}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeBool(MiniJavaParser.TypeBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeBool}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeBool(MiniJavaParser.TypeBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeInt}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeInt(MiniJavaParser.TypeIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeInt}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeInt(MiniJavaParser.TypeIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeId}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeId(MiniJavaParser.TypeIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeId}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeId(MiniJavaParser.TypeIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmBrace}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmBrace(MiniJavaParser.StmBraceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmBrace}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmBrace(MiniJavaParser.StmBraceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmIf}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmIf(MiniJavaParser.StmIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmIf}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmIf(MiniJavaParser.StmIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmWhile}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmWhile(MiniJavaParser.StmWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmWhile}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmWhile(MiniJavaParser.StmWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmOut}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmOut(MiniJavaParser.StmOutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmOut}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmOut(MiniJavaParser.StmOutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmAssign}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmAssign(MiniJavaParser.StmAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmAssign}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmAssign(MiniJavaParser.StmAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmArrayAssign}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmArrayAssign(MiniJavaParser.StmArrayAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmArrayAssign}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmArrayAssign(MiniJavaParser.StmArrayAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpArrayDefine}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpArrayDefine(MiniJavaParser.ExpArrayDefineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpArrayDefine}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpArrayDefine(MiniJavaParser.ExpArrayDefineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpFalse}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpFalse(MiniJavaParser.ExpFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpFalse}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpFalse(MiniJavaParser.ExpFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpCall}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpCall(MiniJavaParser.ExpCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpCall}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpCall(MiniJavaParser.ExpCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpBracket}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpBracket(MiniJavaParser.ExpBracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpBracket}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpBracket(MiniJavaParser.ExpBracketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpCalc}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpCalc(MiniJavaParser.ExpCalcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpCalc}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpCalc(MiniJavaParser.ExpCalcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpLength}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpLength(MiniJavaParser.ExpLengthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpLength}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpLength(MiniJavaParser.ExpLengthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpTure}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpTure(MiniJavaParser.ExpTureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpTure}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpTure(MiniJavaParser.ExpTureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpArray}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpArray(MiniJavaParser.ExpArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpArray}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpArray(MiniJavaParser.ExpArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpNot}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpNot(MiniJavaParser.ExpNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpNot}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpNot(MiniJavaParser.ExpNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpId}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpId(MiniJavaParser.ExpIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpId}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpId(MiniJavaParser.ExpIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpIdDefine}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpIdDefine(MiniJavaParser.ExpIdDefineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpIdDefine}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpIdDefine(MiniJavaParser.ExpIdDefineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpThis}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpThis(MiniJavaParser.ExpThisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpThis}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpThis(MiniJavaParser.ExpThisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpInt}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpInt(MiniJavaParser.ExpIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpInt}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpInt(MiniJavaParser.ExpIntContext ctx);
}