package com.freedom.interpreter;

import java.util.HashMap;

/**
 * @author baijianliang
 * @date 2020/8/3 10:46
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> map) {
        return super.left.interpreter(map) + super.right.interpreter(map);
    }
}