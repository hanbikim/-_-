class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x = x; this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    protected void move(int x, int y) {
        this.x =x; this.y = y; }
}

class ColorPoint extends Point {
    private String color;

    public ColorPoint() {
        super(0, 0);
        color = "Black";
    }

    public ColorPoint(int x, int y) {
        super(x, y);
        color = "Black";
    }

    protected void setXY(int x, int y) {
        super.move(x, y);
    }

    protected void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        String s = color + "색의 (" + super.getX() + "," + super.getY() + ") 점";
        return s;
    }
}

public class practice6 {
    public static void main(String[] args) {
        ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점
        System.out.println(zeroPoint.toString() + "입니다.");
        ColorPoint cp = new ColorPoint(10, 10); // (10,10) 위치의 BLACK 색 점
        cp.setXY(5,5);
        cp.setColor("RED");
        System.out.println(cp.toString()+"입니다.");
    }
}
