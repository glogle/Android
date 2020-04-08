package com.ttit.core.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class NewThread {
    public static void main(String[] args) {
        // 1.继承Thread类
//        MyThread myThread = new MyThread();
//        myThread.start();//开启一个线程方法

        // 2.实现Runnable接口
//        Runnable runnable = new RunnableThread();
//        Thread thread = new Thread(runnable);
//        thread.start();
//
//        doSomething();//以下的方法可与上边的线程并发执行

        // 3.实现
        Callable<String> callable = new CallableThread();
        FutureTask<String> futureTask = new FutureTask<String>(callable);
        Thread thread = new Thread(futureTask);
        thread.start();

        doSomething();
        try {
            String resulVal = futureTask.get();//获取线程返回值
            System.out.println("resulVal = " + resulVal);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static void doSomething() {
        System.out.println("我是NewThread中的方法");
    }

}