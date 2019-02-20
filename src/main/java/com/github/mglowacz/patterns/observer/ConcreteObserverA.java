package com.github.mglowacz.patterns.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteObserverA implements Observer {

    private static Logger logger = LoggerFactory.getLogger(ConcreteObserverA.class);

    @Override
    public void update() {
        logger.info("ConcreteObserverA notified");
    }
}
