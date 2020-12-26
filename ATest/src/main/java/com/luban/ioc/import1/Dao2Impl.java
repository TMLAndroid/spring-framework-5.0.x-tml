package com.luban.ioc.import1;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component("Dao2Impl")
public class Dao2Impl implements Dao2, InitializingBean {
	@Override
	public void query() {
		System.out.println("hahahahahhaha");
	}

	@Override
	public void afterPropertiesSet() throws Exception {

	}
}
