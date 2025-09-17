package basic;

import java.util.List;

public class LazyMain01 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> result =
                numbers.stream().filter(n -> {
                        boolean isEven = n%2==0;
                        System.out.println("filter()실행 : "+n+"("+isEven+")");
                        return isEven;
                    })
                .map(n->{
                    int mapperNum = n*10;
                    System.out.println("map() 실행 : "+n+"->"+mapperNum);
                    return mapperNum;
                })
                .toList();
        System.out.println("result==="+result);
        // DB에서 잘 필터링 해서 들고 오면 좋다.
        // Lazy operation vs  Eager operation  JPA (ORM)
    }
}
