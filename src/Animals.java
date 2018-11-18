public class Animals {
    public static void main(String[] args) {
       Animal[] animals = new Animal[6];
       animals[0] = new Dog ("Burek ");
       animals[1] = new Cat ("Filemon ");
       animals[2] = new Pig ("Prosiaczek ");
       animals[3] = new Animal();
       animals[4] = new Parrot ("Karol ");
       animals[5] = new Snake ("Pyton ");

        for (Animal animal : animals){
            animal.introduce();
        }

    }

}

class Animal {
    String name;

    public Animal() {
        this.name = "bezimienny";
    }
String showName() {
        return "zwierze" + name;

}
String makeSound () {
        return "???";


}

void introduce(){
    System.out.println("Jestem " + showName() + ": " + makeSound());
}
}


class Dog extends Animal {

    public Dog(String name) {
        this.name =name;

    }

    @Override
    String showName() {
        return "pies " + name;
    }

    @Override
    String makeSound() {
        return "hau hau";
    }
}

class Cat extends Animal {
    public Cat(String name) {
        this.name =name;
}
    }

class Pig extends Animal {
    public Pig(String name) {
        this.name = name;
    }
        @Override
        String showName() {
            return "swinka " + name;
        }

        @Override
        String makeSound() {
            return "hrum  hrum";
        }
    }
class Parrot extends Animal {

    public Parrot(String name) {
        this.name = name;

    }

    @Override
    String showName() {
        return "papuga " + name;
    }

    @Override
    String makeSound() {
        return "cwir cwir";
    }
}
class Snake extends Animal {

    public Snake(String name) {
        this.name = name;

    }

    @Override
    String showName() {
        return "waz " + name;
    }

    @Override
    String makeSound() {
        return "ssssssssssssss";
    }
}
