package review01;

public class AnimalPolyMain01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();
        /*
        System.out.println("동물이 소리를 냅니다.");
        dog.sound();
        System.out.println("동물이 소리를 멈춥니다.");
        System.out.println("동물이 소리를 냅니다.");
        cat.sound();
        System.out.println("동물이 소리를 멈춥니다.");
        System.out.println("동물이 소리를 냅니다.");
        caw.sound();
        System.out.println("동물이 소리를 멈춥니다.");

         */
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        flyAnimal(bird);
        flyAnimal(chicken);
        //익명
    }
    static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물이 소리를 냅니다.");
        animal.sound();
        System.out.println("동물이 소리를 멈춥니다.");
    }
    static void flyAnimal(Fly animal) {
        System.out.println("동물이 소리를 냅니다.");
        animal.fly();
        System.out.println("동물이 소리를 멈춥니다.");
    }

}
