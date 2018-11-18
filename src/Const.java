public class Const {
    public static void main(String[] args) {

        new A (true);
    }
}

class A {
    A (){
        System.out.println("Działa konstruktor klasy A");
    }
A(boolean arg) {
    System.out.println("Działa konstruktor (z argumentem )" + arg + " klasy A");
}
}


class B extends A {
    B(){
        System.out.println("Działa konstruktor klasy B");
    }
}