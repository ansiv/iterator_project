package com.example;

import java.util.Collection;

public class TestIterator implements Iterator{
    private final java.util.Iterator<Integer> c;
    public TestIterator(Collection<Integer> c) {
        this.c = c.iterator();
    }

    @Override
    public boolean hasNext() {
        return c.hasNext();
    }

    @Override
    public int next() {
        return c.next();
    }
}
