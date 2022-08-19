# blue-bean

- spring cloud tencent

## 记录

### 熔断、降级、限流：

- 测试熔断时发现，虽然消费接口时故障服务被屏蔽掉了，但是后台还是会报异常，并且消费者feign的fallback触发也是有问题
- 限流，可以自定义返回文本与http状态码，但是很多人在开发的时候不会用标准的http状态码，并且还会为整个微服务提供一套统一结果封装，所以这里希望限流能兼容这个，

### 增强插件：

- 1.7才能用（因为我用的sc2021.0.3）

### 配置中心：

- 配置文件的顺序
- 配置文件名建议写后缀，创建的时候都让选文件类型了，为啥不能自己不默认加上，导致你创建配置文件，选了yml类型后还是报错（配置文件里写的都是yml格式的配置，但是解析的时候按照properties解析的）

#### console界面

- 有一些小八阿哥
- 配置那个界面小屏幕下很难受

## 总结

- 这个项目发布的完，还需要呵护，看下一个版本1.7怎么样