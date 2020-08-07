package com.freedom.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author baijianliang
 * @date 2020/8/3 10:46
 */
public class Calculator {
    
    private Expression expression;
    
    public Calculator(String expStr) {
        
        // 使得运算先后顺序
        Stack<Expression> stack = new Stack<>();
        
        char[] charArray = expStr.toCharArray();
        
        Expression left = null;
        Expression right = null;
        
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                stack.push(new VarExpression(String.valueOf(charArray[i])));
                break;
            }
        }
        this.expression = stack.pop();
    }
    
    public int run(HashMap<String, Integer> map) {
        return this.expression.interpreter(map);
    }
}