import processing.core.PApplet;

/**
 * Step 2: Reusable methods and clean structure.
 * A general-purpose method handles both horizontal flags.
 * The Canadian flag is broken into stripes + leaf helpers.
 * Run this file via Terminal > Run Task > "Step 2: Reusable Methods"
 */
public class Step2_ReusableMethods extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Step2_ReusableMethods");
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
            drawBicolorHorizontalFlag(255, 255, 255, 200, 0, 0);   // Poland: white over red
        } else if (choice == 1) {
            drawBicolorHorizontalFlag(0, 87, 183, 255, 215, 0);    // Ukraine: blue over yellow
        } else {
            drawCanadaFlag();
        }
    }

    /**
     * Draws a horizontal two-colour flag that fills the entire window.
     *
     * @param topR    red component of the top colour (0–255)
     * @param topG    green component of the top colour (0–255)
     * @param topB    blue component of the top colour (0–255)
     * @param bottomR red component of the bottom colour (0–255)
     * @param bottomG green component of the bottom colour (0–255)
     * @param bottomB blue component of the bottom colour (0–255)
     */
    private void drawBicolorHorizontalFlag(int topR, int topG, int topB,
                                           int bottomR, int bottomG, int bottomB) {
        fill(topR, topG, topB);
        rect(0, 0, width, height / 2);

        fill(bottomR, bottomG, bottomB);
        rect(0, height / 2, width, height / 2);
    }

    /**
     * Draws the Canadian flag by delegating to helper methods.
     */
    private void drawCanadaFlag() {
        drawCanadaStripes();
        drawMapleLeaf();
    }

    /**
     * Draws the red/white/red background stripes of the Canadian flag.
     */
    private void drawCanadaStripes() {
        fill(255, 0, 0);
        rect(0, 0, width / 4, height);
        rect(3 * width / 4, 0, width / 4, height);

        fill(255);
        rect(width / 4, 0, width / 2, height);
    }

    /**
     * Draws a simplified star shape in place of the maple leaf.
     */
    private void drawMapleLeaf() {
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
