import java.awt.event.*;
import javax.swing.*;

public class Ex1501 extends JFrame {
	
	public Ex1501() {
		setTitle("Event");
		setSize(400, 200);
		
		JPanel panel = new JPanel();
		add(panel);
		
		JButton button = new JButton("Press Button");
		panel.add(button);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton) e.getSource();
				button.setText("Done!");
			}
		});
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex1501();

	}

}
