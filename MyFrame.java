package hw05_iya06;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
	/**
	 * 
	 */
	MyFrame me = new MyFrame("My new GUI");
	
	JButton button2 = new JButton("Button 2");
	JButton button1 = new JButton("Press");
	private static final long serialVersionUID = 1L;
	public MyFrame(String s){
		super(s);
		Cursor cursor = new Cursor(Cursor.WAIT_CURSOR);
		this.setCursor(cursor);

		this.getContentPane().setLayout(new FlowLayout()); 
		this.getContentPane().add(BorderLayout.WEST,button1); 
		this.getContentPane().add(BorderLayout.EAST,button2);
		
		button1.setText("Press me");
		button1.setToolTipText("Press me and watch what happens");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		this.setVisible(true);
		
		button1.addActionListener(this);
		button2.addActionListener(this);

		
	};
	@Override
	public void actionPerformed(ActionEvent e) {
	JButton b = (JButton) e.getSource();
			
		if (b==button1)
		{
			JOptionPane.showConfirmDialog(this, "You clicked Button1","Button Click Event Handler", JOptionPane.PLAIN_MESSAGE);	
			}else if (b==button2)
			{
				JOptionPane.showConfirmDialog(this, "You clicked Button2","Button Click Event Handler", JOptionPane.PLAIN_MESSAGE);
			}



}
}