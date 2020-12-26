package com.luban.ioc.import1;

import com.luban.ioc.config.MyFactoryBean;
import com.luban.ioc.dao.Dao1;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

		BeanDefinitionBuilder beanDefinitionBuilder =  BeanDefinitionBuilder.genericBeanDefinition(Dao1.class);
		AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
		System.out.println(beanDefinition.getBeanClassName());

		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.luban.ioc.dao.Dao1");
		beanDefinition.setBeanClass(MyFactoryBean.class);
		registry.registerBeanDefinition("cardDao",beanDefinition);
//		RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(IndexDao1.class);
//		registry.registerBeanDefinition("cardDao",rootBeanDefinition);

	}
}
