package com.github.mglowacz.patterns.strategy;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ContextTest {

    private Context context;

    @Mock
    private Strategy strategy;

    @Before
    public void setUp() {
        context = new Context(strategy);
    }

    @Test
    public void whenProcessThenCallStrategyBehaviour() {
        context.process();
        verify(strategy).behavior();
    }
}
