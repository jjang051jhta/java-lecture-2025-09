public class StringBuilderTest {
    public static void main(String[] args) {
        //String이 자주 바뀐다면 메모리 낭비가 생긴다.
        StringBuilder stringBuilder = new StringBuilder();
        String str02 = stringBuilder
                         .append("a")
                         .append("b")
                         .append("c")
                         .append("d")
                         .insert(4,"Java")
                         .reverse()
                         .toString();
        System.out.println(stringBuilder);
        //stringBuilder.append("B");
        //stringBuilder.append("C");
        //stringBuilder.append("D");
        System.out.println(stringBuilder);
        int total = 100000;
        long startTime = System.currentTimeMillis();
        String str = "";
        for(int i=0;i<total;i++) {
            str+="a";
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        System.out.println("============================");
        long startTime02 = System.currentTimeMillis();
        StringBuilder stringBuilder02 = new StringBuilder();
        for(int i=0;i<total;i++) {
            stringBuilder02.append("a");
        }
        long endTime02 = System.currentTimeMillis();
        System.out.println(endTime02 - startTime02);
    }
}
