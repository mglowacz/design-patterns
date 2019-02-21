package com.github.mglowacz.patterns.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteDecoratorA extends Decorator {

    private static final Logger LOG = LoggerFactory.getLogger(ConcreteDecoratorA.class);

    ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        component.operation();
        LOG.info("extended ConcreteDecoratorA operation");
    }
}
