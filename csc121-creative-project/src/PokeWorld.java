import processing.core.PApplet;

public class PokeWorld implements IWorld {
    Player player;
    boolean isPaused = false;

    public PokeWorld(Player player, boolean isPaused) {
        this.player = player;
        this.isPaused = isPaused;
    }

    // Update the world (especially the player)
    public PokeWorld update(boolean keyPressed, int keyCode) {
        if (!isPaused && keyPressed) {
            // Update player position based on the key input
            player.update(keyCode);
        }
        return this;
    }

    // Draw the world
    public void draw(PApplet c, boolean keyPressed, int keyCode) {
        // First, update the world state
        update(keyPressed, keyCode);

        // Clear the screen and set the background color
        c.background(135, 206, 250); // Sky blue

        // Draw the player after updating its position
        player.draw(c);
    }
}
