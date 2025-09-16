package lamda.lamda01;

import lamda.MyFunction;

public class LamdPassMain01 {
    public static void main(String[] args) {
        //람다를 변수에 대입할 수 있다.
        MyFunction add = (int a,int b)-> a+b;
        MyFunction sub = (int a,int b)-> a-b;
        System.out.println("add.apply(1,2) = "+add.apply(1,2));
        System.out.println("sub.apply(1,2) = "+sub.apply(1,2));
        MyFunction cal = add;
        System.out.println("cal(add).apply(1,2) = "+cal.apply(1,2));
        cal = sub;
        System.out.println("cal(sub).apply(1,2) = "+cal.apply(1,2));

    }
}
