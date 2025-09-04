package ex03;

import animal.Animal;

//타입을 한정시킬 수 있다.
public class AnimalHospital03 <T extends Animal> {
    private T animal;
    public void set(T animal) {
        this.animal = animal;
    }

    public void check() {
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();
    }

    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}