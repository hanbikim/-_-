public class practice4 {
    String title;
    String author;
    public practice4(String t) { // 생성자
        title = t;
        author = "작자미상";
    }
    public practice4(String t, String a) { // 생성자
        title = t;
        author = a;
    }
    public static void main(String [] args) {
        practice4 littlePrince = new practice4("어린왕자", "생텍쥐페리");
        practice4 loveStory = new practice4("춘향전");
        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " + loveStory.author);
    }
}
