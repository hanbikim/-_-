import java.util.Vector;
import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<Integer>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("강수량 입력 (0 입력시 종료) >> ");
            int num = scanner.nextInt();

            if(num == 0)
                break;
            vec.add(num);

            int average =0;

            for(int i=0; i<vec.size(); i++) {
                System.out.print(vec.get(i)+" ");
                average = average + vec.get(i);
            }
            System.out.println();
            average = average/vec.size();
            System.out.println("현재 평균 "+average);
        }





    }
}
