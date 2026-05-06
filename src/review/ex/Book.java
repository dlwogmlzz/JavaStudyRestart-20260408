package review.ex;

public class Book {
    String title;   // 제목
    String author;  // 저자
    int page;   // 페이지 수

    public Book() {
        this("","",0);
//        this.title = "";
//        this.author = "";
    }
    public Book(String title, String author) {
        this(title, author, 0); // 생성자 에서만 사용할 수 있다.
//        this.title = title;
//        this.author = author;
//        this.page = 0;
    }

    // 메인 생성자.
    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지수: " + page);
    }
}
