package com.github.mglowacz.patterns.observer;

/** so called observable */
public interface Observable {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
}
