# ldgen-seckill：从 0 到 1 构建高并发秒杀系统

本项目是一个从零开始构建的渐进式高并发秒杀系统。旨在通过实战演练，将系统 QPS 从最初的 50 提升至
30,000+，涵盖了从单体架构到微服务架构的完整演进过程，并深度集成主流分布式中间件与高性能优化方案。

---

## 🚀 项目核心学习路径

本项目不仅是一个秒杀业务的实现，更是一套高并发场景下的技术演进方案：

- **【需求与设计】**：深度进行业务场景分析、数据库表建模（MySQL）及 RESTful 接口设计。
- **【Redis 缓存实战】**：
    - 库存预热同步至 Redis。
    - 使用 Lua 脚本保证扣减库存的原子性。
    - 分布式会话管理。
    - 针对缓存穿透、击穿、雪崩三大问题的生产级解决方案。
- **【消息队列异步化】**：
    - 集成 RabbitMQ/RocketMQ 实现异步下单。
    - 订单超时自动取消。
    - 流量削峰填谷，平滑处理瞬时 10 万级 QPS。
- **【分布式锁与并发控制】**：使用 Redisson 解决超卖问题，确保高并发下的数据一致性。
- **【安全防刷与限流】**：
    - 图形验证码校验。
    - 基于令牌桶算法的接口限流。
    - IP 黑名单限制，有效阻断黄牛恶意刷单。
- **【性能加速方案】**：
    - 前端页面静态化并部署至 CDN，拦截 90% 冗余请求。
    - 售罄拦截与闸门流量控制。
- **【架构深度重构】**：
    - **DDD 领域驱动设计**：从传统三层架构向 DDD 架构（聚合根、领域服务、充血模型）转型。
    - **微服务演进**：基于 Spring Cloud Alibaba（Nacos、Gateway、Sentinel、Feign）进行服务拆分。
- **【容器化与自动化】**：使用 Docker 快速部署 MySQL、Redis、RabbitMQ、Nacos 等中间件环境。
- **【支付生态集成】**：对接支付宝沙箱环境，完成支付、退款及异步回调处理。
- **【压力测试验证】**：通过 JMeter 进行持续压测，量化每个阶段的性能提升效果。

### **🏁 目前完成进度**

- [x] **项目基础搭建**：Maven 多模块父子工程结构设计。
- [x] **依赖版本管理**：统一管理 Spring Boot、MyBatis、MySQL、Lombok 等核心版本。
- [x] **日志系统重构**：由默认的 Logback 切换至高性能的 **Log4j2 + Disruptor** 异步日志方案。
- [x] **接口文档集成**：成功集成 **Knife4j 4.5.0 + SpringDoc 2.6.0**，解决高版本兼容性冲突。
- [x] **全局基础架构**：配置全局异常处理、统一响应封装、基础工具类集成。
- [ ] **业务核心开发**：用户登录、秒杀商品列表、库存管理、订单流程（进行中）。
- [ ] **Redis 高性能方案**：库存预热、Lua 原子操作、分布式会话。
- [ ] **MQ 异步优化**：RabbitMQ/RocketMQ 削峰填谷。
- [ ] **分布式控制**：Redisson 分布式锁、Sentinel 熔断限流。
- [ ] **架构演进**：单体重构为 DDD 架构，进一步拆分为微服务集群。
- [ ] **AI 模块集成**：接入智能导购等 AI 业务场景。

---

## 🛠 技术栈

| 类别        | 技术方案                                                 |
|:----------|:-----------------------------------------------------|
| **核心框架**  | Spring Boot 3.x, Spring Cloud Alibaba                |
| **持久层**   | MyBatis, MySQL 8.0                                   |
| **缓存**    | Redis (Lua 脚本), Redisson                             |
| **消息中间件** | RabbitMQ / RocketMQ                                  |
| **微服务治理** | Nacos (注册/配置中心), Gateway, Sentinel (熔断限流), OpenFeign |
| **安全/工具** | Hutool, Lombok, Knife4j (接口文档)                       |
| **运维/压测** | Docker, JMeter                                       |

---

## 📂 项目模块说明

```text
ldgen-seckill
├── ldgen-seckill-app      # 启动入口：负责整合所有业务模块
├── ldgen-seckill-common   # 公共模块：存放响应对象、异常处理、工具类
├── ldgen-seckill-user     # 用户模块：用户注册、登录、个人中心
├── ldgen-seckill-goods    # 商品模块：秒杀商品展示、库存管理
└── ldgen-seckill-order    # 订单模块：下单流程、支付对接
```

---

## 📖 快速开始

1. **环境准备**：确保本地安装了 JDK 21+, Maven 3.6+, Docker。
2. **中间件启动**：通过 Docker 启动 Redis, MySQL, RabbitMQ。
3. **配置修改**：修改 `ldgen-seckill-app` 下 `application-dev.yml` 中的连接地址。
4. **编译运行**：
   ```bash
   mvn clean install
   cd ldgen-seckill-app
   mvn spring-boot:run
   ```
5. **访问文档**：启动后访问 `http://localhost:8080/doc.html` 查看 Knife4j 增强接口文档。

---

## 🤝 贡献与反馈

如果您在学习过程中有任何建议或发现了 Bug，欢迎提交 Pull Request 或 Issue！
