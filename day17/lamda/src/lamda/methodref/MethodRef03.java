package lamda.methodref;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodRef03 {
    public static void main(String[] args) {
        Person person01 = new Person("kim");
        Person person02 = new Person("lee");
        Person person03 = new Person("park");

        BiFunction<Person, Integer, String> biFunction01 =(Person person, Integer number) -> person.introduceWithNumber(number);
        System.out.println("biFunction01.introduceWithNumber(person01,30) = "+biFunction01.apply(person01,30));


        BiFunction<Person, Integer, String> biFunction02 =Person::introduceWithNumber;
        System.out.println("biFunction02.introduceWithNumber(person01,30) = "+biFunction02.apply(person01,30));




    }
}
