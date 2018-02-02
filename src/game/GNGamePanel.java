package game;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GNGamePanel extends JPanel  implements ActionListener{   
Timer time;
GNGamePanel(){
	time = new Timer(1000 / 60,this);
	
	
}
void StartGame(){
	time.start();	
	
}








@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("I");
}

}