/*
실습과제2 #10
 */
import java.util.Scanner;

public class practice10 {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 원의 중심과 반지름 입력");
        int cx1 = scanner.nextInt();
        int cy1 = scanner.nextInt();
        int r1 = scanner.nextInt();
        System.out.print("두번째 원의 중심과 반지름 입력");
        int cx2 = scanner.nextInt();
        int cy2 = scanner.nextInt();
        int r2 = scanner.nextInt();

        double distance;
        int xd, yd;
        yd=(int) Math.pow((cy2-cy1),2);
        xd=(int) Math.pow((cx2-cx1),2);
        distance= Math.sqrt(yd+xd);

        if(distance <(r1+r2)){
            System.out.println("두 원은 서로 겹친다.");
        }
        else{
            System.out.println("두 원은 서로 겹치지 않는다.");
        }

    }
}