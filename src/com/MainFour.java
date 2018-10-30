package com;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class MainFour<T extends MainFour & Comparable & Serializable> {

    public static void main(String[] args) throws Exception {
        List<File> list = new ArrayList<>();
        List list2 = new ArrayList<>();
         list.add(new File("sht2"));
        list2.add("String");
        list2.add(new Object());
        list2.add(new File("sht"));

        for (Object o: list2) { //dangerous
            File f =(File)o;

        }
        for (File f: list) {
            File fi = f;

        }}
        void method(List list){
            // List.add(new MainFour());
    }


    }

