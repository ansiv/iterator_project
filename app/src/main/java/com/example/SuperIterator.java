package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SuperIterator implements Iterator {

    private final Collection<Iterator> iterators;
    private final ArrayList<Integer> list = new ArrayList<>();
    private java.util.Iterator<Integer> merge;


    public SuperIterator(Collection<Iterator> iterators) {
        this.iterators = new ArrayList<>(iterators);

        for (Iterator iterator : iterators) {
            if (iterator == null) {
                throw new IllegalArgumentException("Not implemented yet");
            }
        }

        for (Iterator iterator : iterators) {
            int count = 0;
            while (iterator.hasNext()) {
                if (++count > 10000000) {
                    throw new IllegalArgumentException("Итератор не может быть бесконечным");
                }
                list.add(iterator.next());
            }
        }

        Collections.sort(list);
        merge = list.iterator();


        System.out.println("list = " + list);


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
