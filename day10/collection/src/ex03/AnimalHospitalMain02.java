package ex03;

import animal.Cat;
import animal.Dog;

public class AnimalHospitalMain02 {
    public static void main(String[] args) {
        AnimalHospital dogHospital = new AnimalHospital();
        AnimalHospital catHospital = new AnimalHospital();
        Dog dog = new Dog("멍멍이",30);
        Cat cat = new Cat("냐옹이",20);
        dogHospital.set(dog);
        catHospital.set(cat);
        dogHospital.check();
        catHospital.check();
    }
}
