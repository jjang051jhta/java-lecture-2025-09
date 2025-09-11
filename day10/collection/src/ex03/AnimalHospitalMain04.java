package ex03;

import animal.Cat;
import animal.Dog;

public class AnimalHospitalMain04 {
    public static void main(String[] args) {
        AnimalHospital03<Dog> dogHospital = new AnimalHospital03<>();
        AnimalHospital03<Cat> catHospital = new AnimalHospital03<>();
        //타입 안정성을 보장받을 수 있다.
    }
}
