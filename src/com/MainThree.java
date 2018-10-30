package com;

import java.io.Serializable;

class Carr extends MainThree implements Comparable, Serializable {

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

public class MainThree<T extends MainThree & Comparable & Serializable> {
    T var;
    public static void main(String[] args) throws Exception {
        MainThree<Carr> main = new MainThree<>();
        main.var = new Carr();
        main.method(new Carr());
    }

    T method(T type) {
        System.out.println(type);
        type.compareTo(new Object());
        return type;
    }

    void someMethod() {
        System.out.println("bla");
    }
}
