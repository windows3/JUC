package com.zsn.juc.c_028_FalseSharing;

/**
 * @Author: zsn
 * @Date: 2020/5/26 0:50
 */
public class T05_CacheLineDisruptor {
    public long p1, p2, p3, p4, p5, p6, p7;//cache line padding

    private volatile long cursor = 1L;
    //            INITIAL_CURSOR_VALUE;
    public long p8, p9, p10, p11, p12, p13, p14;//cache line padding
}
