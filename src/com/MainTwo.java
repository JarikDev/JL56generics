package com;

class Car {

}

public class MainTwo<T> {
    T var;

    public static void main(String[] args) throws Exception {
        MainTwo<Car> main = new MainTwo();

        main.var = new Car();
        System.out.println(main.var);
    }

    T method(T type) {
        System.out.println(type);
        return type;
    }
}
