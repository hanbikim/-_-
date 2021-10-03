import java.util.Random;

public class practice10 {
    public static void main (String[] args) {
        Random random = new Random();

        int a[][]= new int[4][4];
        //6 삽입
        int rand[]=new int[6];
        for(int i=0; i<6;i++){
            rand[i]=random.nextInt(15);
            for(int j=0; j<i; j++){
                if(rand[i]==rand[j]){
                    i--;
                }
            }
        }
        for(int i=0; i<6; i++) {
            int row=rand[i]/4;
            int column=rand[i]%4;
            a[row][column]=6;
        }

        //random 삽입
        for (int i = 0; i <4; i++) {
            for (int j = 0; j <4; j++) {
                if(a[i][i]!=0) {
                    a[i][j]=random.nextInt(10)+1;
                }

            }
        }
        //print
        for (int i = 0; i <4; i++) {
            for (int j = 0; j <4; j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }
}
