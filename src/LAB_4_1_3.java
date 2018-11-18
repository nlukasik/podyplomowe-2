public class LAB_4_1_3 {
    public static void main(String[] args) {
    new F(false);
    }
}

class D {
    D() {
        System.out.println("Działa konstruktor klasy A");
    }
    D(boolean arg){

    }
}
class E extends D {
    E() {
        super(false);
        System.out.println("Działa konstruktor klasy B");
    }
    E(boolean drg){

    }
}
    class F extends E {
        F() {
            super(false);
            System.out.println("Działa konstruktor klasy C");

        }
        F(boolean erg){

        }
    }
