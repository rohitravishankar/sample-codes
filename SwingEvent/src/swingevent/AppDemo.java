/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingevent;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Sameera
 */
// To Run the applet Right click on the content and click Run file option
// Or press Shift and f6
public class AppDemo extends Applet implements MouseListener {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     *
     */
    private int x;
    private int y;
    private String msg;

    @Override
    public void init() {
        addMouseListener(this);
        // TODO start asynchronous download of heavy resources
    }

    @Override
    public void paint(Graphics g) {
        try {
            g.drawString(msg, x, y);
        } catch (NullPointerException ex) {
            ex.getMessage();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        msg = "You clicked here!";
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        msg = "You pressed here!";
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        msg = "Why did you release the mouse? :P";
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        showStatus("Mouse Entered!");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        showStatus("Cursor left window!");
    }
}

    // TODO overwrite start(), stop() and destroy() methods

