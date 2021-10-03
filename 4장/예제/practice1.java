public class practice1 {
    int radius;
    String name;
    public practice1() { }
    public double getArea() {
        return 3.14*radius*radius;
    }
    public static void main(String[] args) {
        practice1 pizza;
        pizza = new practice1();
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        practice1 donut = new practice1();
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
