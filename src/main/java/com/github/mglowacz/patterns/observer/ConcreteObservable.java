package com.github.mglowacz.patterns.observer;

import java.util.Collection;
import java.util.LinkedHashSet;

public class ConcreteObservable implements Observable {

    private Collection<Observer> observers = new LinkedHashSet<>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }
}
