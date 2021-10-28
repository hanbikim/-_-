import java.util.*;

class Word { // 영어 단어와 한글 단어를 쌍으로 가진 하나의 단어 표현
    private String english; // 영어 단어
    private String korean; // 영어 단어에 해당하는 한글 단어
    public Word(String english, String korean) {
        this.english = english;
        this.korean = korean;
    }
    public String getEnglish() {
        return english;
    }
    public String getKorean() {
        return korean;
    }

}
public class practice12 {
    Scanner scanner = new Scanner(System.in);
    Vector<Word> vec = new Vector<Word>();
    public practice12(){
        vec.add(new Word("love", "사랑"));
        vec.add(new Word("animal", "동물"));
        vec.add(new Word("emotion", "감정"));
        vec.add(new Word("human", "인간"));
        vec.add(new Word("stock", "주식"));
        vec.add(new Word("trade", "거래"));
        vec.add(new Word("society", "사회"));
        vec.add(new Word("baby", "아기"));
        vec.add(new Word("honey", "애인"));
        vec.add(new Word("dall", "인형"));
        vec.add(new Word("bear", "곰"));
        vec.add(new Word("picture", "사진"));
        vec.add(new Word("painting", "그림"));
        vec.add(new Word("fault", "오류"));
        vec.add(new Word("example", "보기"));
        vec.add(new Word("eye", "눈"));
        vec.add(new Word("statue", "조각상"));

    }
    private boolean exists(int n[], int index) {
        for(int i=0; i<n.length; i++) {
            if(n[i] == index)
                return true;
        }
        return false;
    }

    private void Question(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("현재 " + vec.size() + "개의 단어가 들어 있습니다. -1을 입력하면 테스트를 종료합니다.");
        while(true) {
            int answerIndex = (int) (Math.random() * vec.size());
            String eng = vec.get(answerIndex).getEnglish();

            System.out.println(eng + "?");
            int example[] = new int [4];

            int index=0;
            for(int i=0;i<example.length;i++){
                do {
                    index = (int)(Math.random()*vec.size());
                }
                while(index == answerIndex || exists(example, index)); // 다시 시도
                example[i] = index;
            }

            int answerLoc = (int)(Math.random()*example.length);
            example[answerLoc] = answerIndex;

            for(int i=0; i<example.length; i++)
                System.out.print("(" + (i+1) + ")" + vec.get(example[i]).getKorean() + " ");

            System.out.print(":>");
            int input = scanner.nextInt();
            if(input == -1)
                break;

            input--;
            if(input == answerLoc)
                System.out.println("Excellent !!");
            else
                System.out.println("No. !!");

        }

    }

    private void Insert(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
        while(true) {
            System.out.print("영어 한글 입력 >> ");
            String eng = scanner.next(); // 영어 단어 읽기
            if(eng.equals("그만"))
                break;

            String kor = scanner.next(); // 한글 단어 읽기
            vec.add(new Word(eng, kor));
        }

    }

    private void quiz(){
        System.out.println("**** 영어 단어 테스트 프로그램 명품영어 입니다. ****");
        while (true) {
            System.out.println("단어 테스트:1, 단어 삽입:2. 종료:3>> ");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    Question();
                    break;
                case 2:
                    Insert();
                    break;
                case 3:
                    System.out.println("명품영어를 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 입력하였습니다.");
            }
        }
    }



    public static void main(String[] args) {
        practice12 qz=new practice12();
        qz.quiz();
    }


}
