package com.wak.interceptor;

import com.wak.transaction.DaoTransaction;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author wak
 */
public class CglibInterceptor implements MethodInterceptor {

    private DaoTransaction transaction;


    public CglibInterceptor(DaoTransaction transaction) {
        this.transaction = transaction;

    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        transaction.before();
        Object ret = methodProxy.invokeSuper(o, objects);
        transaction.after();
        return ret;
    }
}
