import java.lang.reflect.Array;
import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        //[]
        for (int j = 0; j < 6; j++) {
            int[] lotto = new int[6];
            int count = 0;
            boolean[] used = new boolean[46];
            //System.out.println(Arrays.toString(used));
            //중복제거 해보기...
            //[1,2,3,4,5,6,7~~45]
            while (count < 6) {
                int num = (int) (Math.random() * 45) + 1;//3
                if (!used[num]) {
                    used[num] = true;
                    lotto[count] = num;
                    count++;
                }
            }
            Arrays.sort(lotto);
            System.out.println(Arrays.toString(lotto));
        }
    }
}
