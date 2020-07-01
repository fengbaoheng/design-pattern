# 装饰模式
动态的给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更加灵活。

![uml][uml]

## 角色

- Component 抽象构件
- ConcreteComponent 具体构件
- Decorator 抽象装饰器
- ConcreteDecorator 具体装饰器

## 优点
- 构件类和装饰类可独立变化使用时组合，符合开闭原则。
- 可通过多个装饰类的排列组合装饰同一个对象，为其增加更多功能。

## 缺点

## 使用环境
- 在不影响其他对象的情况下，以动态、透明的方式给单个对象添加职责。
- 需要动态地给一个对象增加功能，这些功能也可以动态地被撤销。
- 当不适合使用继承方式对系统进行扩充时。

## 应用
- Java IO包



[uml]: https://github.com/fengbaoheng/design-pattern/blob/master/decorator/src/main/java/uml/uml.png