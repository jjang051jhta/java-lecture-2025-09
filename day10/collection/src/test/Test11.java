package test;

import java.util.ArrayDeque;
import java.util.Deque;

class BrowserHistory {
    private Deque<String> history = new ArrayDeque<>();
    private String currentPage =  null;
    public void visitPage(String url) {
        if(currentPage!=null) {
            history.push(currentPage);
        }
        currentPage = url;
        System.out.println("방문 : "+url);
    }

    public String goBack() {
        if(!history.isEmpty()) {
            currentPage = history.pop();
            System.out.println("뒤로 가기 : "+currentPage);
            return currentPage;
        }
        return "더 이상 방문한 페이지가 없습니다.";
    }
}
public class Test11 {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();
        // 사용자가 웹페이지를 방문하는 시나리오
        browser.visitPage("youtube.com");
        browser.visitPage("google.com");
        browser.visitPage("facebook.com");
        // 뒤로 가기 기능을 사용하는 시나리오
        String currentPage1 = browser.goBack();
        System.out.println("currentPage1 = " + currentPage1);
        String currentPage2 = browser.goBack();
        System.out.println("currentPage2 = " + currentPage2);
        String currentPage3 = browser.goBack();
        System.out.println("currentPage3 = " + currentPage3);

    }
}

