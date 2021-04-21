[TOC]

## Eureka

ServerDemo

## Feign
FeignDemo & ClientDemo

## Ribbon
ClientDemo

## Hystrix
ClientDemo

[Hytrix配置](https://blog.csdn.net/tongtong_use/article/details/78611225)

## Hystrix Dashboard
DashboardDemo
```
http://localhost:8088/hystrix

单节点stream地址: http://localhost:8080/actuator/hystrix.stream
聚合stream地址:  http://localhost:8080/hystrix.stream
```
[仪表盘说明](https://blog.csdn.net/tongtong_use/article/details/78611225)

## Zuul
GatewayDemo
```
http://localhost/myService/hello/test
```

## Config Center

[Spring Cloud Config](https://spring.io/projects/spring-cloud-config)

[Nacos：配置管理、服务发现](https://nacos.io/zh-cn/docs/what-is-nacos.html)

[Apollo](https://github.com/ctripcorp/apollo/wiki)

[Zuul基于Apollo动态路由](https://www.cnblogs.com/babycomeon/p/11489632.html)



### Apollo Client Quick Config

[Apollo GitHub](https://github.com/ctripcorp/apollo/wiki)

引入依赖

```
implementation 'com.ctrip.framework.apollo:apollo-client:1.8.0'
```

添加 Spring Boot 配置文件 application.yml

```yaml
app:
  id: payroll                            #应用ID
apollo:
  cacheDir: /xx/config                       #配置本地配置缓存目录
  cluster: default                           #指定使用哪个集群的配置
  meta: http://dev-apollo.xx.cn            #配置中心地址
  autoUpdateInjectedSpringProperties: true   #是否开启 Spring 参数自动更新
  bootstrap:
    enabled: true                            #是否开启 Apollo
    namespaces: ns1,ns2         #设置 Namespace
```

[Apollo 配置动态更新](https://ctripcorp.github.io/apollo/#/zh/usage/java-sdk-user-guide?id=_3223-configurationproperties%e4%bd%bf%e7%94%a8%e6%96%b9%e5%bc%8f)
