# Type-moon Server

基于 **Spring Boot** 的后端服务，提供用户、帖子、评论、内容管理等 API 接口。

## 技术栈

- Java 17
- Spring Boot 3.x
- Spring Cloud Netflix Eureka（服务注册与发现）
- MyBatis
- MySQL
- Redis
- Aliyun OSS（文件存储）
- JWT（身份认证）

## 项目结构

```text
src/main/java/elelief/typemoon/
├── ServerApplication.java    # 启动类（Eureka Server）
├── Controller/               # 接口层
│   ├── AdminController.java
│   ├── CommentController.java
│   ├── CompositionController.java
│   ├── LoginController.java
│   ├── PostController.java
│   ├── RegisterController.java
│   ├── UploadController.java
│   └── UserController.java
├── Service/                  # 业务层
│   ├── AdminService.java
│   ├── ComService.java
│   ├── CommentService.java
│   ├── PostService.java
│   └── UserService.java
├── mapper/                   # 数据访问层
│   ├── AdminMapper.java
│   ├── ComMapper.java
│   ├── CommentMapper.java
│   ├── PostMapper.java
│   └── UserMapper.java
├── pojo/                     # 实体类
├── config/                   # 配置类
├── utils/                    # 工具类
├── Filter/                   # 过滤器
├── interceptor/              # 拦截器
└── aop/                      # 切面（操作日志）
```

## 快速开始

### 环境要求

- JDK 17+
- Maven 3.6+
- MySQL 8.0+
- Redis

### 启动步骤

1. 克隆项目

```bash
git clone git@github.com:你的用户名/仓库名.git
cd server
```

2. 配置数据库

```bash
mysql -u root -p < sql/init.sql
```

3. 启动服务

```bash
mvn spring-boot:run
```

或者打包后运行：

```bash
mvn clean package
java -jar target/typemoon-0.0.1-SNAPSHOT.jar
```

4. 访问 Eureka 控制台

```text
http://localhost:8761
```

## 主要功能

| 模块 | 说明 |
|------|------|
| 用户模块 | 注册、登录、用户信息管理 |
| 帖子模块 | 发帖、浏览、删除 |
| 评论模块 | 评论、回复 |
| 内容模块 | 内容发布与管理 |
| 管理模块 | 后台管理接口 |
| 文件上传 | 阿里云 OSS 存储 |

## 认证方式

- 登录后获取 JWT Token
- 请求头携带 `Authorization: Bearer <token>`
- 拦截器自动校验 Token 有效性

## 配置文件说明

`application.yml` 中包含：

- 数据源配置（MySQL）
- Redis 配置
- JWT 密钥
- 阿里云 OSS 配置

> **注意**：`application.yml` 中的敏感信息（数据库密码、OSS 密钥等）请勿提交到 GitHub。

## 目录规范

- 接口返回统一使用 `Result` 封装
- 操作日志通过 AOP 自动记录
- Token 校验通过拦截器实现

## License

MIT
