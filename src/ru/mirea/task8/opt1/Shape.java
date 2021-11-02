package ru.mirea.task8.opt1;

import java.awt.Graphics;
import javax.swing.JComponent;

public abstract class Shape extends JComponent
{
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintShape(g);
    }
    abstract protected void paintShape(Graphics g);
}