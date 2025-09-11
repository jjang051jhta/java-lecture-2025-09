public class ObjectMain {
    public static void main(String[] args) {
        Object point = new Point(10,20);
        System.out.println(point.getClass().getName());
        System.out.println(point.hashCode());
        System.out.println(point.toString());
        System.out.println(point);

        Point point01 = new Point(100,100);
        Point point02 = new Point(100,100);
        Point point03 = point01; //같은 참조값을 가지고 있으면 ==
        if(point01==point02) {
            System.out.println("point01==point02");
        } else {
            System.out.println("point01!=point02");
        }
        if(point01.equals(point02)) {
            System.out.println("같은 좌표입니다.");
        } else {
            System.out.println("다른 좌표입니다.");
        }
        if(point01==point03) {
            System.out.println("point01==point03");
        } else {
            System.out.println("point01!=point03");
        }
    }
}
