package com.luban.yuque;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;


public class MyReplacer  implements MethodReplacer {
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("替换"+obj+"中的方法，方法名称："+method.getName());
		System.out.println("执行新的方法逻辑");
		return null;
	}
}
