public class Four_five {
    String title;
    String author;
    void show() {
        System.out.println(title + " " + author);
    }
    public Four_five() {
        this("", "");
        System.out.println("생성자 호출됨");
    }
    public Four_five(String title) {
        this(title, "작자미상");
    }
    public Four_five(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public static void main(String [] args) {
        Four_five littlePrince = new Four_five("어린왕자", "생텍쥐페리");
        Four_five loveStory = new Four_five("bible");
        Four_five emptyBook = new Four_five();
        loveStory.show();

    }
}
