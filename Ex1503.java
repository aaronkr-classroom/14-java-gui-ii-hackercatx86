import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex1503 extends JFrame implements ActionListener {
	
	JButton btn1, btn2, btn3, btn4, btn5;
	Color color;
	
	Ex1503() {
		setTitle("Communication Box Icon");
		setSize(450, 250);
		setLayout(new FlowLayout());
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		add(panel);
		
		btn1 = new JButton("Error");
		btn2 = new JButton("Information");
		btn3 = new JButton("Warning");
		btn4 = new JButton("Question");
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		
		color = btn1.getBackground();
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		initButton();
		
		if (obj == btn1) {
			btn1.setBackground(Color.CYAN);
			JOptionPane.showMessageDialog(this, "JOptionPane Communication Box", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		else if (obj == btn2) {
			btn2.setBackground(Color.CYAN);
			JOptionPane.showMessageDialog(this, "JOptionPane Communication Box", "Information", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if (obj == btn3) {
			btn3.setBackground(Color.CYAN);
			JOptionPane.showMessageDialog(this, "JOptionPane Communication Box", "Warning", JOptionPane.WARNING_MESSAGE);
		}
		
		else if (obj == btn4) {
			btn4.setBackground(Color.CYAN);
			JOptionPane.showMessageDialog(this, "JOptionPane Communication Box", "Question", JOptionPane.QUESTION_MESSAGE);
		}
	}
	
	public void initButton() {
		btn1.setBackground(color);
		btn2.setBackground(color);
		btn3.setBackground(color);
		btn4.setBackground(color);
	}
	
	public static void main(String[] args) {
		new Ex1503();
	}

}