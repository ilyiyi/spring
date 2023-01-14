package com.wak.ioc.domain;

/**
 * @author wak
 */
public class ClientServiceFactory {
    private static ClientService instance = new ClientService();

    private ClientServiceFactory() {
    }

    public ClientService getInstance() {
        return instance;
    }
}
