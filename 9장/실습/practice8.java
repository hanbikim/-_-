import javax.swing.*;
import java.awt.*;

public class practice8 extends JFrame{
    practice8() {
        setTitle("여러 개의 패널을 가진 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        JPanel Nor = new JPanel();
        JPanel Cen = new JPanel();
        JPanel Sth = new JPanel();

        Nor.setBackground(Color.LIGHT_GRAY);
        Sth.setBackground(Color.YELLOW);

        c.add(Nor, BorderLayout.NORTH);
        c.add(Cen);
        c.add(Sth, BorderLayout.SOUTH);

        JButton b1 = new JButton("열기");
        JButton b2 =new JButton("닫기");
        JButton b3 =new JButton("나가기");
        Nor.add(b1);
        Nor.add(b2);
        Nor.add(b3);

        JButton b4 =  new JButton("Word Input");
        JTextField text= new JTextField(10);
        Sth.add(b4);
        Sth.add(text);

        for(int i=0; i<10; i++){
            int x=(int)(Math.random()*200+50);
            int y= (int)(Math.random()*200+50);

            JLabel lb = new JLabel("*");
            lb.setLocation(x,y);
            lb.setSize(10, 10);
            lb.setForeground(Color.RED);
            lb.setOpaque(true);
            c.add(lb);
        }
        setVisible(true);
        setSize(400, 400);
    }

    public static void main(String[] args) {
        new practice8();
    }
}
