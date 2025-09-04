package test;

import java.util.*;

public class Test0502 {
    public static void main(String[] args) {
        Map<String,Student> studentMap = new HashMap<>();
        studentMap.put("장성호",new Student("장성호","자바",1,4.2));
        studentMap.put("장동건",new Student("장동건","C++",2,3.5));
        studentMap.put("유재석",new Student("유재석","리액트",3,2.5));
        studentMap.put("하하",new Student("하하","오라클",4,3.25));
        /*
        Iterator<String> iterator = studentMap.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(studentMap.get(iterator.next()));
        }
         */
        /*
        Iterator<Student> iterator = studentMap.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
         */
        Iterator<Map.Entry<String,Student>> iterator = studentMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,Student> entry = iterator.next();
            System.out.println(entry.getKey()+" / "+entry.getValue());
        }
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String name = scanner.nextLine();
            if(name.equals("그만")) break;
            Student student = studentMap.get(name);
            System.out.println(student);
        }
    }
}
