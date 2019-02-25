package com.github.mglowacz.patterns.factorymethod;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class FactoryMethodTest {

    @Test
    public void whenCallCreateProductOnConcreteFactoryAThenCreateConcreteProductA() {
        Factory factory = new ConcreteFactoryA();
        assertTrue(factory.creteProduct().getClass().isAssignableFrom(ConcreteProductA.class));
    }

    @Test
    public void whenCallCreateProductOnConcreteFactoryBThenCreateConcreteProductB() {
        Factory factory = new ConcreteFactoryB();
        assertTrue(factory.creteProduct().getClass().isAssignableFrom(ConcreteProductB.class));
    }
}
