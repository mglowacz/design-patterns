package com.github.mglowacz.patterns.decorator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class DecoratorPatternTest {

    private static final Logger LOG = LoggerFactory.getLogger(DecoratorPatternTest.class);

    @Mock
    private Component component;

    @Before
    public void setUp() {
        LOG.info("**************************************");
    }

    @Test
    public void whenCallDecoratorOperationThenComponentOperationIsAlsoCalled() {
        Component decoratedComponent = new ConcreteDecoratorA(component);

        decoratedComponent.operation();

        verify(component).operation();
    }


    @Test
    public void wrappedComponentTest() {
        Component decoratedComponent = new ConcreteDecoratorA(new ConcreteDecoratorB(new ConcreteComponent()));
        decoratedComponent.operation();
    }
}
