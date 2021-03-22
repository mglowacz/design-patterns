package com.github.mglowacz.patterns.visitor;

public class Book implements Visitable {

    @Override
    public <R> R accept(Visitor<R> visitor) {
        return visitor.visit(this);
    }
}
