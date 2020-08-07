package com.freedom.adapter.defaultadapter;

/**
 * @author baijianliang
 * @date 2019/9/29
 * @description
 */
public class Client {

    public static void main(String[] args) {

        SubjectAdapter subjectAdapter = new SubjectAdapter() {

            @Override
            public void learnEnglish() {
                System.out.println("学习英语使我快乐");
            }
        };

        subjectAdapter.learnEnglish();
    }
}