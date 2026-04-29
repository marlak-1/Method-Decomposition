import processing.core.PApplet;

/**
 * Random Flag Program — starting point for the Method Decomposition lesson.
 * Run this file with Cmd+Shift+B (Mac) or Ctrl+Shift+B (Windows).
 */
public class Sketch extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }

    @Override
    public void settings() {
        size(600, 400);
    }

    @Override
    public void setup() {
        background(255);

        int choice = (int) random(3);

        if (choice == 0) {
            // Polish flag (white over red)
            fill(255);
            rect(0, 0, width, height / 2);
            fill(200, 0, 0);
            rect(0, height / 2, width, height / 2);

        } else if (choice == 1) {
            // Ukraine flag (blue over yellow)
            fill(0, 87, 183);
            rect(0, 0, width, height / 2);
            fill(255, 215, 0);
            rect(0, height / 2, width, height / 2);

        } else {
            // Canada flag
            fill(255, 0, 0);
            rect(0, 0, width / 4, height);
            rect(3 * width / 4, 0, width / 4, height);

            fill(255);
            rect(width / 4, 0, width / 2, height);

            // Simplified star shape in place of maple leaf
            fill(255, 0, 0);
            beginShape();
            vertex(width / 2, 80);
            vertex(width / 2 - 20, 160);
            vertex(width / 2 - 60, 160);
            vertex(width / 2 - 30, 220);
            vertex(width / 2 - 50, 320);
            vertex(width / 2,      260);
            vertex(width / 2 + 50, 320);
            vertex(width / 2 + 30, 220);
            vertex(width / 2 + 60, 160);
            vertex(width / 2 + 20, 160);
            endShape(CLOSE);
        }
    }
}
