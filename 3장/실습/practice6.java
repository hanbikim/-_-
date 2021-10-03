import java.util.Scanner;

public class practice6 {
    public static void main (String[] args) {
        Scanner scanner= new Scanner(System.in);
        int [] unit ={50000, 10000, 1000, 500, 100, 50, 1};
        int money=0;
        System.out.print("금액을 입력하시오");
        money=scanner.nextInt();

        for(int i=0; i< unit.length; i++){
            System.out.println(unit[i]+ "원 짜리: "+ money/unit[i]);
            money=money-(money/unit[i])*unit[i];
        }
    }
}
