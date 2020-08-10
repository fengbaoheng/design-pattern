# 组合模式 Composite
将对象组合成树形结构以表示部分与整体的层次结构。使用户可以一致地使用单个对象和组合对象

![uml](./src/main/java/uml/uml.png)

## 角色

### Component
抽象类或接口，定义了叶子对象和组合对象的共同行为

### Leaf
叶子对象

### Composite
组合对象，可以继续包含叶子对象和组合对象