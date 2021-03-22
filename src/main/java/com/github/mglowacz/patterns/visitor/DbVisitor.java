package com.github.mglowacz.patterns.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DbVisitor implements Visitor<Integer> {

    private static final Logger LOG = LoggerFactory.getLogger(DbVisitor.class);

    @Override
    public Integer visit(Book book) {
        LOG.debug("Visiting book");
        return 1;
    }

    @Override
    public Integer visit(Magazine magazine) {
        LOG.debug("Visiting magazine");
        return 2;
    }

    @Override
    public Integer visit(Cd cd) {
        LOG.debug("Visiting cd");
        return 3;
    }
}
