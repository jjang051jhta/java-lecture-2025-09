package iter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Integer max = Collections.max(list);
        System.out.println(max);

        Integer min = Collections.min(list);
        System.out.println(min);

        Collections.shuffle(list);
        System.out.println(list);



    }
}
