package lamda.methodref;

import java.util.function.Supplier;

public class MethodRef01 {
    public static void main(String[] args) {
        Supplier<String> staticMethod01 = () -> Person.greeting();  //()은 즉시 호출명령어이다.
        Supplier<String> staticMethod02 =  Person::greeting;
        System.out.println("staticMethod01 : "+staticMethod01.get());
        System.out.println("staticMethod02 : "+staticMethod02.get());

        Person person = new Person("jjang");
        Supplier<String> instanceMethod01 = () -> person.introduce();
        Supplier<String> instanceMethod02 = person::introduce;
        System.out.println("instanceMethod01 : "+instanceMethod01.get());
        System.out.println("instanceMethod02 : "+instanceMethod02.get());

        Supplier<Person> newPerson01 = () -> new Person();
        Supplier<Person> newPerson02 = Person::new;
        System.out.println("newPerson01 : "+newPerson01.get());
        System.out.println("newPerson02 : "+newPerson02.get());

    }
}
