

import processing.core.*;

import processing.event.*;

/**
 * Provides the scaffolding to launch a Processing application
 */
public class PokeApp extends PApplet {	// <----- 1. rename AppTemplate everywhere in this file
    IWorld w;
    
    public void settings() {
        this.size(768, 576);  // Screen size setup
    }

    public void setup() {
        Player player = new Player(new Posn(383.0, 383.0));  // Create the player
        player.loadImage(this);  // Load the player's image in setup
        w = new PokeWorld(player, false);  // Create your world
    }

    public void draw() {
        w.draw(this, keyPressed, keyCode);  // Pass keyPressed and keyCode to the world
    }
    
    @Override
    public void mousePressed(MouseEvent mev) {
        w = w.mousePressed(mev);
    }
    
    @Override
   public void mouseReleased(MouseEvent mev) {
    	w = w.mouseReleased(mev);
    }

    @Override
   public void mouseMoved(MouseEvent mev) {
    	w = w.mouseMoved(mev);
    }
    
    @Override
    public void mouseDragged(MouseEvent mev) {
    	w = w.mouseDragged(mev);
    }
    
    @Override
    public void mouseClicked(MouseEvent mev) {
    	w = w.mouseClicked(mev);
    }

    @Override
    public void mouseEntered(MouseEvent mev) {
    	w = w.mouseEntered(mev);
    }

    @Override
    public void mouseExited(MouseEvent mev) {
    	w = w.mouseExited(mev);
    }
    
    @Override
    public void mouseWheel(MouseEvent mev) {
    	w = w.mouseWheel(mev);
    }

    @Override
    public void keyPressed(KeyEvent kev) {
        w = w.keyPressed(kev);
    }

    @Override
    public void keyReleased(KeyEvent kev) {
        w = w.keyReleased(kev);
    }
    
    @Override
    public void keyTyped(KeyEvent kev) {
        w = w.keyTyped(kev);
    }

    public static void main(String[] args) {
        PApplet.runSketch(new String[] { PokeApp.class.getName() }, new PokeApp());
    }
}
