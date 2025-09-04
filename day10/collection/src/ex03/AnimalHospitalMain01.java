package ex03;

import animal.Cat;
import animal.Dog;

public class AnimalHospitalMain01 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();
        Dog dog = new Dog("멍멍이",30);
        Cat cat = new Cat("냐옹이",20);
        dogHospital.set(dog);
        catHospital.set(cat);
        dogHospital.check();
        catHospital.check();
    }
}
