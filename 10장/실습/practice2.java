import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class practice2 extends JFrame{
    private JLabel la = new JLabel();
    public practice2() {
        setTitle("드래깅동안 Yellow");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        MyMouseListener listener = new MyMouseListener();
        c.addMouseListener(listener);
        c.addMouseMotionListener(listener);

        c.setBackground(Color.GREEN);
        setSize(300,200);
        setVisible(true);
    }
    class MyMouseListener implements MouseListener, MouseMotionListener {
        public void mousePressed(MouseEvent e) {
            Component c = (Component)e.getSource();
            c.setBackground(Color.GREEN);
        }
        public void mouseReleased(MouseEvent e) {
            Component c = (Component)e.getSource();
            c.setBackground(Color.GREEN);
        }
        public void mouseClicked(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {
            Component c = (Component)e.getSource();
            c.setBackground(Color.GREEN);
        }
        public void mouseExited(MouseEvent e) {
            Component c = (Component)e.getSource();
            c.setBackground(Color.GREEN);
        }
        public void mouseDragged(MouseEvent e) {
            Component c = (Component)e.getSource();
            c.setBackground(Color.YELLOW);
        }
        public void mouseMoved(MouseEvent e) {
            Component c = (Component)e.getSource();
            c.setBackground(Color.GREEN);
        }
    }
    public static void main(String [] args) {
        new practice2();
    }
}
