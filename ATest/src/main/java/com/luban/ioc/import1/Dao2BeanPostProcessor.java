package com.luban.ioc.import1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Dao2BeanPostProcessor implements BeanPostProcessor , InvocationHandler {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("Dao2Impl")){
			bean = Proxy.newProxyInstance(this.getClass().getClassLoader(),new Class<?>[]{Dao2.class},this);
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("dao2 query");
		return method.invoke(proxy,args);
	}
}
