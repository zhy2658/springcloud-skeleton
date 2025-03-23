一个基于Spring Cloud的微服务项目骨架。

## 中间库
- Eureka
- Hystrix
- Gateway
- Config Server
- Feign
- MySQL



## 前置要求
- MySQL 5.7及以上
- SpirngBoot 2.7.11及以上
- JAVA 8及以上
- Git

## 使用
1. 安装MySQL、Java、Git
2. MySQL里导入sql目录下的sql文件
3. 用idea导入eurekaSkeleton文件夹作为一个项目,并把项目的java版本改成8
4. 用idea依次点File -> Project Structure -> Modules， 在modules窗口点击 "+" 把项目的所有目录设置为模块
5. 在config-repo下三个yml文件里配置数据源，然后执行 git init 初始化仓库，并commit下面的三个配置文件
6. config-server模块下的application.yml填写config-repo所在目录的绝对路径
7. 启动项目 输入 localhost:8802 查看注册的微服务模块
