package com;

public class Main  {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.<String>method("123");
        main.<Integer>method(456);
        main.method(456);
        main.method(new Main());
    }

    <T> T method(T type) {
        System.out.println(type);
        return type;
    }

    <T> void method2(String s) {
        System.out.println(s);
    }

    <T, U, K> void method3(T type, U u, K k) {
        System.out.println(type);
        System.out.println(u);
        System.out.println(k);

    }

}
