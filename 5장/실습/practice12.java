import java.util.Scanner;

abstract class Shape {
    private Shape next;
    public Shape() {
        next = null;
    }
    public void setNext(Shape obj) {
        next = obj;
    }
    public Shape getNext() {
        return next;
    }
    public abstract void draw();
}

class Line extends Shape {
    String name ="line";
    public void draw() {
        System.out.println("Line");
    }
}
class Rect extends Shape {
    String name ="Rect";
    public void draw() {
        System.out.println("Rect");
    }
}
class Circle extends Shape {
    String name ="circle";
    public void draw() {
        System.out.println("Circle");
    }
}

public class practice12 {
    public void run() {
        System.out.println("그래픽 에디터 beauty를 실행합니다.");
        while(true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
            int num = sc.nextInt();
            switch(num) {
                case 1:
                    System.out.print("Line(1), Rect(2), Circle(3) >> ");
                    num = sc. nextInt();
                    insert(num);
                    break;
                case 2:
                    System.out.print("삭제할 도형의 위치 >> ");
                    num = sc.nextInt();
                    delete(num);
                    break;
                case 3:
                    print();
                    break;
                case 4:
                    System.out.println("beauty을 종료합니다.");
                    sc.close();
                    return;
            }
        }
    }
}
