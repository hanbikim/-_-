public class Three_Two {

    public static void main (String[] args) {
        int n[][] = new int[5][];
        n[0] = new int[1];
        n[1] = new int[3];
        n[2] = new int[1];
        n[3] = new int[4];
        n[4] = new int[2];
        n[0][0]=1;
        n[2][0]=1;

        for(int i=0; i<n[1].length;i++){
            n[1][i]=i;
            n[1][i]=n[1][i]+1;
        }
        for(int i=0; i<n[3].length;i++){
            n[3][i]=i+1;
        }
        for(int i=0; i<n[4].length;i++){
            n[4][i]=i+1;
        }

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++)
                System.out.print(n[i][j]+" ");
            System.out.println();
        }
    }
}
