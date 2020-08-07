package com.freedom.interpreter;

import java.util.HashMap;

/**
 * @author baijianliang
 * @date 2020/8/3 10:46
 */
public class VarExpression extends Expression {

    private String key;
  
    public VarExpression(String key) {
        this.key = key;
    }
  
    @Override
    public int interpreter(HashMap<String, Integer> map) {
        return map.get(key);
  }
}