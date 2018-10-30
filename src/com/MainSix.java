package com;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Parentt {
    void method(){
        System.out.println("b");
    }
}

class Childd extends Parentt {
}
class Son extends Childd{
    void method(){
        System.out.println("Son");
    }
}

public class MainSix<T extends MainFive & Comparable & Serializable> {

    public static void main(String[] args) throws Exception {
        List<Parentt> list = new ArrayList<Parentt>();
        list.add(new Childd());
        MainSix main = new MainSix();
        main.method(list);
        main.method4(list);

    }

    void method(List<? extends Parentt> list) {
        for (Parentt par : list) {
            System.out.println(par);
        }
    }
    void method2(List<? extends Object> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
    void method3(List<? super Childd> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
    void method4(List<? super Childd> list) {
        list.add(new Son());
        for (Object o : list) {
            Parentt p = (Parentt)o;
            p.method();
        }

    }
}
