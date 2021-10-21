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

public class practice12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("겜블링 게임에 참여할 선수 숫자>>");
        int n=scanner.nextInt();
        String name;
        Person[] person = new Person[n];
        for(int i=0;i<n; i++){
            System.out.print((i+1)+"번째 선수 이름>>");
            name=scanner.next();
            person[i]=new Person(name);
        }
        String buffer = scanner.nextLine();

        while(true) {
            for(int i=0; i<n;i++) {
                System.out.print("[" + person[i].name + "]:<Enter>");
                buffer = scanner.nextLine();

                if (person[i].game()) {
                    System.out.println(person[i].name + "님이 이겼습니다!");
                    return;
                }
                System.out.println("아쉽군요!");
            }
       }
    }
}
