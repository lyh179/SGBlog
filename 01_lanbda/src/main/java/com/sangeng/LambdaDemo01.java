package com.sangeng;

import java.util.function.IntBinaryOperator;

public class LambdaDemo01 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("新线程中run方法被执行了");
            }
        }).start();

        new Thread(() -> {
                System.out.println("新线程中run方法被执行了");
        }).start();

        int i = calculateNum(new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left + right;
            }
        });
        System.out.println(i);

        int j = calculateNum((int left, int right)-> {
            return left + right;
        });
        System.out.println(j);


    }

    public static int calculateNum(IntBinaryOperator operator){
        int a = 10;
        int b = 20;
        return operator.applyAsInt(a, b);
    }
}
