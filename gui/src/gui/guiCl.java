
package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class guiCl extends JFrame {
	public static void main(String args[]) {

        //Creating the Frame
        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 550);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Text");
        JLabel label2 = new JLabel("    ");
        label2.setBounds(0,0,100,50);
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        JTextField resultField= new JTextField(10);
        resultField.setEditable(false);
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        JButton remove = new JButton("Remove");
        panel.add(label); // Components Added using Flow Layout
        panel.add(label);
        panel.add(label2); // Components Added using Flow Layout
        panel.add(label2);// Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);
        panel.add(remove);
        
        
        
        
        // Text Area at the Center
        JTextArea ta = new JTextArea();
  
        
   
        
        class Listener1 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				String textStr=tf.getText();
				System.out.println(textStr);
				ta.append(textStr + "\n");
			}
        	
        }
        
        class ListenerM1 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				        try(  PrintWriter out = new PrintWriter( "Digitado.txt" )){
				            out.println(ta.getText());

				        } catch (FileNotFoundException e2) {
				            // TODO Auto-generated catch block
				            e2.printStackTrace();
				        }
				        System.out.println("Save successful");
				
			
        	
        }
        }
      
        
        
        send.addActionListener(new Listener1());

       
         m22.addActionListener(new ListenerM1());
        
        
        if (send.getModel().isPressed()) System.out.println("Hello!");

     
        
        int a = 1;
        
        class Listener2 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 tf.setText(" ");
				 ta.setText(" ");
			     
			}
        	
        }
        
        class Listener3 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 tf.setText(" ");
				 ta.setText(" ");
				
			}
        	
        }
        
        reset.addActionListener(new Listener2());
   
        remove.addActionListener(new Listener3());
        
     

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        
        frame.setVisible(true);
    }
}