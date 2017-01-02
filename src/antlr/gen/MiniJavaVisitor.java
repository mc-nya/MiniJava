// Generated from F:/øŒ≥Ã/±‡“Î/MiniJava/src\MiniJava.g4 by ANTLR 4.6
package antlr.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code LabelGoal}
	 * labeled alternative in {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelGoal(MiniJavaParser.LabelGoalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LabelMainClass}
	 * labeled alternative in {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelMainClass(MiniJavaParser.LabelMainClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DclrClass}
	 * labeled alternative in {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclrClass(MiniJavaParser.DclrClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DclrVar}
	 * labeled alternative in {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclrVar(MiniJavaParser.DclrVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DclrMethod}
	 * labeled alternative in {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclrMethod(MiniJavaParser.DclrMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeArray}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArray(MiniJavaParser.TypeArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeBool}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBool(MiniJavaParser.TypeBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeInt}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInt(MiniJavaParser.TypeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeId}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeId(MiniJavaParser.TypeIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmBrace}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmBrace(MiniJavaParser.StmBraceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmIf}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmIf(MiniJavaParser.StmIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmWhile}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmWhile(MiniJavaParser.StmWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmOut}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmOut(MiniJavaParser.StmOutContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmAssign}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmAssign(MiniJavaParser.StmAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmArrayAssign}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmArrayAssign(MiniJavaParser.StmArrayAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpArrayDefine}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpArrayDefine(MiniJavaParser.ExpArrayDefineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpFalse}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpFalse(MiniJavaParser.ExpFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpCall}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpCall(MiniJavaParser.ExpCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpBracket}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpBracket(MiniJavaParser.ExpBracketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpCalc}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpCalc(MiniJavaParser.ExpCalcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpLength}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpLength(MiniJavaParser.ExpLengthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpTure}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpTure(MiniJavaParser.ExpTureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpArray}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpArray(MiniJavaParser.ExpArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpNot}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNot(MiniJavaParser.ExpNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpId}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpId(MiniJavaParser.ExpIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpIdDefine}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpIdDefine(MiniJavaParser.ExpIdDefineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpThis}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpThis(MiniJavaParser.ExpThisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpInt}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpInt(MiniJavaParser.ExpIntContext ctx);
}