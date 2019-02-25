package com.github.mglowacz.patterns.factorymethod;

public class ConcreteFactoryA implements Factory {
    @Override
    public Product creteProduct() {
        return new ConcreteProductA();
    }
}
