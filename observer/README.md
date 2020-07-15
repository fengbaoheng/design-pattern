# 观察者模式
也称发布/订阅模式。

定义一对多的依赖关系，让多个观察者对象同时监听某一主题对象。

这个主题对象在状态发生变化时，会通知所有观察者对象，使他们能够自动更新自己。



![uml](./src/main/java/uml/uml.png)



##  角色

### Subject 主题

抽象类或接口，用于管理和通知所有观察者

### Observer 观察者

当主题发布更新时，执行更新

### ConcreteSubject 具体主题

具体通知和管理观察者的逻辑

### ConcreteObserver 具体观察者

收到更新后的具体处理逻辑


## 示例

- [公众号订阅](./src/main/java/accounts)
- [eventbus](./src/main/java/eventbus)

## 应用

- JDK内置了Observable和Observer类，用户可以直接继承使用，不需要自己再创建