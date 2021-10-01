public class Rectangle {
    int x;
    int y;
    int width;
    int height;

    public  Rectangle(int X, int Y, int Width, int Height){
        x=X;
        y=Y;
        width=Width;
        height=Height;
    }

    public int square(){
        return x*y;
    }

    public void show(){
        System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
    }

    public boolean contains(Rectangle r){
        if((r.x>this.x&&r.x<this.x+this.width)||(r.y>this.y&&r.y<this.y+this.height)){
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 2, 8,7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 "+s.square());
        if(t.contains(r))
            System.out.println("t는 r을 포함합니다");
        if(t.contains(s))
            System.out.println("t는 s을 포함합니다");
    }
}
