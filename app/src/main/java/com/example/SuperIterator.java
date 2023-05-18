package com.example;

import java.util.ArrayList;
import java.util.Collection;

public class SuperIterator implements Iterator {

    private final java.util.Iterator<Integer> merge;


    public SuperIterator(Collection<Iterator> iterators) {
        if (iterators == null) {
            throw new IllegalArgumentException("Iterators must be not empty");
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (Iterator iterator : iterators) {
            if (iterator == null) {
                throw new IllegalArgumentException("Not implemented yet");
            }
            int count = 0;
            while (iterator.hasNext()) {
                if (++count > 10000000) {
                    throw new IllegalArgumentException("Not implemented yet2");
                }
                list.add(iterator.next());
            }
        }

        merge = list.stream().sorted().iterator();
    }

    @Override
    public boolean hasNext() {

        return merge.hasNext();
    }

    @Override
    public int next() {

        return merge.next();
    }
}
