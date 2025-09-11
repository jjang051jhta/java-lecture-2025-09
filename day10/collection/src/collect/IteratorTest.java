package collect;

import java.util.*;

//iterable  순회 for each
public class IteratorTest {
    public static void main(String[] args) {
        String strArray[] = {"apple","apple","apple","banana","peach"};
        List<String> arrayList = new ArrayList<>(Arrays.asList(strArray));
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        System.out.println("=======================");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //퀴즈 랜덤한 1~100사이의 숫자를 가지는 arrayList 100개를 만들고 그 합을 구하시오.
        List<Integer> integers = new ArrayList<>();
        for(int i=0;i<100;i++) {
            Random random = new Random();
            int num = random.nextInt(100)+1;
            integers.add(num);
        }
        int sum = 0;
        Iterator<Integer> integerIterator = integers.iterator();
        //
        while (integerIterator.hasNext()) {
            sum+=integerIterator.next();
        }

        System.out.println(sum);
        System.out.println("===================");
        String strArray02[] = {"apple","banana","peach"};
        List<String> arrayList02 = new ArrayList<>(Arrays.asList(strArray02));
        Iterator<String> stringIterator = arrayList02.iterator();
        while(stringIterator.hasNext()) {
            String str =  stringIterator.next();
            if(str.equals("apple")) {
                stringIterator.remove();
            }
        }
        System.out.println(arrayList02);
        /*
        for(String str:arrayList02) {
            if(str.equals("apple")) {
                arrayList02.remove(str); //제거 안됨 예외 발생
                //System.out.println("apple 있습니다.");

            }
        }
         */
    }
}
