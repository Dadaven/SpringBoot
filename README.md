# SpringBoot
learning SpringBoot 
spring boot具体实现过程：
1.需求分析
2.maven添加依赖（数据库，单元测试，授权，jpa,vo等）
3.API接口定义
格式如下：
users:用户管理。
------------
--   /users:Get 用户列表。
--   /users/add：Get获取用户新增界面
--   /users:Post保存用户。
等等。
4.@entity定义实体类
5.定义Repository接口（可以声明自定义方法，但是格式有要求）
6.定义service接口
7.实现service接口
8.增加接口中统一返回值对象
9.增加异常处理器
10.定义controller对象
