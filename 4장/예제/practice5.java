public class practice5 {
    String title;
    String author;
    void show() {
        System.out.println(title + " " + author);
    }
    public practice5() {
        this("", "");
        System.out.println("생성자 호출됨");
    }
    public practice5(String title) {
        this(title, "작자미상");
    }
    public practice5(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public static void main(String [] args) {
        practice5 littlePrince = new practice5("어린왕자", "생텍쥐페리");
        practice5 loveStory = new practice5("bible");
        practice5 emptyBook = new practice5();
        loveStory.show();

    }
}
