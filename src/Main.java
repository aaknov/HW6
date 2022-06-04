public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик");
        dog.run(100);
        dog.run(200);
        dog.run(300);
        dog.run(100);
        dog.run(200);
        dog.swim(3);
        dog.swim(1);
        dog.swim(2);
        Cat cat = new Cat("Барсик");
        cat.run(100);
        cat.run(200);
        cat.run(100);
        cat.swim(10);
    }
}