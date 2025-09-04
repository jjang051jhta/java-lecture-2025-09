public class SwitchTest {
    public static void main(String[] args) {
        //switch
        int score = 95;
        if (score > 90) {
            System.out.println("A");
        } else if (score > 80) {
            System.out.println("B");
        } else if (score > 70) {
            System.out.println("C");
        } else if (score > 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        //switch statement  자바 14버전 이후에 등장한 switch expression
        switch (score / 10) {
            //case 리터럴에 들어갈 수 있는 것들  1.문자, 2.문자열, 3. 정수
            case 10:
                //System.out.println("A");
                //break;
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }

        int num = 2;
        String result = switch (num) {
            case 1 -> "one";
            case 2 -> "two";
            default -> "etc";
        };
        System.out.println(result);

        String result02 = switch (score / 10) {
            case 10,9 -> {
                System.out.println("똑똑합니다.");
                yield "A";
            }
            case 8 -> {
                System.out.println("조금 더 노력하시면 A 받을 수 있어요.");
                yield "B";
            }
            case 7 -> "C";
            case 6 -> "D";
            default -> {
                System.out.println("낙제 재수강헤야합니다.");
                yield "F";
            }
        };
        System.out.println(result02);
    }
}
