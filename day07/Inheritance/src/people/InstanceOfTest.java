package people;

public class InstanceOfTest {
    /*
    static void printInfo(Researcher person) {
        System.out.println("연구자입니다.");
    }
    static void printInfo(Professor person) {
        System.out.println("교수입니다.");
    }
    static void printInfo(Student person) {
        System.out.println("학생입니다.");
    }
     */
    static void printInfo(Person person) {
        //System.out.println("학생입니다.");
        if (person instanceof Person) {
            System.out.println("사람입니다.");
        }
        if (person instanceof Student) {
            System.out.println("학생입니다.");
        }
        if (person instanceof Professor) {
            System.out.println("교수입니다.");
        }
        if (person instanceof Researcher) {
            System.out.println("연구자입니다.");
        }
    }


    public static void main(String[] args) {
        Student student = new Student("학생 장성호");
        Researcher researcher = new Researcher("연구자 장동건");
        Professor professor = new Professor("교수 정우성");
        printInfo(student);
        printInfo(researcher);
        printInfo(professor);

    }
}
