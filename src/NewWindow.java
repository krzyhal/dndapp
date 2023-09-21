import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class NewWindow extends LaunchPage implements ActionListener {

	JButton backbutton = new JButton();
	JFrame previewframe = new JFrame();
	JLabel label = new JLabel();
	LaunchPage launch = new LaunchPage();
	String actname = LaunchPage.name;
	NewWindow(){
		
		backbutton.setText("Back");
		backbutton.setBounds(350,680,100,40);
		backbutton.addActionListener(this);
		
		label.setText("Name of character: "+actname);
		label.setBounds(50,50,250,50);
		label.setFont(new Font(null, Font.PLAIN, 20));
		
		previewframe.add(label);
		previewframe.add(backbutton);
		previewframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		previewframe.setSize(800,800);
		previewframe.setResizable(false);
		previewframe.setLayout(null);
		previewframe.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==backbutton) {
			previewframe.dispose();
		}
	}
}
