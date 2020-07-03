# 建造者模式
将复杂对象的表示和构建过程分离，使得同样的构建过程可以创建不同表示。

![uml][uml]

## 角色

### 产品类 Product
建造的目的对象，通常较为复杂

### 抽象建造者 Builder
规范产品各部分创建的抽象函数

### 具体建造者 ConcreteBuilder
继承或实现抽象建造者，具体实现了各个部分的创建工作

### 导演 Director
建造者的调用方，用于安排各部分的建造顺序

## 优点
- 将产品本身与产品的创建过程解耦，使得相同的创建过程可以创建不同的产品对象。


## 应用

- StringBuilder
- SqlSessionFactoryBuilder


[uml]: https://raw.githubusercontent.com/fengbaoheng/design-pattern/master/builder/src/main/java/uml/uml.png