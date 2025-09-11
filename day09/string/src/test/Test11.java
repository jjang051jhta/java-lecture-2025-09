package test;

public class Test11 {
    public static void main(String[] args) {

        //Person person = new Person("장성호");
        //Person person02 = new Person("장동건");
        Person persons [] = new Person[2];
        persons[0] = new Person("장성호");
        persons[1] = new Person("장동건");
        int i=0;
        while(true) {
            if(persons[i].turn()) {
                System.out.println(persons[i].getName()+"님이 이겼습니다.");
                break;
            } else {
                System.out.println("아쉽습니다.");
                i++;
                i%= persons.length;
            }
        }
    }
}
