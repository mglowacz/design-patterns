package com.github.mglowacz.patterns.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteComponent implements Component {

    private static final Logger LOG = LoggerFactory.getLogger(ConcreteComponent.class);

    @Override
    public void operation() {
        LOG.info("ConcreteComponent operation");
    }
}
