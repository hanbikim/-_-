import java.util.Scanner;

public class Three_fourteen {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("과목이름");
        String name= scanner.next();

        String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int score[]={95, 88, 76, 62, 55};
        int index=-1;

        for(int i=0; i< course.length;i++){
            if(course[i].equals(name)) {
                index=i;
            }
        }
        if(index==-1)
            System.out.print("없는 과목입니다.");
        else
            System.out.print(course[index]+"의 점수는 "+score[index]);
    }
}
