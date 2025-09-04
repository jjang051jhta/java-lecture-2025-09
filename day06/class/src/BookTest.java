public class BookTest {
    public static void main(String[] args) {
        // null
        Book myBook = new Book();
        Book hong = new Book("춘향전");
        Book littlePrince =
                new Book("어린왕자","쌩텍쥐베리");
        System.out.println(myBook.title);
        System.out.println(myBook.author);
        System.out.println("제목은 " + hong.title +
                " 저자는 " + hong.author);
        System.out.println("제목은 " + littlePrince.title +
                " 저자는 " + littlePrince.author);
        Circle circle01 = new Circle(100);
        Circle circle02 = circle01; //복사안됨 레퍼런스가 복사된다.
        // 즉 heap 메모리의 주소값을 가지고 온다.
        circle02.setRadius(300);
        System.out.println(circle01.radius+" / " +circle02.radius);

        String str2 = "\u2003hello\u2003"; // U+2003 = EM SPACE
        System.out.println("[" + str2.trim() + "]");

    }
}
