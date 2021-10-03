/*
실습과제2 #12
if 문
 */
import java.util.Scanner;

public class practice12_if {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        String str;

        System.out.print("연산");
        int a= scanner.nextInt();
        str= scanner.next();
        int b =scanner.nextInt();
        int result=0;
        if(str.equals("+")){
            result = a+b;
        }
        else if(str.equals("-")){
            result = a-b;
        }
        else if(str.equals("*")){
            result = a*b;
        }
        else if(str.equals("/")){
            if(b==0){
                System.out.println("0으로 나눌 수 없습니다.");
            }
            else{
                result = a/b;
            }
        }
        System.out.println(a+str+b+"의 계산 결과는 "+ result);
    }
}
