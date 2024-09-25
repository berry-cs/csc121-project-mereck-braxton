import processing.core.PImage;

public class Entity {
    public int worldX, worldY; // Position in the world
    public int speed;  // Movement speed

    // Directional sprites for the entity
    public PImage up1, up2, down1, down2, left1, left2, right1, right2;
    
    // Direction the entity is facing (up, down, left, right)
    public String direction;
    
    // Animation control
    public int spriteCounter = 0;
    public int spriteNum = 1;
    
    // Collision detection area (solid area)
    public int solidAreaX, solidAreaY, solidAreaWidth, solidAreaHeight;
    public int solidAreaDefaultX, solidAreaDefaultY;
    
    // Flag for detecting collisions
    public boolean collisionOn = false;
    
    // Constructor
    public Entity() {
        // Initialize entity values if necessary
    }
}
