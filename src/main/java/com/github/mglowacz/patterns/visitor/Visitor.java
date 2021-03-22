package com.github.mglowacz.patterns.visitor;

interface Visitor<R> {
   R visit(Book book);
   R visit(Magazine magazine);
   R visit(Cd cd);
}