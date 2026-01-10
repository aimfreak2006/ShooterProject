import java.awt.event.*;

public class Controller implements MouseListener, KeyListener, MouseMotionListener {
    private Tank player;

    public Controller(Tank player) 
    {
        this.player = player;
    }

    @Override
    public void mouseMoved(MouseEvent e) 
    {
        // tank barrel follows mouse movements
    }
    
    @Override
    public void mouseDragged(MouseEvent e) 
    {
        // treated the same as mouseMoved
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {
        // moves tank and other possible actions
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
        // moves tank and other possible actions
    }

    @Override
    public void mousePressed(MouseEvent e) 
    {
        // makes tank shoot towards mouse location
    }

    @Override
    public void mouseReleased(MouseEvent e) 
    {
        // stops tank from shooting
    }

    @Override
    public void keyTyped(KeyEvent e) 
    {
        //
    }
    
    @Override
    public void mouseClicked(MouseEvent e) 
    {
        //
    }

    @Override
    public void mouseEntered(MouseEvent e) 
    {
        //
    }

    @Override
    public void mouseExited(MouseEvent e) 
    {
        //
    }
}
