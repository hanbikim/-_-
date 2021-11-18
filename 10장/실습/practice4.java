
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class practice4 extends JFrame{
    String str = new String("Love Java");
    JLabel la= new JLabel(str);
    int i=1;

    public practice4() {
        setTitle("Left 키로 문자열 이동");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.addKeyListener(new MyKeyListener());
        c.add(la);

        setSize(300,150);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode){
                case KeyEvent.VK_LEFT:
                    la.setText(str.substring(i)+str.substring(0,i));
                    i++;
                    i%=str.length();
                    break;
            }
        }
    }
    public static void main(String [] args) {
        new practice4();
    }

}
