#petShop（宠物商城）
#后台框架springboot+MyBatis+shiro+redis+MySQL
#前台使用了layerUI+thymeleaf(页面模板)
#本项目使用 shiro做权限控制，SQL见resources/shiro.sql
#自定义了2个用户 admin/admin  user1/user1
#启动该项目时必须事先启动redis，否则无法登陆
#登陆网站：localhost:8080/login

#后台SQL监控平台登录地址(必须登录后才能访问)
#localhost:8080/druid