package com.luban.ioc.dao.java8;

import org.springframework.stereotype.Component;

//java 8
@Component
public class DaoImpl implements DaoInter{
	@Override
	public void ha() {
		System.out.println("我是子类");
	}

	@Override
	public void haa() {

	}
}
