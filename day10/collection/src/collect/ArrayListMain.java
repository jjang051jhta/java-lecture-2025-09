package collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        String strArray[] = {"apple","apple","apple","banana","peach"};
        //List<String> arrayList = Arrays.asList(strArray); //추가 안됨.
        List<String> arrayList = new ArrayList<>(Arrays.asList(strArray));
        arrayList.add("melon");
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("apple");
//        arrayList.add("banana");
//        arrayList.add("peach");
//        arrayList.add("melon");
        arrayList.set(2,"grape");

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(3));
        arrayList.remove("apple");

        arrayList.remove(1);
        arrayList.add(2,"orange");
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.contains("apple"));
        System.out.println(arrayList.isEmpty());
        arrayList.clear();
        System.out.println(arrayList);
        System.out.println(arrayList.isEmpty());
        List<String> list = new LinkedList<>(); //Node (이중 연결 리스트  즉 앞뒤노드 참조값을 모두 갖고 있다.) 로 연결된다.
        //장점은 삽입 삭제가 빠르다. 대신에 조회는 느리다.
        //arrayList    A -> B -> X-> C -> D  순차적으로 나열되어 있다.
        //linkedList    A <-> B <-> X <-> C <-> D
        //배열이나 ArrayList는 항상 뒤에서 밀어넣는다.
        /*
        int dataTotal = 100000;
        int insertData = 10000;
        List<Integer> arrayList02 = new ArrayList<>();
        for(int i=0;i<dataTotal;i++) {
            arrayList02.add(i);
        }
        List<Integer> linkedList02 = new LinkedList<>();
        for(int i=0;i<dataTotal;i++) {
            linkedList02.add(i);
        }
        long startTime = System.currentTimeMillis();
        for(int i=0;i<insertData;i++) {
            arrayList02.add((int)(Math.random()*dataTotal),i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
         */
    }
}
