package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GNGamePanel extends JPanel implements ActionListener, KeyListener {
	Timer time;
	GameObject object;
   
	GNGamePanel() {
		time = new Timer(1000 / 60, this);
		object = new GameObject();
        startGame();
	}

	void startGame() {
		time.start();

	}

	@Override

	public void paintComponent(Graphics g) {
		g.setColor(new Color(255,255,255));
       g.fillRect(0, 0, 1000, 1000);
       
		object.draw(g);
	

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		object.update();
		repaint();
		
		
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getKeyCode() == KeyEvent.VK_UP) {
			object.jump();
			
			

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