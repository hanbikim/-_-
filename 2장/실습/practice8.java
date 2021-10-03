/*
실습과제2 #8
 */
import java.util.Scanner;

public class practice8{
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("직사각형을 구성하는 두점을 입력하시오");
        System.out.print("(x1, y1): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.print("(x2, y2): ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        if((x1 >=100&& x1<=200)&&(y1 >=100&& y1<=200) || (x2 >=100&& x2<=200)&&(y2 >=100&& y2<=200)){
            System.out.println("충돌 합니다.");
        }
        else{
            System.out.println("충돌하지 않습니다.");
        }

    }
}