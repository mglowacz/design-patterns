package com.github.mglowacz.patterns.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrintVisitor implements Visitor<String> {

    private static final Logger LOG = LoggerFactory.getLogger(PrintVisitor.class);

    @Override
    public String visit(Visitable visitable) {
        LOG.debug("Visiting {}", visitable.getClass().getSimpleName().toLowerCase());
        return visitable.toString();
    }
}
