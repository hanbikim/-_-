/*
실습과제2 #4
 */
import java.util.Scanner;

public class practice4 {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 3개 입력");
        int [] num= new int[3]; // input array
        for(int i=0; i<3;i++){
            num[i]= scanner.nextInt();
        }

        int max_index=0;
        for(int i=1; i<3; i++){ //find max index
            if(num[max_index]<num[i])
                max_index=i;
        }
        int temp=num[2];
        num[2]=num[max_index];
        num[max_index]=temp;

        if(num[0]<num[1]){
            System.out.println("중간 값은"+ num[1]);
        }
        else{
            System.out.println("중간 값은"+ num[0]);
        }
    }
}