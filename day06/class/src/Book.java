public class Book {
    //제목 title , 저자 author
    String title;
    String author;
    public Book() {
        this("제목없음","작자미상");
        //System.out.println("나는 작자미상을 출력합니다.");
    }
    public Book(String title) {
        this(title,"작자미상");
    }
    public Book(String title, String author) {
        this.title = title;
        this.author=author;
    }
}
