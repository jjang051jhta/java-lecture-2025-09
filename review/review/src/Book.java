public class Book {
    String title; //명사형태를 띈다.
    String author;
    //동사형태를 띈다.
    //생성자 함수
    public Book() {
        title="제목없음";
        author="저자없음";
    }
    public Book(String title, String author) {
        this.title = title;
        this.author= author;
    }
    public void showInfo() {
        System.out.println("제목은 "+title+"이고 저자는 "+author);
    }
}
