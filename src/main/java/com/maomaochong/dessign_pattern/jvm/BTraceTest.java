package com.maomaochong.dessign_pattern.jvm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BTraceTest {
    public static void main(String[] args) throws Exception {
        BTraceTest test = new BTraceTest();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            System.out.println("输入字符：");
            reader.readLine();
            int a = (int) Math.round(Math.random() * 1000);
            int b = (int) Math.round(Math.random() * 1000);

            System.out.println(test.add(a, b));
        }
    }

    public int add(int a, int b) {
        return a + b;
    }
}
