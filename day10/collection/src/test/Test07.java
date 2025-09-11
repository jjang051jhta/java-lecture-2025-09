package test;

import java.util.*;

public class Test07 {
    public static void main(String[] args) {
        //treemap사용하면 순서도 보장 받을 수 있다.
        //treemap 키 순서를 사전순으로 나열  기본은 오름차순으로 정렬
        //LinkedHashMap은 입력 순서대로 정렬
        Map<String,Student> studentMap = new TreeMap<>(Comparator.reverseOrder());
        studentMap.put("장성호",new Student("장성호",4.3));
        studentMap.put("장동건",new Student("장동건",3.3));
        studentMap.put("유재석",new Student("유재석",2.13));
        studentMap.put("하하",new Student("하하",3.25));
        studentMap.put("고길동",new Student("고길동",4.4));
        studentMap.put("정형돈",new Student("정형돈",4.11));
        double scholarship = 4.0;
        Iterator<String> iterator = studentMap.keySet().iterator();
        while (iterator.hasNext()) {
            Student student = studentMap.get(iterator.next());
            if(student.getAvg()>scholarship){
                System.out.print(student.getName()+" / ");
            }
        }
    }
}
