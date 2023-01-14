package com.wak.ioc.util;

/**
 * @author wak
 */
public class SingleObjectE {
    private static SingleObjectE instance = new SingleObjectE();

    public synchronized static SingleObjectE getInstance(){
        return instance;
    }
}
