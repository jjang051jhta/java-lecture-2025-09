package review01;

public class ClassMain {
    static final int RATIO = 10;
    //class 만드는 이유
    public static void main(String[] args) {
        //reference type
        //primitive type
        Student student01 = new Student();
        Student student02 = new Student();
        Student student03 = new Student("장성호",3,"정형돈",3,30);
        student01.setAge(10);
        student02.setAge(20);

        student01.setName("장세영");
        student02.setName("김진명");
        int data = 10;
    }
}
