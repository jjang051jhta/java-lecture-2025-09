package test;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Test0804 {
    private static final MemberRepository memberRepository = new ObjectMemberRepository();
    public static void main(String[] args) {
        //1.메모리저장

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.회원 등록 | 2.회원 목록 조회 | 3.종료");
            System.out.println("선택");
            int choice=-1;
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("정수를 입력하셔야 합니다.");
                scanner.nextLine();
                continue;
            }
            switch (choice) {
                case 1:
                    resister(scanner);
                    break;
                case 2:
                    showMemberList();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 입력하세요.");
            }
        }
    }

    private static void showMemberList() {
        List<Member> memberList = memberRepository.findAll();
        System.out.println("회원목록 : ");
        for(Member member : memberList) {
            System.out.printf("[ID : %s, Name : %s, Age : %d] \n",
                    member.getID(), member.getName(), member.getAge());
        }
    }

    private static void resister(Scanner scanner) {
        System.out.println("ID 입력");
        String id = scanner.nextLine();
        System.out.println("Name 입력");
        String name = scanner.nextLine();
        System.out.println("Age 입력");
        int age = scanner.nextInt();
        scanner.nextLine();
        Member member = new Member(id,name,age);
        memberRepository.add(member);
    }
}
