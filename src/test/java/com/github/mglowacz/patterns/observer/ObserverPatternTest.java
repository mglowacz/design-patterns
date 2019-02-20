package com.github.mglowacz.patterns.observer;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ObserverPatternTest {

    private ConcreteObservable concreteObservable;

    @Mock
    private Observer observer;

    @Before
    public void setUp() {
        concreteObservable = new ConcreteObservable();
    }

    @Test
    public void whenAddObserverAndNotifyObserversThenCallObserverUpdate() {
        concreteObservable.add(observer);

        concreteObservable.notifyObservers();
        verify(observer).update();
    }

    @Test
    public void whenAddConcreteObserversAndNotifyObserversThenCallObserversUpdate() {
        concreteObservable.add(new ConcreteObserverA());
        concreteObservable.add(new ConcreteObserverA());
        concreteObservable.add(new ConcreteObserverB());
        concreteObservable.add(new ConcreteObserverB());

        concreteObservable.notifyObservers();
    }

}
