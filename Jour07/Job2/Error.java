package Jour07.Job2;

public class Error {
    
    public static void main(String args[]){
        E1 x = new E1();
        E2 y = new E2();
        E3 z = new E3();
        E4 v = new E4();
        E5 w = new E5();
        System.out.println(x.a);        //Correct
        //System.out.println(y.c);        // Error: y is an instance of E2, which does not have a variable c
        System.out.println(y.b);        //Correct
        System.out.println(z.b);        //Correct
        System.out.println(v.c);        //Correct
        System.out.println(w.a);        //Correct
    }
}

class E1 {
    int a = 1;
}

class E2 extends E1 {
    int b = 2;
}

class E3 extends E2 {
    int c = 3;
}

class E4 extends E3 {
    int d = 4;
}

class E5 extends E4 {
    int e = 5;
}
