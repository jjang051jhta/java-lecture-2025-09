import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class Lotto03 {
    public static void main(String[] args) {
        //age=10,name="장성호";
        //TV samsung = new TV();
        //samsung.size= 90;
        //samsung.ch(11);  mbc
        //samsung.turnOff();

        int[] nums = new int[45];
        Arrays.setAll(nums, num -> ++num);

        //shuffle
        for(int i=0;i<46;i++) {
            int random01 =  (int)(Math.random()*45);
            int random02 =  (int)(Math.random()*45);
            if(random01==random02) {
                i--;
                continue;
            }
            int temp =  nums[random01];
            System.out.print(temp+"/");
            nums[random01] = nums[random02];
            nums[random02] = temp;
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
