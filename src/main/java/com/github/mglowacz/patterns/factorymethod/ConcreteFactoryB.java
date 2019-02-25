package com.github.mglowacz.patterns.factorymethod;

public class ConcreteFactoryB implements Factory {
    @Override
    public Product creteProduct() {
        return new ConcreteProductB();
    }
}
