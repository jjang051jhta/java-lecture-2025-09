package basic.checked;

public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException {
        //checked 예외는 반드시 처리해야 한다. throw를 하던지 try를 하던지 둘 중 하나를 해야한다.
        // 만약 throw는 한다면 호출하는 부분에서 반드시 예외처리를 해야한다.
        Service service = new Service();
        service.cathThrow();
        System.out.println("정상종료");
    }
}
