package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test0102 {
    public static void main(String[] args) throws IOException {
        //Scanner로 입력받은 이름과 전화번호를 한 줄에 한 사람씩 c:\Temp\phone.txt파일에 저장하라.
        //"그만"을 입력하면 프로그램을 종료한다.
        Scanner scanner = new Scanner(System.in);
        System.out.println("전화번호를 입력하세요");
        /*
        try {
            FileWriter fileWriter = new FileWriter("temp/phone.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            while(true) {
                System.out.println("전화번호를 입력하세요.  ex) 장성호 010-1111-1111");
                String phone = scanner.nextLine();
                if(phone.equals("그만")) break;
                bufferedWriter.write(phone);
                bufferedWriter.newLine(); //줄바꿈
            }
            System.out.println("전화번호가 저장되었습니다.");
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            scanner.close();
        }
         */
        //try with resources
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("temp/phone.txt"));
        //9 버전 이상에서만 가능
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("temp/phone.txt"))) {
            while(true) {
                System.out.println("전화번호를 입력하세요.  ex) 장성호 010-1111-1111");
                String phone = scanner.nextLine();
                if(phone.equals("그만")) break;
                bufferedWriter.write(phone);
                bufferedWriter.newLine(); //줄바꿈
            }
            System.out.println("전화번호가 저장되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            scanner.close();
        }
    }
}
