class Sample{
    public int a;
    private int b;
    int c;
}
public class Four_ten {
    public static void main(String[] args) {
        Sample aClass = new Sample();
        aClass.a = 10;
        //aClass.b = 10; error: b is private, cannot access
        aClass.c = 10;
    }
}
