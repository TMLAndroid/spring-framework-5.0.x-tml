package com.luban;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextTest extends AnnotationConfigApplicationContext {
	@Override
	protected void initPropertySources() {
		//getEnvironment().setRequiredProperties("test");
	}

	public ApplicationContextTest(Class<?>... annotatedClasses) {
		super(annotatedClasses);
	}
}
