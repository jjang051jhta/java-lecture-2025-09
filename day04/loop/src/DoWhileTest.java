public class DoWhileTest {
    public static void main(String[] args) {
        /*
        int i=100;
        do {
            System.out.print(i+",");
            i++;
        }
        while (i<10);
         */
        char c = 'A'; //char  정수로 변환가능
        System.out.println((int)'가');
        System.out.println((int)'각');
        System.out.println((int)'힣');
        do {
            System.out.print(c);
            c = (char)(c+1);
        } while (c<='Z');

    }
}
