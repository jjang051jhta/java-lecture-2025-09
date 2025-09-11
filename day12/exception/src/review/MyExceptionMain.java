package review;

public class MyExceptionMain {
    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void checkAge(int age) throws MyException {
        if(age < 18) {
            throw new MyException("미성년자는 입장할 수 없습니다.");
        }
        System.out.println("입장하세요.");
    }
}
