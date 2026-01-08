package Main;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame{
    private int height;
    private int width;
    private Canvas canvas;

    public Frame(int height, int width)
    {
        this.height = height;
        this.width = width;
        this.canvas = new Canvas();
    }

    public void setUpGUI()
    {

    }
}
