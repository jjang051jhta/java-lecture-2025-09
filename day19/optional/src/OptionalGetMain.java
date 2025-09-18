import java.util.Optional;
import java.util.function.Supplier;

public class OptionalGetMain {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.of("hello");
        Optional<String> optionalEmpty = Optional.empty();
        System.out.println(optionalValue);
        System.out.println(optionalEmpty);
        System.out.println("optionalValue.isPresent()===" + optionalValue.isPresent());
        System.out.println("optionalEmpty.isPresent()===" + optionalEmpty.isPresent());

        System.out.println("optionalValue.isPresent()===" + optionalValue.isEmpty());
        System.out.println("optionalEmpty.isPresent()===" + optionalEmpty.isEmpty());

        System.out.println("optionalValue.get()===" + optionalValue.get()); //get()을 사용하면 된다.
        //System.out.println("optionalEmpty.get()==="+optionalEmpty.get());
        System.out.println("optionalValue.orElse()===" + optionalValue.orElse("기본값"));
        System.out.println("optionalEmpty.orElse()===" + optionalEmpty.orElse("기본값"));

        String value01 = optionalValue.orElseGet(() -> {
            //값을 받기 전에 뭔가를 해야할때
            System.out.println("람다 실행 후 optionalValue");
            return "new value";
        });
        String value02 = optionalEmpty.orElseGet(() -> {
            System.out.println("람다 실행 후 optionalValue");
            return "new value";
        });
        System.out.println(value01);
        System.out.println(value02);


        String value03 = optionalValue.orElseThrow(() -> new RuntimeException("값이 없습니다."));
        System.out.println(value03);
        //   NPE 문제 때문에 등장한게 Optional이다
        try {
            String value04 = optionalEmpty.orElseThrow(() -> new RuntimeException("값이 없습니다."));
            System.out.println(value04);
        } catch (Exception e) {
            System.out.println("예외 발생");
        }
    }
}
