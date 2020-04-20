@Autowired 可以将bean所需的其他bean自动引进来
其他@Autowired 的required属性为false是，需要引进的bean为空也不报错，但是需要注意 nullpointExecption

当引入的某个类型的bean有两个的时候，需要通过@Qualifier 或者 @Primary 来告诉容易需要哪个bean
    @Qualifier: 告诉容器bean的名字，按照bean的名字进行引入
    @Primary: 告诉容器优先引入哪个bean
两个注解可以同时使用，但是最终会以@Qualifier为准