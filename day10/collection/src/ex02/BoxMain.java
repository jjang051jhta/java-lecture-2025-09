package ex02;

import animal.Animal;
import animal.Cat;
import animal.Dog;

public class BoxMain {
    public static void main(String[] args) {
        Box<Dog> box = new Box<>();
        box.setValue(new Dog("멍멍이",20));
        Dog dog = box.getValue();
        dog.sound();
        System.out.println(dog.getName());
        System.out.println(dog.getSize());

        Box<Cat> catDox = new Box<>();
        catDox.setValue(new Cat("냐옹이",10));
        Cat cat = catDox.getValue();
        cat.sound();
        System.out.println(cat.getName());
        System.out.println(cat.getSize());

        Box<Animal> animalBox = new Box<>();
        animalBox.setValue(new Cat("짐승",30));
        Animal animal = animalBox.getValue();
        animal.sound();
        System.out.println(animal.getName());
        System.out.println(animal.getSize());




    }
}
