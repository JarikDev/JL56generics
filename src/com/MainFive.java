package com;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Parent  {

}
class Child extends Parent{}
public class MainFive<T extends MainFive & Comparable & Serializable> {

    public static void main(String[] args) throws Exception {
        List<Parent> list = new ArrayList<Parent>();
        list.add(new Parent());
        list.add(new Child());
        Main main = new Main();
        main.method(list);
        for (Parent par: list) {
            System.out.println(par);
        }
    }

    void method(List<Parent> list) {
    }
}

class MyClass {
    Object t;
    Object method(Object t) {
        return t;
    }
}