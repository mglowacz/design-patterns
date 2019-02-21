package com.github.mglowacz.patterns.decorator;

public abstract class Decorator implements Component {

    Component component;

    Decorator(Component component) {
        this.component = component;
    }

    @Override
    public abstract void operation();
}
