## 练习 Eureka

 - 加入 spring-cloud-security 安全
 - 加入 HA 高可用（互相注册）

## 练习 RestTemplate

## 练习 Ribbon

## 练习 OpenFeign

## 练习 zuul

## 链路追踪
```
curl -sSL https://zipkin.io/quickstart.sh | bash -s
java -jar zipkin.jar
```

## Actuator
| ID                 | 描述                                                         |
| :----------------- | :----------------------------------------------------------- |
| `auditevents`      | 公开当前应用程序的审核事件信息。                             |
| `beans`            | 显示应用程序中所有Spring bean的完整列表。                    |
| `caches`           | 暴露可用的缓存。                                             |
| `conditions`       | 显示在配置和自动配置类上评估的条件以及它们匹配或不匹配的原因。 |
| `configprops`      | 显示所有的整理列表`@ConfigurationProperties`。               |
| `env`              | 露出Spring的属性`ConfigurableEnvironment`。                  |
| `flyway`           | 显示已应用的任何Flyway数据库迁移。                           |
| `health`           | 显示应用健康信息。                                           |
| `httptrace`        | 显示HTTP跟踪信息（默认情况下，最后100个HTTP请求 - 响应交换）。 |
| `info`             | 显示任意应用信息。                                           |
| `integrationgraph` | 显示Spring Integration图。                                   |
| `loggers`          | 显示和修改应用程序中记录器的配置。                           |
| `liquibase`        | 显示已应用的任何Liquibase数据库迁移。                        |
| `metrics`          | 显示当前应用程序的“指标”信息。                               |
| `mappings`         | 显示所有`@RequestMapping`路径的整理列表。                    |
| `scheduledtasks`   | 显示应用程序中的计划任务。                                   |
| `sessions`         | 允许从Spring Session支持的会话存储中检索和删除用户会话。使用Spring Session对响应式Web应用程序的支持时不可用。 |
| `shutdown`         | 允许应用程序正常关闭。                                       |
| `threaddump`       | 执行线程转储。                                               |
web 附加端点
| ID           | 描述                                                         |
| :----------- | :----------------------------------------------------------- |
| `heapdump`   | 返回`hprof`堆转储文件。                                      |
| `jolokia`    | 通过HTTP公开JMX bean（当Jolokia在类路径上时，不适用于WebFlux）。 |
| `logfile`    | 返回日志文件的内容（如果已设置`logging.file`或`logging.path`属性）。支持使用HTTP `Range`标头来检索部分日志文件的内容。 |
| `prometheus` | 以可以由Prometheus服务器抓取的格式公开指标。                 |




## Spring Admin
1. 邮件通知
2. 钉钉通知

