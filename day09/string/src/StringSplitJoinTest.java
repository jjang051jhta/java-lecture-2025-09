public class StringSplitJoinTest {
    public static void main(String[] args) {
        //불변객체
        String str = "Apple,Peach,Melon";
        String [] strArray = str.split(",");
        for(String s:strArray) {
            System.out.println(s);
        }
        String joinedStr = String.join("-","A","B","C");
        System.out.println(joinedStr);
        String fruitsStr = String.join("/",strArray);
        System.out.println(fruitsStr);
    }
}
