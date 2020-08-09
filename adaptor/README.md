# 适配器模式
将一个接口转换成客户希望的另一个接口，适配器模式使接口不兼容的那些类可以一起工作

![uml](./src/main/java/uml/uml.png)

## 角色

### Target接口
需要被适配的目标接口

### Adaptor 适配器类
实现新旧接口的适配

### Adaptee 适配者类
无法更改的类，需要Adaptor来适配