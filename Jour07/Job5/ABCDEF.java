package Jour07.Job5;

public class ABCDEF {
    
    public static void main(String[] args) {
        
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();

        a = b;
        //b = a;              // Error: incompatible types: A cannot be converted to B
        a = (A) b;
        a = null;
        //null = a;           // Error: incompatible types: <null> cannot be converted to A
        a = d;
        //b = d;              // Error: incompatible types: D cannot be converted to B
        a = e;
        d = e;

        A[] as = new A[10];
        as[0] = new A();
        as[1] = new B();
        as[2] = new D(2);
        as[3] = new E();
        as[4] = new C();
        as[5] = new D(4);
        as[6] = new B();

        search(as);
        add(as);

    }

    private static void search(A[] as) {
        int count = 0;
        for (int i = 0; i < as.length; i++) {
            if (as[i] instanceof B) {
                count++;
            }
        }
        System.out.println("The number of instances of class B is : " + count);
    }

    private static void add(A[] as) {
        int sum = 0;
        for (int i = 0; i < as.length; i++) {
            if (as[i] instanceof D) {
                sum += ((D) as[i]).d;
            }
        }
        System.out.println("The addition is : " + sum);
    }
}
