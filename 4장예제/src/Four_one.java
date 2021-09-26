public class Four_one {
    int radius;
    String name;
    public Four_one() { }
    public double getArea() {
        return 3.14*radius*radius;
    }
    public static void main(String[] args) {
        Four_one pizza;
        pizza = new Four_one();
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Four_one donut = new Four_one();
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
