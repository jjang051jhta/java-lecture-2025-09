import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class Lotto02 {
    public static void main(String[] args) {
        //1~45
        int[] nums = new int[45];
        //for(int i=0;i<45;i++) {
        //    nums[i] = i+1;
        //}
        /*
        Arrays.setAll(nums, new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return operand+1;`
            }
        });
         */
        Arrays.setAll(nums, num -> ++num);
        //shuffle
        for(int i=0;i<46;i++) {
            int random =  (int)(Math.random()*45);
            int temp =  nums[i];
            System.out.print(temp+"/");
            nums[i] = nums[random];
            nums[random] = temp;
        }
        /*
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+"==="+b);
         */
        int [] lotto = Arrays.copyOf(nums,6);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(lotto));
        Arrays.sort(lotto);
        System.out.println(Arrays.toString(lotto));
    }
}
