import java.util.ArrayList;
import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        ArrayList<Character> arr = new ArrayList<Character>();
        Scanner scanner= new Scanner(System.in);
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> ");

        for(int i=0; i<6; i++) {
            char ch = scanner.next().charAt(0);
            arr.add(ch);
        }

        float sum=0;
        for(int i=0; i< arr.size(); i++) {
            char ch = arr.get(i);
            switch(ch) {
                case 'A':
                    sum+=4;
                    break;
                case 'B':
                    sum+=3;
                    break;
                case 'C':
                    sum+=2;
                    break;
                case 'D':
                    sum+=1;
                    break;
                case 'F':
                    sum+=0;
                    break;
            }
        }
        float average=sum/arr.size();
        System.out.println(average);
    }
}
