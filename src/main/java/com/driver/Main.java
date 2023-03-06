package com.driver;

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.meth();
        B obj2 = new B();
        obj2.meth();
    }
}

class A {
    public String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{
    @Override
    public String meth() {
        return "Method is overridden in Extendend class B";
    }
}