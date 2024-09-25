import java.util.Objects;

import entity.Player;
import processing.core.*;
import processing.event.KeyEvent;
import processing.event.MouseEvent;

public class PokeWorld implements IWorld{
	Player player;
	boolean isPaused =false;
	///draw method for world and in classes movement in world 
	
	
	/**
	 * This is to set up the tiles and pixels on the screen 
	 */
	//Screen settings
	final int originalTileSize = 16; //means 16x16 tile default size for player character can update later
	final int scale = 3;  // this will make the character look 48x48 since pc is bigger screen
	public final int tileSize = originalTileSize * scale; //48x48 tile actuall displayed on screen 
	
	public final int maxScreenCol = 16; // 16 tiles on the screen vertically 
	public final int maxScreenRow = 12; // 16 tiles on the screen horizontally ratio 4x3
	public final int screenWidth = tileSize * maxScreenCol; //768 pixels 
	public final int screenHeight = tileSize * maxScreenRow; // 576 pixels
	
	//world map parameters: these can be changed if we want
	public final int maxWorldCol = 50;
	public final int maxWorldRow = 50;
	//public final int worldWidth = tileSize * maxWorldCol;
	//public final int worldHeight = tileSize * maxWorldRow;
	
	
	public PokeWorld(Player player, boolean isPaused) {
		this.player = player;
		this.isPaused = isPaused;
	}
	
	public PApplet draw(PApplet c) {
        c.background(135, 206, 250);  // clear the screen each time (color sky blue)
        
        this.player.draw(c, ));
        return c;
    }
	
	
	 public PokeWorld keyPressed(KeyEvent kev) {
	        if (kev.getKeyCode() == PApplet.UP) {
	            return new PokeWorld(this.a1.translate(new Posn(0, -10)), this.a2, this.bob, this.isPaused);
	        } else if (kev.getKeyCode() == PApplet.DOWN) {
	            return new PokeWorld(this.a1.translate(new Posn(0, 10)), this.a2, this.bob, this.isPaused);
	        } else if (kev.getKeyCode() == PApplet.LEFT) {
	            return new PokeWorld(this.a1.translate(new Posn(-10, 0)), this.a2, this.bob, this.isPaused);
	        } else if (kev.getKeyCode() == PApplet.RIGHT) {
	            return new PokeWorld(this.a1.translate(new Posn(10, 0)), this.a2, this.bob, this.isPaused);
	        } else if (kev.getKeyCode() == PApplet.TAB) {
	            return new PokeWorld(this.a2, this.a1, this.bob, this.isPaused);
	        } else if (kev.getKey() == ' ') {  // space
	            return new PokeWorld(this.a1, this.a2, this.bob, ! this.isPaused);
	        } else {
	            return this;
	        }
	    }
	
	

}
