import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args) {
        String queryString = new String("name=장성호&addr=일산&age=30");
        StringTokenizer stringTokenizer = new StringTokenizer(queryString,"&");
        while(stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
        /*
        if(stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
         */
    }
}
