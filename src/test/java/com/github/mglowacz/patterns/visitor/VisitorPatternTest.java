package com.github.mglowacz.patterns.visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class VisitorPatternTest {

    private static final Logger LOG = LoggerFactory.getLogger(VisitorPatternTest.class);

    @Test
    public void test() {
        Visitor<String> printVisitor = new PrintVisitor();
        Visitor<Integer> dbVisitor = new DbVisitor();

        assertTrue(new Book().accept(printVisitor).startsWith(Book.class.getCanonicalName()));
        assertTrue(new Cd().accept(printVisitor).startsWith(Cd.class.getCanonicalName()));
        assertTrue(new Magazine().accept(printVisitor).startsWith(Magazine.class.getCanonicalName()));

        assertEquals(1L, new Book().accept(dbVisitor).longValue());
        assertEquals(2L, new Magazine().accept(dbVisitor).longValue());
        assertEquals(3L, new Cd().accept(dbVisitor).longValue());
    }

}
