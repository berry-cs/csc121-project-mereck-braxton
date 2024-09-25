import processing.core.PApplet;

/**
 * This is the class that represents a player 
 * the player has a posn and a speed 
 */
public class Player  {
	Posn loc;
	public int playerSpeed =2;
	public Player(Posn loc) {
		super();
		this.loc = loc;
		//this.playerSpeed = playerSpeed;
	}
	
	
	/**
	 * This is the draw method for a player 
	 */
	public PApplet draw(PApplet c) {
       
        
        
        c.image(c.loadImage("/res/player/boy_down_1.png"), (int)this.loc.getX(), (int)this.loc.getY());
        return c;
    }
	
	


}
