package iter;

import java.util.Arrays;

public class SortMain01 {
    public static void main(String[] args) {
        Integer [] array = {7,9,4,3,5,2,1};
        System.out.println(Arrays.toString(array));
        System.out.println("기본정렬");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
