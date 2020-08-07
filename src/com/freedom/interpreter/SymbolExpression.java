package com.freedom.interpreter;

import java.util.HashMap;

/**
 * @author baijianliang
 * @date 2020/8/3 10:46
 */
public class SymbolExpression extends Expression {
    
    protected Expression left;
    
    protected Expression right;
    
    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    
    @Override
    public int interpreter(HashMap<String, Integer> map) {
        return 0;
    }
}