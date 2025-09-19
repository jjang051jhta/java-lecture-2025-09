package review04.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMain {
    public static void main(String[] args) throws Exception {
        //Class class가 있다.
        //class의 각종 메타 정보를 다룰때 쓴다.
        //reflection 클래스에 정의된 메서드와 필드를 조회할 수 있다.
        //Class clazz =String.class;
        //Class clazz =new String().getClass();
        Class clazz =Class.forName("java.lang.String"); // db연결할때 쓰는 방법...
        Field [] fields = clazz.getDeclaredFields();
        for(Field field : fields) {
            System.out.println("Field : "+field.getType()+" / "+field.getName());
        }
        Method [] methods = clazz.getDeclaredMethods();
        for(Method method: methods) {
            System.out.println("Method : "+method);
        }
        System.out.println("============================");
        Class helloClass = Class.forName("review04.clazz.Hello");
        //reflection 클래스에 정의된 메서드 필드등을 조회하는 기법 어노테이션 정보도 읽어서 기능을 수행하게 할 수 있다.
        Hello hello = (Hello)helloClass.getDeclaredConstructor().newInstance();
        String result =  hello.hello();
        System.out.println(result);
    }
}
