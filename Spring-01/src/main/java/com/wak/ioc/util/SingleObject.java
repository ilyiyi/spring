package com.wak.ioc.util;

/**
 * @author wak
 */
public class SingleObject {
    private static SingleObject instance;

    public synchronized static SingleObject getInstance() {
        if (instance == null) {
            instance = new SingleObject();
        }
        return instance;
    }
}
