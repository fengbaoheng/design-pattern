package uml;

import java.util.HashSet;
import java.util.Set;

/**
 * 具体主题
 * 决定何时发布通知
 */
public class ConcreteSubject implements Subject {
    private final Set<Observer> observers = new HashSet<>();

    @Override
    public Set<Observer> getObservers() {
        return this.observers;
    }
}
