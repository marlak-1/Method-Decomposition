import processing.core.PApplet;

/**
 * Step 3: Drop in a better maple leaf.
 * Only drawMapleLeaf() changes — everything else stays the same.
 * Run this file via Terminal > Run Task > "Step 3: Better Maple Leaf"
 */
public class Step3_BetterMapleLeaf extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Step3_BetterMapleLeaf");
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
        drawMapleLeaf(width / 2, height / 2, 0.35f);
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
     * Draws an accurate maple leaf centred at (cx, cy) with a scale factor.
     * Vertices traced from a reference image of the Canadian flag.
     *
     * @param cx  centre x-position
     * @param cy  centre y-position
     * @param s   scale factor (1.0 = original traced size)
     */
    private void drawMapleLeaf(float cx, float cy, float s) {
        final float CEN_X = 300;
        final float CEN_Y = 330;

        fill(255, 0, 0);
        beginShape();
        vertex(cx + (302 - CEN_X) * s, cy + (6   - CEN_Y) * s);
        vertex(cx + (362 - CEN_X) * s, cy + (111 - CEN_Y) * s);
        vertex(cx + (420 - CEN_X) * s, cy + (87  - CEN_Y) * s);
        vertex(cx + (387 - CEN_X) * s, cy + (267 - CEN_Y) * s);
        vertex(cx + (474 - CEN_X) * s, cy + (180 - CEN_Y) * s);
        vertex(cx + (488 - CEN_X) * s, cy + (227 - CEN_Y) * s);
        vertex(cx + (580 - CEN_X) * s, cy + (207 - CEN_Y) * s);
        vertex(cx + (552 - CEN_X) * s, cy + (311 - CEN_Y) * s);
        vertex(cx + (590 - CEN_X) * s, cy + (332 - CEN_Y) * s);
        vertex(cx + (444 - CEN_X) * s, cy + (457 - CEN_Y) * s);
        vertex(cx + (461 - CEN_X) * s, cy + (511 - CEN_Y) * s);
        vertex(cx + (312 - CEN_X) * s, cy + (496 - CEN_Y) * s);
        vertex(cx + (312 - CEN_X) * s, cy + (656 - CEN_Y) * s);
        vertex(cx + (290 - CEN_X) * s, cy + (657 - CEN_Y) * s);
        vertex(cx + (294 - CEN_X) * s, cy + (495 - CEN_Y) * s);
        vertex(cx + (148 - CEN_X) * s, cy + (513 - CEN_Y) * s);
        vertex(cx + (162 - CEN_X) * s, cy + (462 - CEN_Y) * s);
        vertex(cx + (15  - CEN_X) * s, cy + (331 - CEN_Y) * s);
        vertex(cx + (54  - CEN_X) * s, cy + (315 - CEN_Y) * s);
        vertex(cx + (27  - CEN_X) * s, cy + (206 - CEN_Y) * s);
        vertex(cx + (116 - CEN_X) * s, cy + (226 - CEN_Y) * s);
        vertex(cx + (132 - CEN_X) * s, cy + (177 - CEN_Y) * s);
        vertex(cx + (216 - CEN_X) * s, cy + (265 - CEN_Y) * s);
        vertex(cx + (191 - CEN_X) * s, cy + (87  - CEN_Y) * s);
        vertex(cx + (246 - CEN_X) * s, cy + (114 - CEN_Y) * s);
        endShape(CLOSE);
    }
}
