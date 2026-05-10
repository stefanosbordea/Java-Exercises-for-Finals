public class Main{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        Bird b1 = new Bird();

        Animal[] animals = {d1,c1,  b1};
        for (Animal animal :animals) {
            animal.speak();
            animal.eat();
        }
    }
}