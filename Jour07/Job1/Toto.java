package Jour07.Job1;

class Toto {
    int toto = 0;
    Toto(){
        toto = toto + 1;
    }
    public static void main(String[] tutu) {
        Toto t1 = new Toto();
        Toto t2 = new Toto();
        //System.out.println("Toto: " + toto);            // Error: non-static variable toto cannot be referenced from a static context
        //We should use t1.toto instead of toto or make toto static
        System.out.println("Toto: " + t1.toto);
        System.out.println("Toto: " + t2.toto);
    }
}