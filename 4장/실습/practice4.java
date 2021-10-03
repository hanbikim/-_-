public class practice4 {
    int x;
    int y;
    int width;
    int height;

    public practice4(int X, int Y, int w, int h){
        x= X;
        y=Y;
        width=w;
        height=h;
    }
    public int square(){
        return width*height;
    }
    public void show(){
        System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
    }
    public boolean contains(practice4 r){
        if((r.x<=x+width&&r.x>=x)&&(r.y<=y+height&&r.y>=y))
            return true;
        else
            return false;
    }
    public static void main(String [] args) {
        practice4 r = new practice4(2,2, 8,7);
        practice4 s = new practice4(5,5, 6,6);
        practice4 t = new practice4(1,1, 10,10);

        r.show();
        System.out.println("s의 면적은 "+s.square());
        if(t.contains(r))
            System.out.println("t는 r을 포함합니다.");
        if(t.contains(s))
            System.out.println("t는 s을 포함합니다.");

    }
}
