package com.github.mglowacz.patterns.visitor;

public interface Visitable {
  <R> R accept(Visitor<R> visitor);
}
