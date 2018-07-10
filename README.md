CREATE TABLE `user_info` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8; 



1.该项目基本结构：springboot+mybatis+aop+druid
2.aop 接口日志记录 + 全局异常捕捉 + logback日志 