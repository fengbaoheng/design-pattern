# 日志记录器

- 支持记录日志到数据库与文件
- 根据配置文件选择不同的格式

## 设计

1. 抽象产品  
Logger：定义了日志记录方法

1. 具体产品  
FileLogger：文件日志记录  
DatabaseLogger：数据库日志记录

1. 抽象工厂
LoggerFactory：定义获取日志记录器的方法

1. 具体工厂
FileLoggerFactory：创建文件日志记录器  
DatabaseLoggerFactory：创建数据库日志记录器