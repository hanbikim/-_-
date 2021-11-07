import java.io.*;
import java.util.Scanner;

public class practice6 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");

        System.out.print("첫번째 파일을 입력하세요>>");
        String txt1=scanner.nextLine();
        System.out.print("두번째 파일을 입력하세요>>");
        String txt2=scanner.nextLine();

        int c;
        try {
            FileReader f1 = new FileReader("C:\\Users\\user\\8실습\\"+txt1+".txt");
            FileReader f2= new FileReader("C:\\Users\\user\\8실습\\"+txt2+".txt");

            FileWriter fw = new FileWriter("C:\\Users\\user\\8실습\\appended.txt");

            while((c = f1.read()) != -1) { // 문자 하나 읽고
                fw.write((char)c); // 문자 하나 쓰고
            }
            while((c = f2.read()) != -1) { // 문자 하나 읽고
                fw.write((char)c); // 문자 하나 쓰고
            }
            f1.close();
            f2.close();
            fw.close();
            System.out.println("프로젝트 폴더 밑에 appended.txt 파일에 저장하였습니다.");
        } catch (IOException e) {
            System.out.println("파일 복사 오류");
        }
    }
}
