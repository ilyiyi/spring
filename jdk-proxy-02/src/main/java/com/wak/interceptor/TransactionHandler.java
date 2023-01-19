package com.wak.interceptor;

import com.wak.transaction.DaoTransaction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wak
 */
public class TransactionHandler implements InvocationHandler {

    //增强类对象
    private DaoTransaction transaction;

    //需要代理的目标对象
    private Object target;

    public TransactionHandler(DaoTransaction transaction, Object target) {
        this.transaction = transaction;
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result;

        //判断当前方法是否为save，是save进行拦截
        if ("save".equals(method.getName())) {
            transaction.before();
            result = method.invoke(target, args);
            transaction.after();
        } else {
            result = method.invoke(target, args);
        }
        return result;
    }
}
