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
- JAVA 8 
- Git

## 使用
1. 安装Mysql5.7、Java、Git
2. Mysql里导入sql，sql文件在sql目录下
3. 用idea导入eurekaSkeleton文件夹作为一个项目,并把项目的java版本改成8
4. 用idea依次点File -> Project Structure -> Moudules， 在modules窗口点击 "+" 把项目的所有目录设置为模块
5. 在config-repo 下执行 git init 初始仓库，并commit下面的三个配置文件
6. 修改微服务项目下 user-service、book-service、borrow-service三个模块的的bootstrap.yml,里面修改成自己的git服务器地址和分支
7. 启动项目 输入 ip:8802 查看注册微服务模块
