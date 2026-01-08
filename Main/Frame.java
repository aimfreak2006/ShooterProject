package Main;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame {
    private Canvas canvas;
    private ActionListener process;
    private Timer updating;

    public Frame()
    {
        this.canvas = new Canvas();
    }

    public void setUpGUI()
    {
        this.setTitle("Shooter Project");
        this.add(canvas);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        setUpAnimationTimer();
    }

    private void setUpAnimationTimer()
    {
        process = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.updatePositions();
                canvas.repaint();
            }
        };
        updating = new Timer(20, process);
        updating.start();
    }
}
