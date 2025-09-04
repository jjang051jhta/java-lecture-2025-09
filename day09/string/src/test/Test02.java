package test;

public class Test02 {
    public static void main(String[] args) {
        //String[] arr = {"hello", "java", "jvm", "spring", "jpa"} 에 있는 모든 문자열의 길이의 합을 구하는 코드를 작성하시오.
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            String str =  arr[i];
            int len =  str.length();
            sum+=len;
            System.out.println(str +" : "+len);
        }
        System.out.println("sum : "+sum);
        for(String s:arr){
            int len =  s.length();
            sum+=len;
            System.out.println(s +" : "+len);
        }
        System.out.println("sum : "+sum);
    }
}
