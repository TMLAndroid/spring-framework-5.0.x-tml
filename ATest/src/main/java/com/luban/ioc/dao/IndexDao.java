package com.luban.ioc.dao;

import org.springframework.stereotype.Component;

@Component
public class IndexDao extends Dao{
	public IndexDao() {
		System.out.println("bb");
	}

	public void query(){
		System.out.println("query");
	}
}
