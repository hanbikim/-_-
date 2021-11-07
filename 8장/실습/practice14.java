import java.io.*;
import java.util.*;

public class practice14 {
    public static void list(File dir){
        System.out.println("\t["+dir.getPath()+"]");
        File[] subFiles = dir.listFiles();

        for(int i=0; i<subFiles.length;i++){
            File file = subFiles[i];
            String re = "";
            if(file.isDirectory())
                re="file";
            else
                re="dir";
            System.out.println(re+"\t"+file.length()+"바이트\t"+file.getName());
        }
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("***** 파일 탐색기입니다. *****");
        String destination = "C:\\";
        File f = new File(destination);

        list(f);
        for(;;){
            System.out.print(">>");
            try {
                String str = scanner.nextLine();
                if (str.equals("그만"))
                    return;
                else if (str.equals("..")) {
                    destination = new File(destination).getParent();
                    list(new File(destination));
                }
                else {
                    StringTokenizer st = new StringTokenizer(str, " ");
                    int n = st.countTokens();
                    if (n == 1) {
                        destination += "\\" + str;
                        list(new File(destination));
                    }
                    else {
                        if (st.nextToken().equals("mkdir")) {
                            String token = st.nextToken();
                            File f2 = new File(destination + "\\" + token);
                            f2.mkdir();
                            System.out.println(token + " 디렉터리를 생성하였습니다.");
                            list(new File(destination));

                        }
                        else {
                            String be = st.nextToken();
                            String aft= st.nextToken();
                            File f3 = new File(destination+"\\"+be);
                            f3.renameTo(new File(destination+"\\"+aft));
                            System.out.println(be + "를 "+aft+"로 이름을 변경하였습니다.");
                            list(new File(destination));
                        }
                    }
                }
            }catch (NoSuchElementException e){
                System.out.println("두 개의 파일명이 주어지지 않았습니다.");
                continue;
            }
        }
    }
}
