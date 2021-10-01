import java.util.Scanner;

public class Grade {
    int math;
    int science;
    int english;

    public int average(){
        return (math+science+english)/3;
    }

    public static void main(String[] args) {
    Grade grd = new Grade();
    Scanner scanner = new Scanner(System.in);

    System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
    grd.math = scanner.nextInt();
    grd.science = scanner.nextInt();
    grd.english = scanner.nextInt();

    System.out.println("평균은 "+ grd.average());
    }

}
