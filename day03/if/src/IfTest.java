public class IfTest {
    public static void main(String[] args) {
        boolean condition = true;
        int myAge = 18;

        //비교연산자의 결과 boolean
        if (myAge > 20) {
            //중괄호안에 있는 문장을 실행
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }
        System.out.println("여기는 조건문 실행 후 출력문입니다.");
        System.out.println("==================");
        int score = 85;
        if (score > 80) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }
        System.out.println("==================");
        if (score > 90) {
            System.out.println("A");
        }
        if (score < 90 && score >= 80) {
            System.out.println("B");
        }
        if (score < 80 && score >= 70) {
            System.out.println("C");
        }
        //myAge를 이용해서 성인이어야 하고
        //boolean hasTicket이라는 변수가 참일때 입장가능합니다 출력하게
        myAge = 21;
        boolean hasTicket = true;
        /*
        if (myAge > 20) {
            if (hasTicket) {
                System.out.println("입장가능");
            } else {
                System.out.println("입장불가능 티켓사서 오세요");
            }
        }
        if (myAge > 20 && hasTicket) {
            System.out.println("입장가능");
        } else {
            System.out.println("입장불가능 티켓사서 오세요");
        }
         */
        if(myAge<20){
            System.out.println("미성년자입니다.");
            return;
        }
        if(hasTicket) {
            System.out.println("입장가능합니다.");
        }
        // 주어진 숫자가 짝수 인지 홀수인지 검증
        // 코드 가독성이 높아진다.
        int num = 281920;
        if(num%2 == 1) {
            System.out.println("홀수");
            return;
        }
        System.out.println("짝수");
    }
}

