package com.brainacad.andreyaa.lms.java_se.lab3_9_proxy_classes.lab3_9_1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

class CalculateProxy implements InvocationHandler {

    private Object objCalc;

    private CalculateProxy(Object objCalc) {
        this.objCalc = objCalc;
    }

    static Object newInstance(Object objCalc) {
        return java.lang.reflect.Proxy.newProxyInstance(
                objCalc.getClass().getClassLoader(),
                objCalc.getClass().getInterfaces(),
                new CalculateProxy(objCalc)
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("The method <" + method.getName() +
                "> invoked with arg: " + Arrays.toString(args));

        Object result = method.invoke(objCalc, args);

        System.out.println("The method <" + method.getName() +
                "> ends with result: " + result.toString());

        return result;
    }

}
