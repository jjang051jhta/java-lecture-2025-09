package collect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        //순서보장 없다
        Map<String, String> map = new HashMap<>();
        map.put("사과","apple");
        map.put("복숭아","peach");
        map.put("멜론","melon");
        System.out.println(map.get("사과"));

        Map<Integer, String> map02 = new HashMap<>();
        map02.put(1,"apple");
        map02.put(2,"peach");
        map02.put(3,"melon");
        map02.put(4,"melon");
        map02.put(5,"melon");
        map02.put(6,"melon");
        map02.put(7,"melon");
        map02.put(8,"melon");
        map02.put(9,"melon");
        map02.put(10,"melon");
        //System.out.println(map.get(1));
        //System.out.println(map.size());
        Iterator<Integer> iterator = map02.keySet().iterator();
        Iterator<String> iterator02 = map02.values().iterator();
        Iterator<Map.Entry<Integer,String>>  iterator03 =  map02.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(map02.get(iterator.next()));
        }
        while (iterator02.hasNext()) {
            System.out.println(iterator02.next());
        }
        while (iterator03.hasNext()) {
            Map.Entry<Integer,String> entry = iterator03.next();
            System.out.println(entry.getKey()+"==="+entry.getValue());
        }


        /*
        for(int i=0;i<map02.size();i++) {
            System.out.println(map02.get(i+1));
        }
         */
    }
}
