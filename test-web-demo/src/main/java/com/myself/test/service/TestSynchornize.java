package com.myself.test.service;

/**
 * 类名称：TestSynchornize<br>
 * 类描述：<br>
 * 创建时间：2020年01月18日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
public class TestSynchornize {
    /**
     * 修饰静态方法
     */
    public synchronized static void test1() {
        System.out.println("test1");
    }

    /**
     * 修饰实例方法
     */
    public synchronized void test2() {
        System.out.println("test2");
    }

    /**
     * 修饰代码块
     */
    public void test3() {
        synchronized (this) {
            System.out.println("test3");
        }
    }

    public static void main(String[] args) {
        TestSynchornize.test1();

        TestSynchornize testSynchornize = new TestSynchornize();
        testSynchornize.test2();
        testSynchornize.test3();
    }
}
