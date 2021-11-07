import javax.swing.*;
import java.awt.*;

public class practice4 extends JFrame {
    Color[] col= {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN,
            Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY};

    public practice4(){
        setTitle("Ten Color Buttons Frame");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new GridLayout(1,10));
        for(int i=0;i<10;i++){
            JButton btn = new JButton(i+"");
            btn.setBackground(col[i]);
            c.add(btn);
        }
        setSize(700,300);
    }

    public static void main(String[] args) {
        new practice4();
    }
}
