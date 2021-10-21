import java.util.Scanner;
class Person {
    int n1;
    int n2;
    int n3;
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public boolean game() {
        n1 = (int) ((Math.random()*3)+1);
        n2 = (int) ((Math.random()*3)+1);
        n3 = (int) ((Math.random()*3)+1);
        System.out.print("\t"+n1+"  "+n2+"  "+n3);
        if(n1 == n2 && n1 == n3)
            return true;
        else
            return false;
    }
}

public class practice10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1번째 선수 이름>>");
        String name=scanner.nextLine();
        Person p1 = new Person(name);

        System.out.print("2번째 선수 이름>>");
        name=scanner.nextLine();
        Person p2 = new Person(name);

        String buffer = scanner.nextLine();
        while(true) {
            System.out.print("["+p1.name+"]:<Enter>");
            buffer=scanner.nextLine();
            if(p1.game()) {
                System.out.println(p1.name+"님이 이겼습니다!");
                break;
            }
            System.out.println("아쉽군요!");

            System.out.print("["+p2.name+"]:<Enter>");
            buffer=scanner.nextLine();
            if(p2.game()) {
                System.out.println(p2.name+"님이 이겼습니다!");
                break;
            }
            System.out.println("아쉽군요!");
        }
    }
}
