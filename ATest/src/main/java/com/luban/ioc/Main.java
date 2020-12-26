package com.luban.ioc;

import com.luban.ioc.config.AppConfig;
import com.luban.ioc.dao.Dao1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	//main 生成 快捷键 psvm
	public static void main(String[] args){
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(AppConfig.class);
//		annotationConfigApplicationContext.addBeanFactoryPostProcessor(new MyConfigurationClassPostProcessor());
		annotationConfigApplicationContext.refresh();

		AppConfig bean = annotationConfigApplicationContext.getBean(AppConfig.class);
		bean.run();
		//FactoryBean hello = (FactoryBean) annotationConfigApplicationContext.getBean("hello");
//		IndexDao indexDao = annotationConfigApplicationContext.getBean(IndexDao.class);
//		indexDao.query();
//		DaoInter daoInter = annotationConfigApplicationContext.getBean(DaoInter.class);
//		daoInter.ha();


		Dao1 dao1 = (Dao1) annotationConfigApplicationContext.getBean("cardDao");
		dao1.list();

//		Dao2Impl dao2 = (Dao2Impl) annotationConfigApplicationContext.getBean("Dao2Impl");
//		dao2.query();


	}
}
