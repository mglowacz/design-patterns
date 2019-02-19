package com.github.mglowacz.patterns.strategy;

class Context {

    private Strategy strategy;

    Context(Strategy strategy) {
        this.strategy = strategy;
    }

    void process() {
        this.strategy.behavior();
    }
}
