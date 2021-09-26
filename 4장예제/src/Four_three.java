public class Four_three {
    int radius;
    String name;
    public Four_three() {
        radius = 1;
        name = "";
    }
    public Four_three(int r, String n) {
        radius = r;
        name = n;
    }
    public double getArea() {
        return 3.14*radius*radius;
    }
    public static void main(String[] args) {
        Four_three pizza = new Four_three(10, "자바피자");
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Four_three donut = new Four_three();
        donut.name = "도넛피자";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
