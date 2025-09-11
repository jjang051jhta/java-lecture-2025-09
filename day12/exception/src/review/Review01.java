package review;

public class Review01 {
    public static void main(String[] args) {
        //자바 예외 상황
        //1. 강제성을 띄는 checked exception
        //2. 강제성을 띄지 않는 unchecked exception

        //compile time
        //run time (논리적 오류)
        try {
            int result = 10 / 0; //오류(error)는 아니다.
        } catch (RuntimeException e) {
            //여깅에 터질 것으로 예상되는 예외를 적어준다.
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("여기는 항상 실행됩니다.");
        }
    }
}
