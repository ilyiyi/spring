package com.wak.ioc.domain;

/**
 * @author wak
 */
public class ClientServer {
    private static ClientServer clientServer = new ClientServer();

    private ClientServer() {
    }

    public static ClientServer createInstance() {
        System.out.println("静态方法创建bean");
        return clientServer;
    }
}
