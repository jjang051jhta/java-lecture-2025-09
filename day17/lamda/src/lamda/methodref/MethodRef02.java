package lamda.methodref;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRef02 {
    public static void main(String[] args) {
        Person person01 = new Person("kim");
        Person person02 = new Person("lee");
        Person person03 = new Person("park");

        //person01.introduce();
        Function<Person,String> function01 = (Person person) -> person.introduce();
        System.out.println("person01.introduce() = "+function01.apply(person01));
        System.out.println("person02.introduce() = "+function01.apply(person02));
        System.out.println("person03.introduce() = "+function01.apply(person03));

        Function<Person,String> function02 = Person::introduce;
        System.out.println("person01.introduce() = "+function02.apply(person01));
        System.out.println("person02.introduce() = "+function02.apply(person02));
        System.out.println("person03.introduce() = "+function02.apply(person03));



    }
}
