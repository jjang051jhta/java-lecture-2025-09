package people;

public class UpcastingTest {
    public static void main(String[] args) {
        Person person;
        Student student = new Student("장성호"); //
        person = student; //업캐스팅
        //down casting
        Person person02 = new Student("장동건");
        Student student02 = (Student) person02;

    }
}
