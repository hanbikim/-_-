class TV{
    private int size;
    public TV(int size){
        this.size=size;
    }
    protected int getSize(){
        return size;
    }
}

class colorTV extends TV{
    private int color;
    colorTV(int size, int color){
        super(size);
        this.color=color;
    }
    protected void printProperty(){
        System.out.print(getSize()+"인치 "+color+"컬러");
    }
    protected int getColor(){
        return color;
    }
}

class IPTV extends colorTV{
    private String ip;
    IPTV(String ip, int size, int color){
        super(size, color); //ip보다 위에
        this.ip=ip;
    }
    protected void printProperty(){
        System.out.print("나의 IPTV는 "+ip+" 주소의 ");
        super.printProperty(); //super 사용
    }
}
public class practice2 {
    public static void main(String[] args){
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);

        iptv.printProperty();
    }
}
