import java.util.Scanner;

class Concert{
    private String S[];
    private String A[];
    private String B[];
    Scanner scanner = new Scanner(System.in);

    Concert() {
        S = new String[10];
        A = new String[10];
        B = new String[10];
        for (int i = 0; i < S.length; i++) {
            S[i] = "___";
            A[i] = "___";
            B[i] = "___";
        }
    }

    public static void printSeat(String seat[]) {
        for(int i=0; i<seat.length; i++) {
            System.out.print(" "+seat[i]+" ");
        }
        System.out.println();
    }

    public void allSeat() { //조회
        System.out.print("S>>");
        Concert.printSeat(S);
        System.out.print("A>>");
        Concert.printSeat(A);
        System.out.print("B>>");
        Concert.printSeat(B);
        System.out.println("<<<조회를 완료하였습니다.>>>");
    }

    public void Reservation_Seats() { //현황 예매전
        while(true) {
            System.out.print("좌석구분 S(1), A(2), B(3)>>");
            int select = scanner.nextInt();
            switch(select) {
                case 1:
                    System.out.print("S>>");
                    printSeat(S);
                    Reservation(S);
                    return;
                case 2:
                    System.out.print("A>>");
                    printSeat(A);
                    Reservation(A);
                    return;
                case 3:
                    System.out.print("B>>");
                    printSeat(B);
                    Reservation(B);
                    return;
                default:
                    System.out.println("다시 입력해 주세요.");
            }
        }
    }

    public void Reservation(String seat[]) {
        System.out.print("이름>>");
        String name = scanner.next();
        while(true) {
            System.out.print("번호>>");
            int num = scanner.nextInt();
            num=num-1;
            if(seat[num].equals("___")) {
                seat[num] = name;
                break;
            }
            else {
                System.out.println("다른 좌석을 선택해 주세요.");
            }
        }
    }

    public void Delete_Seats() { //현황 취소전
        while(true) {
            System.out.print("좌석 S:1, A:2, B:3>>");
            int select = scanner.nextInt();
            switch(select) {
                case 1:
                    System.out.print("S>>");
                    printSeat(S);
                    Cancel(S);
                    return;
                case 2:
                    System.out.print("A>>");
                    printSeat(A);
                    Cancel(A);
                    return;
                case 3:
                    System.out.print("B>>");
                    printSeat(B);
                    Cancel(B);
                    return;
                default:
                    System.out.println("다시 입력해 주세요.");
            }
        }
    }

    public void Cancel(String seat[]) {
        System.out.print("이름>>");
        String name = scanner.next();
        for(int i=0; i<seat.length; i++) {
            if(name.equals(seat[i])) {
                seat[i] = "___";
                break;
            }
        }
    }

}
public class practice12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        Concert concert = new Concert();

        while(true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
            int select = scanner.nextInt();
            switch(select) {
                case 1:
                    concert.Reservation_Seats();
                    break;
                case 2:
                    concert.allSeat();
                    break;
                case 3:
                    concert.Delete_Seats();
                    break;
                case 4:
                    scanner.close();
                    return;
                default :
                    System.out.println("다시 입력해 주세요.");
            }
        }
    }
}
