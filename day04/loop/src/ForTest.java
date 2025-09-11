public class ForTest {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1;i <= 10;i+=2) {
            //System.out.print(i+",");
            //2+4+6+8+10=30
            sum += i;
            System.out.print(i);
            if(i<9) {
                System.out.print("+");
            } else {
                System.out.print("=");
            }
        }
        System.out.print(sum);
    }
}
