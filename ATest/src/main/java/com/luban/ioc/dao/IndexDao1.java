package com.luban.ioc.dao;

import org.springframework.stereotype.Component;

@Component
public class IndexDao1 extends Dao {
	public IndexDao1() {
		System.out.println("bb**");
	}

	public void query(){
		System.out.println("query**");
	}
}
