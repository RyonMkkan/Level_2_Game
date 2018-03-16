package game;

import javax.swing.JFrame;

public class GameName {
	static int width = 800;
	static int height = 360;
	JFrame frame = new JFrame();
	GNGamePanel panel = new GNGamePanel();

	

	GameName() {
		GNGamePanel p = new GNGamePanel();
		setup();

	}

	void setup() {
        frame.add(panel);
		frame.setVisible(true);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(panel);
        
	}
}
