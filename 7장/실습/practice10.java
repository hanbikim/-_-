import java.util.Scanner;
import java.util.Vector;

public class practice10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Shape> vec = new Vector<Shape>();
        Shape shape = null;

        System.out.println("그래픽 에디터 beauty를 실행합니다.");
        while(true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
            int menu = scanner.nextInt();

            switch(menu) {
                case 1:
                    System.out.print("Line(1), Rect(2), Circle(3) >> ");
                    int menu1 = scanner.nextInt();
                    switch(menu1) {
                        case 1:
                            shape = new Line();
                            break;
                        case 2:
                            shape = new Rect();
                            break;
                        case 3:
                            shape = new Circle();
                            break;
                    }
                    vec.add(shape);
                    break;

                case 2:
                    System.out.print("삭제할 도형의 위치 >> " );
                    int position = scanner.nextInt();
                    if(vec.size() == 0 || vec.size() <= position)
                        System.out.println("삭제할 수 없습니다.");
                    else
                        vec.remove(position);
                    break;

                case 3:
                    for(int i=0; i<vec.size(); i++)
                        vec.get(i).draw();
                    break;

                case 4:
                    System.out.println("beauty를 종료합니다.");
                    return;
            }
        }
    }
}

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
    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape {
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Circle");
    }
}
