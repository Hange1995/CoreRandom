package com.generics;

import java.util.Iterator;
import java.util.Objects;

public class GenericList<T> implements Iterable<T> {

    private T[] items = (T[])new Objects[10];
    private int count;
    public void add(T item){
         items [count++] = item;
    }
    public T get(int index){
        return items[index];
    }
    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this) {
        };
    }
    private class ListIterator implements Iterator<T>{
        public ListIterator(GenericList<T> list) {
            this.list = list;
        }

        private int index;
        private GenericList<T> list;
        @Override
        public boolean hasNext() {
            return (index<list.count);
        }

        @Override
        public T next() {
            return list.items [index++];
        }
    }
}
