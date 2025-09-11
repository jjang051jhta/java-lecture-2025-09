import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        //array
        // 순서없는 것들에 순서 매기는 것
        //전주영  김진명  김동선 홍석진
        int num01 = 10;
        int num02 = num01;
        System.out.println(num01==num02);
        num02 = 30;
        System.out.println(num01==num02);
        String strArray []  = new String[4];
        strArray[0]="전주영";
        strArray[1]="김진명";
        strArray[2]="김동선";
        strArray[3]="홍석진";
        String refArray [] = strArray;
        refArray[3] = "홍길동";
        System.out.println(strArray[3]);
        System.out.println(refArray[3]);
        String strArray02 [] = {"장성호","장동건","정우성","차은우"};

        System.out.println(strArray02[1]);

        for(int i=0;i<4;i++) {
            System.out.print(strArray[i]+"/");
        }
        //정수 다섯개를 가지는 배열을 하나 만들어서
        // 가장 큰 숫자 출력해보기...
        int [] intArray = {10,30,100,25,67};
        int max = intArray[0];
        for(int i=1;i<5;i++) {
            if(intArray[i]>max) {
                max = intArray[i];
            }
        }
        System.out.println("max ==="+max);
        int money =  345670;
        int units[] = {50000,10000,5000,1000,500,100,50,10};
        //money50000 = 345670/50000;
        for(int i=0;i<7;i++) {
            //System.out.println(units[i]);
            int jang = money/units[i];
            if(jang==0) continue;
            System.out.println(units[i]+"원권 "+ jang);
            money =  money % units[i];
        }
    }
}
