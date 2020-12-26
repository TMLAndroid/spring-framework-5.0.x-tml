package com.luban.aop;

import com.luban.aop.config.AppConfig;
import com.luban.aop.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		IndexService indexService = annotationConfigApplicationContext.getBean(IndexService.class);
	}
}
