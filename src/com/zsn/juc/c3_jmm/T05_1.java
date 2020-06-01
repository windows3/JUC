package com.zsn.juc.c3_jmm;

/**
 * @Author: zsn
 * @Date: 2020/5/27 1:35
 */
//  需求  ： 5个请求，怎么按照顺讯执行
public class T05_1 {
    public static void main(String[] args) {
     Thread t=   new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("");
            }
        });

    }


}
