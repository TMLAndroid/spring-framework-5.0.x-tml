package com.luban.pdf.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.luban.pdf")
@EnableAspectJAutoProxy(proxyTargetClass = true,exposeProxy = true)

//@EnableLuBan
public class PDFAppConfig {

}
