/**
 * Created by LMC on 2017/1/1.
 */
import antlr.gen.EvalVisitor;
import antlr.gen.MiniJavaLexer;
import antlr.gen.MiniJavaParser;

import antlr.gen.MiniJavaVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class Test {
    public static void main(String[] args)throws Exception{
        ANTLRInputStream input=new ANTLRInputStream(System.in);
        MiniJavaLexer lexer=new MiniJavaLexer(input);
        CommonTokenStream tokens=new CommonTokenStream(lexer);
        MiniJavaParser parser=new MiniJavaParser(tokens);
        ParseTree tree=parser.goal();

        EvalVisitor eval=new EvalVisitor();
        eval.visit(tree);

        //print AST string
        System.out.println(tree.toStringTree(parser));

        //show GUI tree;
        org.antlr.v4.gui.Trees.inspect(tree,parser);

        //alternative GUI tree
        /*JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
        viewr.setScale(1.5);//scale a little
        panel.add(viewr);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200,1200);
        frame.setVisible(true);*/

        //ParseTreeWalker walker=new ParseTreeWalker();

    }
}
