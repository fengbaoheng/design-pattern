package uml;

import java.util.HashMap;

public class FlyweightFactory {
    // 享元池
    private final HashMap<String, Flyweight> flyweights = new HashMap<>();

    // 从享元池中获取享元对象，如果还不存在则新建一个
    public Flyweight getFlyweight(String key) {
        return flyweights.compute(key, (k, v) -> new ConcreteFlyweight(k));
    }


}
