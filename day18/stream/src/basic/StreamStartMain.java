package basic;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamStartMain {
    public static void main(String[] args) {
        //stream  실개천
        List<String> names = List.of("Apple", "Banana", "Berry", "Tomato");
        //대문자 B로 시작하는 애들 뽑아서 전부 대문자로 바꾸기
        Stream<String> stream = names.stream();
        List<String> result =
                stream.filter((s) -> s.startsWith("B"))
                        .map((s) -> s.toUpperCase())
                        .toList();
        //System.out.println(result);


        //스트림은 한번 쓰고 나면 끝... 재활용 안됨 다시 만들어서 써야 한다.
        Stream<String> stream02 = names.stream();
        List<String> result02 =
                stream02.filter(new Predicate<String>() {
                            @Override
                            public boolean test(String s) {
                                return s.startsWith("B");
                            }
                        })
                        .map(new Function<String, String>() {

                            @Override
                            public String apply(String s) {
                                return s.toUpperCase();
                            }
                        })
                        .toList();
        for (String str : result) {
            System.out.print(str + ",");
        }
        System.out.println();
        names.stream()
                .filter(name -> name.startsWith("B"))
                .map(String::toUpperCase)    //중간 연산  데이터 걸러내거나(filter) 형태를 바꾸거나(map)
                .forEach(System.out::println);  //최종 연산
        //stream의 특징
        //1.원본을 훼손하지 않는다. 데이터 변경이 일어나지 않는다.
        //2. 1회용이다 한번 사용하면 재활용 불가능 필요하면 다시 생성해서 써야 한다.
        //3. pipe line 구성을 할 수 있다. 중간연산(filer,map 등) -> 최종연산(forEach,reduce 등)
        //4. 지연 연산 (Lazy Operation) 중간연산이 필요할때까지 실제로 동작 안한다. 최종연산이 실행될때 한번에 처리 된다.
        //5. 병렬 처리가 용이하다.  parallel stream을 만들 수 있다.


    }
}
