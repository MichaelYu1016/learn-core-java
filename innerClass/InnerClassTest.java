package innerClass;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * This program demonstrates the use of inner classes.
 */
public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock1 clock = new TalkingClock1(1000, true);
        clock.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

/**
 * A clock that prints the time in regular intervals
 */
class TalkingClock1 {
    private int interval;
    private boolean beep;
    
    /**
     * Construct a talking clock
     * @param interval the interval between messages(in milliseconds)
     * @param beep true if the clock should beep
     */
    public TalkingClock1(int interval, boolean beep){
        this.interval = interval;
        this.beep = beep;
    }

    public void start(){
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(interval, listener);
        t.start();
    }

    public class TimePrinter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event){
            System.out.println("At the tone, the time is "+new Date());
            if (beep) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}