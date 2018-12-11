package com.pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 模仿AbstractList写法，ArrayList就是一个迭代器模式
 */
public class BookList{
    private List<Book> list;
    private int index;

    public BookList(){
        this.list = new ArrayList<Book>();
    }

    /**
     * 添加书籍
     */
    public void addBook(Book book){
        this.list.add(book);
    }

    public Iterator<Book> iterator() {
        return new ConcreteIterator();
    }

    /**
     * 具体迭代器模式
     */
    private class ConcreteIterator implements Iterator {
        @Override
        public boolean hasNext() {
            if(index >= list.size()){
                return false;
            }
            return true;
        }
        @Override
        public Object next() {
            return list.get(index++);
        }
    }
}
