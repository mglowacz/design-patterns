package com.github.mglowacz.patterns.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DbVisitor implements Visitor<Integer> {

    private static final Logger LOG = LoggerFactory.getLogger(DbVisitor.class);

    @Override
    public Integer visit(Visitable visitable) {
        LOG.debug("Visiting {}", visitable.getClass().getSimpleName());
        if (visitable instanceof Book) {
            return 1;
        } else if (visitable instanceof Magazine) {
            return 2;
        } else if (visitable instanceof Cd) {
            return 3;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
