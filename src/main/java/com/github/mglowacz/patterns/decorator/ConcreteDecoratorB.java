package com.github.mglowacz.patterns.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteDecoratorB extends Decorator {

    private static final Logger LOG = LoggerFactory.getLogger(ConcreteDecoratorB.class);

    ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        component.operation();
        LOG.info("extended ConcreteDecoratorB operation");
    }
}
