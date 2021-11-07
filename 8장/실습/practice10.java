import java.io.*;
import java.util.*;

public class practice10 {
    String fileName = "C:\\Users\\user\\8실습\\phone10.txt";
    HashMap<String, String> phoneMap = new HashMap<String, String>();

    public static void main(String[] args) {
        practice10 phone = new practice10();
        phone.read();
        phone.find();
    }

    public void read() {
        try {
            Scanner fscanner = new Scanner(new FileReader(new File(fileName)));
            while (fscanner.hasNext()) {
                String name = fscanner.next();
                String tel = fscanner.next();
                phoneMap.put(name, tel);
            }
            fscanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("총 " + phoneMap.size() + "개의 전화번호를 읽었습니다.");
    }

    public void find() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름>> ");
            String name = scanner.next();
            if (name.equals("그만"))
                break;
            String phonenum = phoneMap.get(name);
            if (phonenum == null)
                System.out.println("찾는 이름이 없습니다.");
            else
                System.out.println(phonenum);
        }
    }

}

