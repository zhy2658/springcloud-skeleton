一个基于Spring Cloud、Eureka、、Mysql的微服务项目骨架，代码完全开源。

## 技术栈
- Eureka
- Hystrix
- Gateway
- Config Server
- Mysql


## 前置要求
- Mysql 5.7
- SpirngBoot 2.7.11
- JDK 8 
- git

## 使用
1. 安装Mysql5.7
2. 安装Java, 在idea把项目的java版本改成8
3. 安装git仓库
4. mysql里导入sql，sql文件在sql目录下
5. 用idea导入项目
6. 用idea依次点File -> Project Structure -> Moudules， 在modules窗口点击 "+" 把项目的所有目录设置为模块
7. 在config-repo 下执行 git init 初始仓库，并commit下面的三个配置文件
8. 修改微服务项目 user-service、book-service、borrow-service三个模块的下的bootstrap.yml,里面修改成自己的git服务器地址和分支
9. 启动项目 输入 ip:8802 查看注册微服务模块
