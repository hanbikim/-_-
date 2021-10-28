import java.util.*;

class Customer {
    String name;
    int point;
    Customer(String Name, int Point) {
        name = Name;
        point = Point;
    }

    public int getPoint() {
        return point;
    }
}

public class practice8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> hash = new HashMap<String, Integer>();

        System.out.println("** 포인트 관리 프로그램입니다 **");
        while(true) {
            System.out.print("이름과 포인트 입력 >> ");
            String name = scanner.next();

            if(name.equals("그만"))
                break;

            int point = scanner.nextInt();

            if(hash.get(name) == null) {
                hash.put(name, point);
            }
            else {
                hash.put(name, hash.get(name)+point);
            }
            Set<String> key = hash.keySet();
            Iterator<String> it = key.iterator();

            while(it.hasNext()) {
                String people = it.next();
                int sum = hash.get(people);
                System.out.print("("+people+","+sum+")");
            }
            System.out.println();
        }
    }
}
