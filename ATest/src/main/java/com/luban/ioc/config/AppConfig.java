package com.luban.ioc.config;

import com.luban.aop.dao.OrderTabDaoBImpl;
import com.luban.ioc.import1.MyImportBeanDefinitionRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.luban")
//@EnableLuBan
@Import(MyImportBeanDefinitionRegister.class)
public class AppConfig {
	@Autowired
	ApplicationContext applicationContext;
	public void run(){
		String applicationName = applicationContext.getApplicationName();
		OrderTabDaoBImpl bean = applicationContext.getBean(OrderTabDaoBImpl.class);
		String name = bean.toString();
		System.out.println("hhh"+name);
	}
}
