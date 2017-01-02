package antlr.gen;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LMC on 2017/1/2.
 */
public class EvalVisitor extends MiniJavaBaseVisitor<Integer> {
    Map<String,Integer> memory=new HashMap<String,Integer>();
    @Override
    public  Integer visitExpCalc(MiniJavaParser.ExpCalcContext ctx){
        return 0;
    }
}
