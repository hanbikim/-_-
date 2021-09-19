import java.util.Scanner;
public class Three_four {
    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);

        String s= scanner.next();
        char c = s.charAt(0);
        int num= (int)c; //아스키 코드
        int length= num-97;
        for(int i=0; i<=length;i++){ //4
            for(int j=97;j<=num;j++){//
                char C = (char)j;
                System.out.print(C);
            }
            System.out.println();
            num--;

        }


    }
}
