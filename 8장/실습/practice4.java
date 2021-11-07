import java.io.*;
import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        try {
            Scanner fscanner=new Scanner(new FileReader("c:\\windows\\system.ini"));

            int num=1;
            while (fscanner.hasNext()) {
                String line=fscanner.nextLine();
                System.out.printf("%4d", num++);
                System.out.println(": "+line);
            }
            fscanner.close();
        }
        catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
