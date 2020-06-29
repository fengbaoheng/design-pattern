# 数据库操作
数据库包含用户、部门等多个具体对象。  
用户可以切换数据库以使用不同数据库下的一系列相关对象。  


## 设计

### 抽象产品
定义不同数据库下都可以操作的通用产品

#### 用户 User
#### 部门 Department

### 抽象工厂
定义一系列方法，用于生产同一个数据库下的产品族。

#### insertUser方法
在特定数据库下创建用户对象并返回。

#### insertDepartment方法
在特定数据库下创建部门对象并返回。

### 具体产品

#### MySqlUser
#### MySqlDepartment
#### OracleUser
#### OracleDepartment

### 具体工厂

#### MysqlFactory
#### OracleFactory