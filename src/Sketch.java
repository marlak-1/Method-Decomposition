import processing.core.PApplet;

/**
 * DESCRIBE YOUR PROGRAM HERE
 * @author YOUR NAME HERE
 */
public class Sketch extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }

    /** Set up canvas size. */
    public void settings() {
        size(600, 600);  // Canvas size
    }

    /** Runs once at start - use for static drawings or setup */
    public void setup() {
        background(120, 197, 227);  // Cyan background
        fill(242, 19, 224);         // Magenta fill, no outline
        noStroke();
        circle(300, 300, 200);      // Draw a circle at the centre 
    }

    /** Loops continuously - use for animation, dynamic drawings */
    public void draw() {
		
    }

    /** Additional helper methods below (optional) */
  
}
