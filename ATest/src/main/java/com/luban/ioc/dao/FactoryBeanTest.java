package com.luban.ioc.dao;

import com.luban.aop.dao.OrderTabDaoBImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("hello")
public class FactoryBeanTest implements ApplicationContextAware, BeanNameAware {

	ApplicationContext applicationContext;

	public void run(){
		OrderTabDaoBImpl bean = applicationContext.getBean(OrderTabDaoBImpl.class);
		System.out.println("hh"+bean.toString());
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("名字："+name);
	}
}
