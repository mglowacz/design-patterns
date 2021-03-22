package com.github.mglowacz.patterns.visitor;

public class Magazine implements Visitable {
    @Override
    public <R> R accept(Visitor<R> visitor) {
        return visitor.visit(this);
    }
}
