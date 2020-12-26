package com.luban.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy//动态添加一个后置处理器 AnnotationAwareAspectJAutoProxyCreator
@ComponentScan("com.luban.aop")
public class AppConfig {
}
