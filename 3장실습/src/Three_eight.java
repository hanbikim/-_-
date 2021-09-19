import java.util.Random;
import java.util.Scanner;
public class Three_eight {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("정수 몇개?");
        int num= scanner.nextInt();

        //배열 선언
        int array[]= new int [num];

        //random
        for(int i=0; i<num;i++){
            array[i]=random.nextInt(100)+1;
            for(int j=0; j<i; j++){
                if(array[i]==array[j]){
                    i--;
                }
            }
        }
        for(int i=0; i<num; i++){
            System.out.print(array[i]+" ");
            if(i % 10 == 9) {
                System.out.println();
            }
        }
    }
}
