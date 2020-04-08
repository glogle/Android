package com.ttit.core.thread;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(6000);
        doSomeThing();
        return "需要返回的值";
    }

    private void doSomeThing() {
        System.out.println("我是线程中的方法");
    }

}
