import java.util.Scanner;
import java.util.Calendar;

class Player{
    Calendar now = Calendar.getInstance();
    Scanner scanner= new Scanner(System.in);
    String name;
    String buf;
    int secA;
    int secB;

    public Player(String name){
        this.name=name;
    }
    public int enter() {
        buf = scanner.nextLine();
        now = Calendar.getInstance();
        System.out.println("현재 초 시간 = "+ now.get(Calendar.SECOND));
        return now.get(Calendar.SECOND);
    }

    public int play(){
        System.out.print(name+" 시작 <Enter>키  >>");
        secA= enter();
        System.out.print("10초 예상 후 <Enter>키  >>");
        secB = enter();

        if(secA<secB)
            return secB-secA;
        else
            return  (60-secA) + secB;
    }
}
public class practice6 {
    public static void main(String[] args) {
        Player player1 = new Player("황기태");
        Player player2 = new Player("이재문");

        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
        int result1 = player1.play();
        int result2 = player2.play();

        if(Math.abs(result1 - 10) < Math.abs(result2 - 10))
            System.out.println("황기태의 결과 "+result1+", 이재문의 결과 "+result2+", 승자는 황기태");
        else
            System.out.println("황기태의 결과 "+result1+", 이재문의 결과 "+result2+", 승자는 이재문");
    }
}
