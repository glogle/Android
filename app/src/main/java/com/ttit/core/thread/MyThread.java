package com.ttit.core.thread;

public class MyThread extends Thread {

    @Override
    public void run() {
        doSomething();
    }

    private void doSomething() {
        System.out.println("我是一个线程中的方法");
    }
}
