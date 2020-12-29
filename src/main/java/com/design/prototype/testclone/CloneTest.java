package com.design.prototype.testclone;

/**
 * @Author: weishi.zeng
 * @Date: 2020/12/28 15:18
 * @Description:
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book = new Book();
        book.setName("book1");
        Book clone = book.clone();
        System.out.println("实现cloneable接口：");
        System.out.println(book == clone);
        System.out.println(book.equals(clone));
        System.out.println(book.getName()+"---"+clone.getName());
        clone.setName("book2");
        System.out.println(book.getName()+"---"+clone.getName());

        Pen pen = new Pen();
        pen.setName("pen1");
        Object clone1 =  pen.clone();
        System.out.println("重写Object的clone方法:");
        System.out.println(pen == clone1);
        System.out.println(pen.equals(clone1));
    }
}
