package com.github.mglowacz.patterns.visitor;

interface Visitor<R> {
   R visit(Visitable book);
}