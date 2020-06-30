# 饮品调配

## 需求
每种饮品有自己基本的生产流程，但可以按照客户的要求订制  
基本饮品：咖啡、奶茶  
订制：加冰、加糖、加牛奶  

## 设计

![uml](uml)

### 抽象构件
Drink类：所有饮品的接口，其中定义抽象方法生产饮品

### 具体构件
具体饮品：
- Coffee 咖啡
- MilkyTea 奶茶

### 抽象装饰类
DrinkDecorator类

###  具体装饰类
- AddIce：加冰
- AddSugar：加糖
- AddMilk：加牛奶


[uml]: https://github.com/fengbaoheng/design-pattern/blob/master/src/main/java/decorator/drink/uml.svg