package test;

import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        String strArray[] =  {"가위","바위","보"};
        Scanner scanner = new Scanner(System.in);
        String result = "";
        while(true) {

            String humanChoice = scanner.nextLine();
            if(humanChoice.equals("그만")) break;
            String computerChoice = strArray[(int)(Math.random()*3)];
            System.out.println(computerChoice);
            //switch문으로
            /*
            if(humanChoice.equals(computerChoice)) {
                result="비겼습니다.";
            } else if(humanChoice.equals("가위") && computerChoice.equals("보") ) {
                result="사람이 이겼습니다.";
            } else if(humanChoice.equals("바위") && computerChoice.equals("가위") ) {
                result="사람이 이겼습니다.";
            } else if(humanChoice.equals("보") && computerChoice.equals("바위") ) {
                result="사람이 이겼습니다.";
            } else {
                result="컴퓨터가 이겼습니다.";
            }
             */
            if(humanChoice.equals(computerChoice)) {
                result="비겼습니다.";
            } else {
                result = switch (humanChoice) {
                    case "가위" -> computerChoice.equals("보") ? "당신이 이겼습니다.":"컴퓨터가 이겼습니다.";
                    case "바위" -> computerChoice.equals("가위") ? "당신이 이겼습니다.":"컴퓨터가 이겼습니다.";
                    case "보" -> computerChoice.equals("바위") ? "당신이 이겼습니다.":"컴퓨터가 이겼습니다.";
                    default -> "잘못된 입력입니다.";
                };
            }
            System.out.println(result);

        }
    }
}
