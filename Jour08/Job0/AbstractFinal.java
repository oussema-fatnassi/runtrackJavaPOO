package Jour08.Job0;

public class AbstractFinal {
    public static void main(String[] args) {
        A[] tab = new A[3];
        //tab[0] = new A();             // Error: A is abstract; cannot be instantiated
        tab[1] = new B();
        tab[2] = new C();
        //tab[1].b = 2;                   // Error: b is not a field of type A
        //((C) tab[2]).c = 3;             // Error: cannot assign a value to final variable c
    }
}

abstract class A {
    int a;
}

class B extends A {
    int b;
}

class C extends A {
    final double c = 1;
}

abstract class D extends A{
    double d;
    int operation(int a) {
        return (a * 2);
    }
    //abstract int calcul (int b){};       // Error: missing method body, or declare abstract
    abstract int machin();
}