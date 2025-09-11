import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntUnaryOperator;

public class ArraysTest {
    public static void main(String[] args) {
        //Arrays
        //collection  list
        //자바 array는 메서드가 없다. 불변(immutable)이다.
        String fruits[] = {"사과","바나나","포도"};
        //Arrays는 자바 array를 보충하기 위해 나온 util객체이다.
        int array[] = new int[5]; //[0,0,0,0,0]
        //Arrays.fill(array,1);
        //Arrays.fill(array,2,4,100);
        //Arrays.fill(array,0);
        Arrays.setAll(array, i -> i+1); //람다식으로 쓸 수 있다. [1,2,3,4,5]

        //int [] copyArray = array;
        int [] copyArray = Arrays.copyOf(array,array.length);
        //다른 복사본이 생긴다 즉 새로운 참조값을 가지는 array가 만들어 진다.
        array[2] = 100;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(copyArray));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        //static이 붙어 있으면 따로 선언하지 않고 사용이 가능하다.
        //자바 객체는 new를 생성자 함수를 통해서 Heap 메모리에 올려놓고 사용해야한다.
    }
}
