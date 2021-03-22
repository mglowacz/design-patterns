package com.github.mglowacz.patterns.visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(MockitoJUnitRunner.class)
public class VisitorPatternTest {

    private static final Logger LOG = LoggerFactory.getLogger(VisitorPatternTest.class);

    @Test
    public void test() {
        Visitor<String> printVisitor = new PrintVisitor();
        Visitor<Integer> dbVisitor = new DbVisitor();

        System.out.println(new Book().accept(printVisitor));
        System.out.println(new Cd().accept(printVisitor));
        System.out.println(new Magazine().accept(printVisitor));

        System.out.println(new Book().accept(dbVisitor));
        System.out.println(new Cd().accept(dbVisitor));
        System.out.println(new Magazine().accept(dbVisitor));
    }

}
