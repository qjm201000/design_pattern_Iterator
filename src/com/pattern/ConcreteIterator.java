package com.pattern;

import java.util.Iterator;

/**
 * 具体迭代器模式
 */
public class ConcreteIterator implements Iterator {
    @Override
    public boolean hasNext() {

        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
