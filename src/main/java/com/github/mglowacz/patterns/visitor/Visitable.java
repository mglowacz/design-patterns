package com.github.mglowacz.patterns.visitor;

public interface Visitable {
  default <R> R accept(Visitor<R> visitor) {
      return visitor.visit(this);
  }
}
