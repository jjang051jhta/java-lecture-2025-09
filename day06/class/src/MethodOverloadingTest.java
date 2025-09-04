public class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading(); //heap 메모리에 생성
        int result01 = methodOverloading.getSum(10, 10);
        int result02 = methodOverloading.getSum(10, 10, 10);
        double result03 = methodOverloading.getSum(10, 10);
        //GC  Garbage Collector  gc가 알아서 객체를 소멸시켜준다.
        //레퍼런스가 사라지면 수거대상이 됨...
        Book book01 = new Book("홍길동전");
        Book book02 = new Book("전우치전");
        book02 = book01;
        System.gc();
        //
        String a = new String("AAA");
        String b = new String("BBB");
        String c = new String("CCC");
        String d, e;
        a = null; //가비지 수거대상
        d = c;    //수거대상이 안됨
        c = null; //수거대상이 안됨
        //즉 참조가 하나라도 걸려있으면 gc의 대상이 되지 않는다
    }
}
