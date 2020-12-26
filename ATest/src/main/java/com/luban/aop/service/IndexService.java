package com.luban.aop.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("indexService")
public class IndexService {

	//@Autowired(required = false)
	//OrderTabDao orderTabDao;

	@Value("我特棒")
	private String name;

	public String getName() {
		return name;
	}

	//@Required//RequiredAnnotationBeanPostProcessor 处理 移除就不会报错
	public void setName(String name) {
		this.name = name;
	}
}
