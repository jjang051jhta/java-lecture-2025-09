package review04.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("사과","apple"); //Entry
        map.put("복숭아","peach");
        map.put("자두","plum");
        System.out.println(map.get("사과"));
        Iterator<String> iterator01 = map.keySet().iterator();
        Iterator<String> iterator02 = map.values().iterator();
        Iterator<Map.Entry<String,String>> iterator03 = map.entrySet().iterator();
        while (iterator01.hasNext()) {
            System.out.println(iterator01.next());
        }
        while (iterator02.hasNext()) {
            System.out.println(iterator02.next());
        }
        while (iterator03.hasNext()) {
            Map.Entry<String,String> entry = iterator03.next();
            System.out.println(entry.getKey()+"==="+entry.getValue());
        }

    }
}
