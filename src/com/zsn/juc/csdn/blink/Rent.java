package com.zsn.juc.csdn.blink;

/**
 * @Author: zsn
 * @Date: 2020/6/13 14:46
 */
public class Rent {

    /**
     * 出租 单间短租出租4个月。550元/月 （水电煤公摊，网费 35 元/月）
     * 空调、卫生间、厨房齐全。
     * 屋内军事IT行业人士。喜欢安静，所以要求来租者最好是同行或者刚毕业的年轻人，爱干净、安静
     * 有意者电联。
     * 联系人：张先生
     * 联系方式，请阅读代码
     * @param args
     */
    public static void main(String[] args) {

        int[] arr = new int[]{0, 1, 2, 3, 5, 7};


        int[] index = new int[]{1, 3, 0, 5, 2, 1, 4, 0, 4, 0, 1};

        String tel = "";
        for (int i : index) {
            tel += arr[i];
        }

        System.out.println(tel);
    }
}
