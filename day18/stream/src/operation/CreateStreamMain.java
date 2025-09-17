package operation;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStreamMain {
    public static void main(String[] args) {
        System.out.println("1. 컬렉션에서 생성");
        List<String> list = List.of("a","b","c");
        Stream<String> stream01 = list.stream();
        stream01.forEach(System.out::println);

        System.out.println("2. 배열에서 생성");
        String [] arr = {"a","b","c"};
        Stream<String> stream02 = Arrays.stream(arr);
        stream02.forEach(System.out::println);

        System.out.println("3. Stream으로 직접 생성");
        Stream<String> stream03 = Stream.of("a","b","c");
        stream03.forEach(System.out::println);

        //무한 스트림...
        Stream<Integer> infiniteStream01 = Stream.iterate(0, num -> num+2);
        infiniteStream01.limit(3)
                      .forEach(System.out::println);

        //무한 스트림...
        Stream<Double> infiniteStream02 = Stream.generate(() -> Math.random()*100);
        infiniteStream02.limit(3)
                .forEach(System.out::println);

        //기본 타입 스크림
        IntStream.range(1,5).forEach(System.out::println);
        IntStream.rangeClosed(1,5).forEach(System.out::println);

    }
}
