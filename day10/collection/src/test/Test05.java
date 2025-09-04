package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test05 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("장성호","자바",1,4.2));
        studentList.add(new Student("장동건","C++",2,3.5));
        studentList.add(new Student("유재석","리액트",3,2.5));
        studentList.add(new Student("하하","오라클",4,3.25));
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
