import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalStartMain02 {
    private static final Map<Long,String> map = new HashMap<>();
    static {
        map.put(1L,"Kim");
        map.put(2L,"Jang");
    }
    static void findAndPrint(Long id) {
        Optional<String> optionalName = findNameById(id);
        String name = optionalName.orElse("UNKNOWN");
        System.out.println(id +" : "+name.toUpperCase());

    }
    static Optional<String> findNameById(Long id) {
        String findedName = map.get(id);
        Optional<String> optionalName =  Optional.ofNullable(findedName);
        //null을 어떻게 처리할건지 강제할 수 있다.
        return optionalName;
    }
    public static void main(String[] args) {
        findAndPrint(1L);
        findAndPrint(3L);
    }
}
