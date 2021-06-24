
package gui;

import javax.swing.*;
import java.awt.*;

class gui {
    public static void main(String args[]) {

        //Creating the Frame
        JFrame frame = new JFrame("GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu menu1 = new JMenu("Functions");
        JMenu menu2 = new JMenu("Numerical Method");
        
        mb.add(menu1);
        JMenuItem menu11 = new JMenuItem("x-x^2");
        JMenuItem menu22 = new JMenuItem("ln(x+1)+1");
        JMenuItem menu33 = new JMenuItem("e^x-3x");
        menu1.add(menu11);
        menu1.add(menu22);
        menu1.add(menu33);
        
        mb.add(menu2);
        JMenuItem menu111 = new JMenuItem("Newton-Raphsen");
        JMenuItem menu222 = new JMenuItem("Secant");
        JMenuItem menu333 = new JMenuItem("Bisection");
        JMenuItem menu444 = new JMenuItem("Researched method");
        menu2.add(menu111);
        menu2.add(menu222);
        menu2.add(menu333);
        menu2.add(menu444);

        frame.getContentPane().add(BorderLayout.NORTH, mb);
        
        //Creating the panel at bottom and adding components
        /*JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label); // Components Added using Flow Layout
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);
        

        // Text Area at the Center
        JTextArea ta = new JTextArea();

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        */
        frame.setVisible(true);
        
    }
}


