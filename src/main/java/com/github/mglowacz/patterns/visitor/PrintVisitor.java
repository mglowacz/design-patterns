package com.github.mglowacz.patterns.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrintVisitor implements Visitor<String> {

    private static final Logger LOG = LoggerFactory.getLogger(PrintVisitor.class);

    @Override
    public String visit(Book book) {
        LOG.debug("Visiting book");
        return book.toString();
    }

    @Override
    public String visit(Magazine magazine) {
        LOG.debug("Visiting magazine");
        return magazine.toString();
    }

    @Override
    public String visit(Cd cd) {
        LOG.debug("Visiting cd");
        return cd.toString();
    }
}
