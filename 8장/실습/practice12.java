import java.io.*;
import java.util.*;

public class practice12 {
    File file =null;
    Vector<String> linevec= new Vector<String>();

    public static void main(String[] args) {
        practice12 wordsearch= new practice12();

        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        System.out.print("대상 파일명 입력>> ");
        Scanner scanner = new Scanner(System.in);
        String name=scanner.nextLine();

        wordsearch.read(name);

        while(true){
            System.out.print("검색할 단어나 문장>> ");
            String str = scanner.nextLine();
            if(str.equals("그만"))
                break;
            Vector<Integer> vec = wordsearch.search(str);
            wordsearch.print(vec);
        }

        scanner.close();
        System.out.println("프로그램을 종료합니다.");
    }

    public void read(String name){
        file =new File(name);

        try {
            Scanner scanner = new Scanner(new FileReader(file));
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                linevec.add(line);
            }
            scanner.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    private Vector<Integer> search(String str){
        Vector<Integer> vec = new Vector<Integer>();
        for(int i=0; i<linevec.size();i++){
            String line = linevec.get(i);
            if(line.indexOf(str) != -1)
                vec.add(i);
        }
        return vec;
    }

    private void print(Vector<Integer> vec){
        for(int i=0; i<vec.size();i++){
            int linen=vec.get(i);
            String line = linevec.get(linen);
            System.out.println(linen+":"+line);
        }
    }


}
