public class practice9 {
    public static void main(String[] args) {
        String a = new String("Good");
        String b = new String("Bad");
        String c = new String("Normal");
        String d, e;
        a = null; // a가 가리키던 "Good"이 garbage
        d = c;
        c = null;
    }
}
