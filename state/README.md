# 状态模式

当一个对象的内在状态改变时，允许改变其行为，这个对象看起来像是改变了其类

主要用于对象状态转换过于复杂时，将逻辑判断转移到表示不同状态的类中，可以把复杂的判断逻辑简化

![uml](./src/main/java/uml/uml.png)

## 角色

### State 抽象状态
定义对象状态接口

### Concentrate 具体状态
实现状态行为 + 状态转换

### Context 环境
负责具体状态的切换

## 优点
- 封装了状态转换规则，消除逻辑判断分支
- 将特定状态的行为放入一个对象中，定义新的状态类就可以完成状态的扩展与转换

## 缺点
- 违背开闭原则，添加新的状态后，还要修改旧的状态类的转换规则，使其能转换到的状态

## 应用

- 游戏开发
- 图形拖拽