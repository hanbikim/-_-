import java.io.*;

public class practice8 {
    public static void main(String[] args) {
        File file = new File("C:\\");
        File [] files =file.listFiles();

        long maxsize=0;
        File max=null;

        for(int i=0; i<files.length; i++) {
            File j = files[i];
            if(!j.isFile())
                continue;
            long size = j.length();
            if(maxsize<size){
                maxsize=size;
                max=j;
            }
        }

        System.out.println("가장 큰 파일은 "+max.getPath()+" "+maxsize+"바이트");
    }
}
