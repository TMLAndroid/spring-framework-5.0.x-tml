package com.luban.ioc.dao.java8;

@FunctionalInterface
public interface DaoInter {
	default void ha(){//相当于有个默认实现 子类实现的话就不起作用 为了支持 lambda 扩展
		System.out.println("测试");
	};
	 void haa();

}
