import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class practice6 extends JFrame {
    private JLabel la = new JLabel("C");
    public practice6() {
        setTitle("클릭 연습용 응용프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        c.addMouseListener(new MyMouseListener());

        la.setLocation(100, 100);
        la.setSize(20, 20);
        c.add(la);
        setSize(300, 300);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    class MyMouseListener extends MouseAdapter{
        public void mouseClicked(MouseEvent e) {
                int x = (int) (Math.random() * 250);
                int y = (int) (Math.random() * 250);
                //JLabel la = (JLabel) e.getSource();
                la.setLocation(x, y);

        }
    }

    public static void main(String [] args) {
        new practice6();
    }
}
