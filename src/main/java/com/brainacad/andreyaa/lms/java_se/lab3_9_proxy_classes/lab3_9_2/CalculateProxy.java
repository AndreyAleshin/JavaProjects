package com.brainacad.andreyaa.lms.java_se.lab3_9_proxy_classes.lab3_9_2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class CalculateProxy implements InvocationHandler {

    private Class[] interfaces;
    private Object[] delegates;

    private CalculateProxy(Class[] interfaces, Object[] delegates) {
        this.interfaces = interfaces;
        this.delegates = delegates;
    }

    static Object newInstance(Class[] interfaces, Object[] delegates) {
        return java.lang.reflect.Proxy.newProxyInstance(
                interfaces.getClass().getClassLoader(),
                interfaces.getClass().getInterfaces(),
                new CalculateProxy(interfaces, delegates)
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }

}
