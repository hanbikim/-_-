import java.util.Scanner;

class Circle{
    private double x, y;
    private int radius;
    public Circle(double x, double y, int radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }

    public int getRadius(){
        return radius;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
}

public class practice6 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        Circle c[];
        c = new Circle[3];

        for(int i=0 ; i<c.length; i++){
            System.out.print("x, y, radius>>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int r= scanner.nextInt();
            c[i]= new Circle(x, y, r);
        }

        int max= 0;
        for(int i=0; i<c.length; i++){
            if(c[max].getRadius()<c[i].getRadius())
                max=i;
        }
        System.out.println("가장 면적이 큰 원은 ("+c[max].getX()+","+c[max].getY()+")"+c[max].getRadius());

    }

}
