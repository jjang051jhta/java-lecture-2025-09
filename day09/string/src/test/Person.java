package test;

import java.util.Random;
import java.util.Scanner;

public class Person {
    private String name;
    Scanner scanner = new Scanner(System.in);
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void getEnter() {
        scanner.nextLine(); //엔터키를 누른다.
    }
    public boolean turn() {
        System.out.println("["+name+"] : Enter");
        getEnter();
        int nums [] = new int[3];
        for(int i=0;i< nums.length;i++) {
            nums[i] = (int)(Math.random()*3)+1;
        }
        for(int i=0;i< nums.length;i++) {
            System.out.print(nums[i]+"\t");
        }
        System.out.println();
        boolean result = true;
        for(int i=1;i< nums.length;i++) {
            if(nums[i]!=nums[0]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
