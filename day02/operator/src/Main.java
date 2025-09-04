//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //묵시적 형(type)변환(casting) 작은걸 큰거에 넣을때
        //작은게 큰거에 들어가는 경우 widening casting
        //명시적 형변환 큰거를 작은거에 넣을때 ()
        //묵시적 형변환
        int intVal = 100;
        long longVal = intVal;
        double doubleVal = longVal;

        System.out.println("intVal : "+intVal);
        System.out.println("longVal : "+longVal);
        System.out.println("doubleVal : "+doubleVal);

        double doubleVal02 = 10.99;
        int intVal02 = (int)doubleVal02;
        System.out.println("intVal02 : "+intVal02);

        //narrow casting
        long longVal02 = 23233232344L;
        int intVal03 = (int)longVal02;
        System.out.println("intVal03 : "+intVal03);
        System.out.println((double)10/4);
        System.out.println(10.0/4);

    }
}