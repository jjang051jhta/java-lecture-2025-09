public class WrapperClassMain {
    public static void main(String[] args) {
        char c01 = '4';
        char c02 = 'F';
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.isDigit(c01)); //숫자 char인지
        System.out.println(Character.isAlphabetic(c01)); //문자 char인지
        String age = "10";
        int intAge = Integer.parseInt(age);
        Integer intValue = Integer.valueOf(100); //
        System.out.println(intValue.toString()); // "100"

        double pi = Double.parseDouble("3.14");

        if(intAge>=10) {
            System.out.println("10살 이상입니다.");
        } else {
            System.out.println("10살 미만입니다.");
        }
        //boxing vs unboxing
        Integer hundred = Integer.valueOf(100);
        int num =  hundred.intValue();
        Integer ten = 10; //Integer.valueOf(10)
        int num02 = ten; //ten.intValue();
    }
}
