# spring-cloud-demo
spring-cloud 学习实践过程

## 模块简介
模块  | 简介   
:-:|:- 
eureka | eureka服务注册中心
feign | feign声明web服务客户端，集成了hystrix断路器，自带ribbon
order-service | 服务提供者：模拟订单服务
ribbon | ribbon负载均衡，集成了hystrix断路器
zuul-gateway | zuul网关，里面有个过滤器

## 使用流程
0. 检出到IDEA；
1. 按顺序启动eureka，order-service，ribbon，feign，zuul-gateway，然后再多启动一个order-service，用来验证负载均衡；
2. 访问http://localhost:9000/ ，可以看到有instance已经注册了；
3. 访问ribbon的服务，验证负载均衡和断路器；
4. 访问feign的服务，验证负载均衡和断路器；
5. 访问zuul-gateway的服务，验证网关过滤器
