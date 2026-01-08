package Main;
import java.awt.geom.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;

import Classifications.Drawable;
import Classifications.Updatable;

public class Canvas extends JComponent {
    private ArrayList<Drawable> drawables;
    private ArrayList<Updatable> updatables;

    public Canvas() 
    {
        setPreferredSize(new Dimension(1080, 720));
        drawables = new ArrayList<>();
        updatables = new ArrayList<>();
    }

    
    @Override
    protected void paintComponent(Graphics g) 
    {
        Graphics2D g2d = (Graphics2D) g;
        AffineTransform revert = g2d.getTransform();

        drawGraphics(g2d);

        g2d.setTransform(revert);
    }

    private void drawGraphics(Graphics2D g2d) 
    {
        for (Drawable d : drawables) {
            d.drawObject(g2d);
        }
    }

    public void updatePositions()
    {
        for (Updatable u : updatables) {
            u.updateObject();
        }
    }
}