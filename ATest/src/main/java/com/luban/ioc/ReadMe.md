1. BeanPostProcessor 
   bean被实例化放入spring容器前进行干预
   典型应用场景：AOP @PostConstruct 
2. BeanFactoryPostProcessor
bean被实例化前调用
 ConfigurationClassPostProcessor#postProcessorBeanFactory
  经典应用场景： 针对配置加上cglib代理
3. BeanDefinitionRegisterPostProcessor 
BeanFactoryPostProcessor的子类，优先子类执行？
因为源码优先遍历BeanDefinitionRegisterPostProcessor(有Spring提供的也有自定义的)
经典应用场景：扫描、3种import扫描、@Bean扫描 判断是否是完整的配置类
4. ImportSelector 
实现的方法 返回的String[]自动注入bd(这个bd是死的)
5. ImportBeanDefinitionRegistrar 
方法 registerBeanDefinitions 手动注入db