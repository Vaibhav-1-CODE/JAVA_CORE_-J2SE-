import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mouse extends JFrame 
        implements MouseListener, MouseMotionListener, KeyListener {

    String msg = "Perform any mouse or keyboard action";

    public Mouse() {
        setTitle("Event Handling Demo");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addMouseListener(this);
        addMouseMotionListener(this);
        addKeyListener(this);

        setFocusable(true);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font("Arial", Font.BOLD, 16));
        // Drawing message in center
        int x = getWidth()/2 - msg.length()*4;
        int y = getHeight()/2;
        g.drawString(msg, x, y);
    }

    // MouseListener
    public void mouseClicked(MouseEvent e) {
        msg = "Mouse Clicked. Button: " + e.getButton();
        repaint();
    }

    public void mousePressed(MouseEvent e) {
        msg = "Mouse Pressed. Button: " + e.getButton();
        repaint();
    }

    public void mouseReleased(MouseEvent e) {
        msg = "Mouse Released";
        repaint();
    }

    public void mouseEntered(MouseEvent e) {
        msg = "Mouse Entered Window";
        repaint();
    }

    public void mouseExited(MouseEvent e) {
        msg = "Mouse Exited Window";
        repaint();
    }

    // MouseMotionListener
    public void mouseDragged(MouseEvent e) {
        msg = "Mouse Dragged at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    public void mouseMoved(MouseEvent e) {
        msg = "Mouse Moved at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    // KeyListener
    public void keyPressed(KeyEvent e) {
        msg = "Key Pressed: " + e.getKeyChar();
        repaint();
    }

    public void keyReleased(KeyEvent e) { }
    public void keyTyped(KeyEvent e) { }

    public static void main(String[] args) {
        new Mouse();
    }
}
