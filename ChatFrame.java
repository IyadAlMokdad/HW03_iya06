package hw05_iya06;

import java.awt.*;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

	public class ChatFrame extends JFrame implements ActionListener{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		JMenuItem m12;
		JMenuItem m11;
		JButton b1;
		JButton b2;
		JMenu m2;
		
		
		public ChatFrame(String s) throws HeadlessException {
			super(s);
			
			JMenuBar mb = new JMenuBar();
			JMenu m1 = new JMenu("FILE");
			JMenu m2 = new JMenu("Help");
			mb.add(m1);
			mb.add(m2);
			 m11 = new JMenuItem("Open");
			m12 = new JMenuItem("Save As");
			m1.add(m11);
			m1.add(m12);
			this.setJMenuBar(mb);
			
			JLabel Entr = new JLabel("Enter Text...");
			b1 = new JButton("Send");
			b2 = new JButton("Reset");
			JTextField t = new JTextField(12);
			
			JPanel panel = new JPanel();
			panel.add(Entr);
			panel.add(t);
			panel.add(b1);
			panel.add(b2);
			this.add(panel,BorderLayout.SOUTH);
			
			m12.addActionListener(this);
			m11.addActionListener(this);
			b1.addActionListener(this);
			b2.addActionListener(this);
			m2.addActionListener(this);
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setSize(400,400);
			this.setVisible(true);
		}
		@Override
		public void actionPerformed(ActionEvent e){
		if (e.getSource() instanceof JButton) {
			JButton b = (JButton) e.getSource();
			if (b==b1) {
				JOptionPane.showConfirmDialog(this, "You clicked Send","Button Click Event Handler", JOptionPane.PLAIN_MESSAGE);	
			}
			else if (b==b2) {
				JOptionPane.showConfirmDialog(this, "You clicked Reset","Button Click Event Handler", JOptionPane.PLAIN_MESSAGE);
			}
			}
		else if (e.getSource() instanceof JMenuItem) {
			JMenuItem m = (JMenuItem) e.getSource();
			if (m==m11) {
				JOptionPane.showConfirmDialog(this, "You clicked Open","Button Click Event Handler", JOptionPane.PLAIN_MESSAGE);
			}
			else if (m==m12) {
				JOptionPane.showConfirmDialog(this, "You clicked Save as","Button Click Event Handler", JOptionPane.PLAIN_MESSAGE);
			}
			
			
		}
		}

}

