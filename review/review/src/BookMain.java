public class BookMain {
    public static void main(String[] args) {
        Book myBook = new Book(); //생성자 함수
        //myBook.title="자바는 즐거워";
        //myBook.author="고슬링";
        Book java = new Book("자바는 즐거워","고슬링");
        myBook.showInfo();
        java.showInfo();
    }
}
