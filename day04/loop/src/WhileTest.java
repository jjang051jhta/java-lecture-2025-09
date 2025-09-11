public class WhileTest {
    public static void main(String[] args) {
        //loop break, continue
        int i=0;
//        while(true) {
//            System.out.print(i+",");
//            i++;
//            if(i>10) {
//                break;
//            }
//        }
        for(;;) {
            System.out.print(i+",");
            i++;
            if(i>10) break;
        }
        //scanner 이용해서 정수를 입력받아서 -1이 입력되면 종료하는데
        //이때 입력된 정수의 갯수와 평균을 출력하시오.
    }
}
