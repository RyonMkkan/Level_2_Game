package game;

import java.awt.Graphics; 

public class GameObject {
	int x = 10;

    int y = 200;

    int width = 100;

    int height = 100;
	
	
	
	GameObject(){
		
		
		
		
		
		
	}
	
	public void jump (int height ) {
		y += height;
		System.out.println(y);
		
		
	}
	
	void update() {
		
		
		
	}
    void draw(Graphics g) {
    	System.out.println(x+" , "+y);
		 g.fillRect(x, y, width, height);
	}
	
	
	
}
