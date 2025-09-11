package review;

public class Exception02 {
    public static void main(String[] args) {
        int numbers [] = {1,2,3,4,5};
        try {
            System.out.println(numbers[7]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
