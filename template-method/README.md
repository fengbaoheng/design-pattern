# 模板方法 Template Method

在模板方法中定义了算法的骨架, 但将某些步骤推迟至子类中实现.

子类可以不改变算法结构的前提下, 重新定义算法步骤实现细节

![uml](./src/main/java/uml/uml.png)

## 角色
### AbstractClass
抽象父类, 定义final算法骨架方法, 抽象或空实现的算法步骤, 以及控制算法步骤执行的钩子方法

### ConcreteClass
具体子类, 实现算法步骤, 和钩子方法

## 优点
- 封装不变部分,扩展可变部分
- 提取公共代码,便于维护

## 应用

- Servlet中父类的service()方法已经按请求类型调用doGet()和doPost()方法, 子类只需要实现即可

- Junit中用户自己实现setUp() tearDown()方法,他们会在指定流程中被自动调用.