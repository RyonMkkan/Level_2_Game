package game;

import java.awt.Color;
import java.awt.Graphics; 

public class GameObject {
	int x = 10;

    int y = 200;

    int width = 100;

    int height = 100;
	 
    int velocity = 1;
	
	
	GameObject(){
		
		
		
		
		
		
	}
	
	public void jump ( ) {
		
		y -= velocity*60;
		
		
		
		
	}
	 
	
	void update() {
		
		if (y< GameName.height - height) {
			y+= velocity;
			
		}
		
		

		}
	
    void draw(Graphics g) {
    	
    	g.setColor(new Color (0,0,0));
		 g.fillRect(x, y, width, height);
	}
	
	
	
}
