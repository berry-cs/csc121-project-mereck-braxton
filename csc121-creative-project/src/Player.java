import java.awt.Rectangle;

public class Player extends Entity {
	PokeWorld pw;
	Posn loc;
	public final int screenX;
	public final int screenY;
	public int hasKey =0; //can change this so something else but for now leaving it as key bc of interactions w/ door.
	int standCounter =1;
	
	public Player(PokeWorld pw, Posn loc) {
		this.pw = pw;
		this.loc = loc;

		screenX =pw.screenWidth/2 -(pw.tileSize/2); //returns halfway point of the screen
		screenY =pw.screenHeight/2 - (pw.tileSize/2); 
		//colision area for the player character 
		solidArea = new Rectangle(); // x,y,width,height
		solidArea.x = 8; //this is where it starts 
		solidArea.y = 16;
		solidAreaDefaultX = solidArea.x; //we want to record the default values 
		solidAreaDefaultY = solidArea.y;
		solidArea.width = 32; //this will be smaller than the character
		solidArea.height = 32;


		setDefaultValues();
		getPlayerImage();

	}
	
	

}
