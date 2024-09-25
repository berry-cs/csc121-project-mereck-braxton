import java.util.Objects;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * This is the class that represents a player 
 * the player has a position and a speed.
 */
public class Player {
    Posn loc;
    

	public String direction;
    public int playerSpeed = 2;
    public boolean collisionOn = false;
    PImage playerImage; // Store the player image

    // Constructor
    public Player(Posn loc) {
        this.loc = loc;
    }

    // Load the image in setup
    public void loadImage(PApplet app) {
        playerImage = app.loadImage("res/player/boy_down_1.png");  // Ensure the path is correct
    }

    // Update player movement based on key press
    //in processing int codes for key up=38 down=40 left = 37 right=39
    public void update(int code) {
        if (code == PApplet.UP || code == PApplet.DOWN || code == PApplet.LEFT || code == PApplet.RIGHT) {

            if (code == PApplet.UP) {
                direction = "up";
            } else if (code == PApplet.DOWN) {
                direction = "down";
            } else if (code == PApplet.LEFT) {
                direction = "left";
            } else if (code == PApplet.RIGHT) {
                direction = "right";
            }

            // Check for collision
            if (!collisionOn) {
                // Adjust movement based on direction
                switch (direction) {
                    case "up":
                        loc = loc.translate(new Posn(0, -playerSpeed)); // Move up
                        break;
                    case "down":
                        loc = loc.translate(new Posn(0, playerSpeed));  // Move down
                        break;
                    case "left":
                        loc = loc.translate(new Posn(-playerSpeed, 0)); // Move left
                        break;
                    case "right":
                        loc = loc.translate(new Posn(playerSpeed, 0));  // Move right
                        break;
                }
            }
        }
    }

    // Draw the player
    public void draw(PApplet c) {
        c.image(playerImage, (int) this.loc.getX(), (int) this.loc.getY());
    }
    
    
    
    
    
    @Override
	public int hashCode() {
		return Objects.hash(collisionOn, direction, loc, playerImage, playerSpeed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return collisionOn == other.collisionOn && Objects.equals(direction, other.direction)
				&& Objects.equals(loc, other.loc) && Objects.equals(playerImage, other.playerImage)
				&& playerSpeed == other.playerSpeed;
	}
}
