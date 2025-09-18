package operation;

import java.util.IntSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamMain {
    public static void main(String[] args) {
        //숫자 Int,Double,Long  기본 스트림보다 좀 더 특화된 느낌...
        IntStream intStream = IntStream.of(1,2,3,4,5);
        intStream.forEach(n-> System.out.print(n+" "));
        System.out.println();
        IntStream rangeStream01 = IntStream.range(1,6);  //1,2,3,4,5
        IntStream rangeStream02 = IntStream.rangeClosed(1,5);  //1,2,3,4,5
        System.out.println(rangeStream01.sum());
        System.out.println(rangeStream02.max().getAsInt()); //
        System.out.println(IntStream.range(1,6).max().getAsInt()); //
        System.out.println(IntStream.range(1,6).average().getAsDouble());
        System.out.println(IntStream.range(1,6).count());

        IntSummaryStatistics statistics = IntStream.range(1,6).summaryStatistics();
        System.out.println("statistics.getMax() = "+statistics.getMax());
        System.out.println("statistics.getMin() = "+statistics.getMin());
        System.out.println("statistics.getSum() = "+statistics.getSum());
        System.out.println("statistics.getCount() = "+statistics.getCount());
        System.out.println("statistics.getAverage() = "+statistics.getAverage());
        //API를 모두 외울 수는 없다.  이거 만든 사람도 모를걸요?  쓰는 것만 쓰게 된다.

        LongStream mappedLong = IntStream.range(1,6).mapToLong(n->n*10L);
        DoubleStream mappedDouble = IntStream.range(1,6).mapToDouble(n->n*1.5);
        System.out.println(mappedLong.average().orElse(0));
        System.out.println(mappedDouble.average().orElse(0));  //숫자에 특화된 Stream
        //반복문이 제일 빠음 (for 가 제일 빠르다. )
        //일반 stream은 느리다.
        //IntStream, DoubleStream 등은 연산에 있어서 for문보다 빠르다.

    }
}
