package com.freedom.interpreter;

import java.util.HashMap;

/**
 * @author baijianliang
 * @date 2020/8/3 10:46
 */
public abstract class Expression {

    public abstract int interpreter(HashMap<String, Integer> map);
}
