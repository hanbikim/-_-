/*
실습과제2 #6
 */
import java.util.Scanner;

public class practice6 {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1~99 사이의 정수를 입력하시오");
        int num = scanner.nextInt();
        int tens = num / 10;
        int unit = num % 10;

        if (tens % 3 == 0 && unit % 3 == 0) {
            System.out.println("박수짝짝");
        } else if (tens % 3 == 0 || unit % 3 == 0) {
            System.out.println("박수짝");
        }
    }
}