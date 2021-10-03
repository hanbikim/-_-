import java.util.Scanner;

public class practice2 {
    int width;
    int height;
    public int getArea() {
        return width*height;
    }
    public static void main(String[] args) {
        practice2 rect = new practice2(); // 객체 생성
        Scanner scanner = new Scanner(System.in);
        System.out.print(">> ");
        rect.width = scanner.nextInt();
        rect.height = scanner.nextInt();
        System.out.println("사각형의 면적은 " + rect.getArea());
        scanner.close();
    }
}
