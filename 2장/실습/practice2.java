/*
실습과제2 #2
 */
import java.util.Scanner;

public class practice2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("2자리수 정수 입력(10~99)");
        int num = scanner.nextInt();
        if( num/10 == num%10){
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        }
        else{
            System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
        }

    }
}
