package game;

import javax.swing.JFrame;

public class GameName {
	int width = 800;
	int height = 38;
	JFrame frame = new JFrame();
	GNGamePanel panel = new GNGamePanel();

	

	GameName() {
		GNGamePanel p = new GNGamePanel();
		setup();

	}

	void setup() {

		frame.setVisible(true);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
