package com.github.mglowacz.patterns.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteObserverB implements Observer {

    private static Logger logger = LoggerFactory.getLogger(ConcreteObserverB.class);

    @Override
    public void update() {
        logger.info("ConcreteObserverB notified");
    }
}
