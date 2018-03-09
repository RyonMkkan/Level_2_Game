package game;

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
       
		object.draw(g);
		System.out.println("lll");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		object.update();
		repaint();
		System.out.println("lol");
		
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getKeyCode() == KeyEvent.VK_UP) {
			System.out.println("up");
			object.jump(-50);
			

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