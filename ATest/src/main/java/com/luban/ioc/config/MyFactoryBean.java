package com.luban.ioc.config;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


@SuppressWarnings("rawtypes")//忽略警告 idea 关闭
public class MyFactoryBean implements FactoryBean, InvocationHandler {

	Class clazz;

	public MyFactoryBean(Class clazz) {
		this.clazz = clazz;
	}

	@Override
	public Object getObject() throws Exception {
		Class<?>[] classes = {clazz};
		Object proxy = Proxy.newProxyInstance(this.getClass().getClassLoader(),classes, this);
		return  proxy;
	}

	@Override
	public Class getObjectType() {
		return clazz;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("list----");
		return null;
	}
}
