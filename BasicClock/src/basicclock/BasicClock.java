/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicclock;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;

/**
 *
 * @author Chris Badolato
 */
public class BasicClock extends TimerTask {
    final static long MILLISONDS_PER_SECOND = 1000;
    private JFrame window = new JFrame("Basic Clock");
    private Timer timer = new Timer();
    private String clockFace = "";
  
        //clock constructor
    public BasicClock(){
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(250,70);
        Container c = window.getContentPane();
        c.setBackground(Color.WHITE);
        window.setVisible(true);
            //update GUI every second.
        timer.schedule(this, 100, MILLISONDS_PER_SECOND*1);
    }
    public void run(){
        Date time = new Date();
        Graphics g = window.getContentPane().getGraphics();
        g.setColor(Color.WHITE);
        g.drawString(clockFace, 10, 20);
        clockFace = time.toString();
        g.setColor(Color.BLUE);
        g.drawString(clockFace, 10, 20);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        BasicClock clock = new BasicClock();
    }
    
}
