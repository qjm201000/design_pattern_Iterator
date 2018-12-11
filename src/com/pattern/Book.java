package com.pattern;

/**
 * 书对象
 */
public class Book {
    private int id;
    private String name;//书名

    public Book(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println(name);
    }
}
