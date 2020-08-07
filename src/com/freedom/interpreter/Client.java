package com.freedom.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author baijianliang
 * @date 2020/8/3 10:46
 */
public class Client {

    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        HashMap<String, Integer> map = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果：" + expStr + "=" + calculator.run(map));
    }

    public static String getExpStr() throws IOException {
        System.out.print("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    public static HashMap<String, Integer> getValue(String expStr) throws IOException {
        java.util.HashMap<String, Integer> map = new HashMap<>();
        for (char ch : expStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                System.out.print("请输入" + ch + "的值：");
                String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                map.put(String.valueOf(ch), Integer.valueOf(in));
            }
        }
        return map;
    }
}