public class Four_four {
    String title;
    String author;
    public Four_four(String t) { // 생성자
        title = t;
        author = "작자미상";
    }
    public Four_four(String t, String a) { // 생성자
        title = t;
        author = a;
    }
    public static void main(String [] args) {
        Four_four littlePrince = new Four_four("어린왕자", "생텍쥐페리");
        Four_four loveStory = new Four_four("춘향전");
        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " + loveStory.author);
    }
}
