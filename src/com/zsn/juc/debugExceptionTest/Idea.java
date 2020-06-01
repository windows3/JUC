package com.zsn.juc.debugExceptionTest;

/**
 * @Author: zsn
 * @Date: 2020/5/28 1:01
 */
public class Idea {
    static class T {
        private Integer i ;

        public Integer getI() {
            return i;
        }
    }

    public static void main(String[] args) {
       T t = new T();
        Integer i = t.getI();
        i.toString();
    }

}
