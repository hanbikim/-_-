import java.util.Scanner;

public class Three_sixteen {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        System.out.print("가위 바위 보!");
        String user= scanner.next();

        String str[]={"가위", "바위", "보"}; //0 1 2
        int n =(int)(Math.random()*3);

        if(user.equals("가위")){//0
            switch (n) {
                case 0: //
                    System.out.println("사용자 = "+user+" , 컴퓨터 = "+str[n]+", 비겼습니다");
                    break;
                case 1: //바위
                    System.out.println("사용자 = "+user+" , 컴퓨터 = "+str[n]+", 컴퓨터가 이겼습니다");
                    break;
                case 2: //보
                    System.out.println("사용자 = "+user+" , 컴퓨터 = "+str[n]+", 사용자가 이겼습니다");
                    break;
            }
        }
        else if(user.equals("바위")){
            switch (n) {
                case 0: //
                    System.out.println("사용자 = "+user+" , 컴퓨터 = "+str[n]+", 컴퓨터가 이겼습니다");
                    break;
                case 1: //바위
                    System.out.println("사용자 = "+user+" , 컴퓨터 = "+str[n]+", 비겼습니다");
                    break;
                case 2: //보
                    System.out.println("사용자 = "+user+" , 컴퓨터 = "+str[n]+", 사용자가 이겼습니다");
                    break;
            }

        }
        else{ //보 2
            switch (n) {
                case 0: //
                    System.out.println("사용자 = "+user+" , 컴퓨터 = "+str[n]+", 컴퓨터가 이겼습니다");
                    break;
                case 1: //바위
                    System.out.println("사용자 = "+user+" , 컴퓨터 = "+str[n]+", 사용자가 이겼습니다");
                    break;
                case 2: //보
                    System.out.println("사용자 = "+user+" , 컴퓨터 = "+str[n]+", 비겼습니다");
                    break;
            }

        }
    }
}
