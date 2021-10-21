public class practice2 {
    int x;
    int y;
    int radius;

    public practice2(int X, int Y, int Radius){
        x=X;
        y=Y;
        radius=Radius;
    }

    public boolean equals(Object comp) {
        practice2 c = (practice2) comp;
        if (c.x == x && c.y == y)
            return true;
        else
            return false;
    }
    public String toString() {
        return "Circle("+x+","+y+")반지름"+radius;
    }

    public static void main(String[] args) {
        practice2 a = new practice2(2, 3, 5); // 중심 (2, 3)에 반지름 5인 원
        practice2 b = new practice2(2, 3, 30); // 중심 (2, 3)에 반지름 30인 원
        System.out.println("원 a : " + a);
        System.out.println("원 b : " + b);
        if(a.equals(b))
            System.out.println("같은 원");
        else
            System.out.println("서로 다른 원");
    }
}
