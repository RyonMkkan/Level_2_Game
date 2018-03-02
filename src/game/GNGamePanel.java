package game;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GNGamePanel extends JPanel  implements ActionListener, KeyListener{   
Timer time;
GameObject object;
GNGamePanel(){
	time = new Timer(1000 / 60,this);
	object = new GameObject();
	
}
void StartGame(){
	time.start();	
	
}





@Override

public void paintComponent(Graphics g){
	 g.fillRect(35, 200, 100, 100);
	 object.draw(g);
                

        }


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	 repaint();
	 object.update();
}
@Override
public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
	if (arg0.getKeyCode()== KeyEvent.VK_UP) {
		System.out.println("up");
		
	}
	}

@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}

}