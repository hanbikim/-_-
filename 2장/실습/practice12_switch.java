/*
실습과제2 #12
switch 문
 */
import java.util.Scanner;

public class practice12_switch{
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        String str;

        System.out.print("연산");
        int a= scanner.nextInt();
        str= scanner.next();
        int b =scanner.nextInt();
        int result=0;
        switch(str){
            case "+":
                result = a+b;
                break;
            case "-":
                result = a-b;
                break;
            case "*":
                result = a*b;
                break;
            case "/":
                if(b==0){
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                else{
                    result = a/b;
                }
                break;
        }
        System.out.println(a+str+b+"의 계산 결과는 "+ result);
    }
}