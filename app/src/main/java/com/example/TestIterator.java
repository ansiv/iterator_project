package com.example;

public class TestIterator implements Iterator{
    private final java.util.Iterator<Integer> iterator;
    public TestIterator(java.util.Iterator<Integer> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public int next() {
        return iterator.next();
    }
}
