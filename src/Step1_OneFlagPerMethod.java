import processing.core.PApplet;

/**
 * Step 1: One method per flag.
 * Each flag is moved into its own clearly named method.
 * Run this file via Terminal > Run Task > "Step 1: One Method Per Flag"
 */
public class Step1_OneFlagPerMethod extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Step1_OneFlagPerMethod");
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
            drawPolandFlag();
        } else if (choice == 1) {
            drawUkraineFlag();
        } else {
            drawCanadaFlag();
        }
    }

    /**
     * Draws the Polish flag (white over red).
     */
    private void drawPolandFlag() {
        fill(255);
        rect(0, 0, width, height / 2);
        fill(200, 0, 0);
        rect(0, height / 2, width, height / 2);
    }

    /**
     * Draws the Ukrainian flag (blue over yellow).
     */
    private void drawUkraineFlag() {
        fill(0, 87, 183);
        rect(0, 0, width, height / 2);
        fill(255, 215, 0);
        rect(0, height / 2, width, height / 2);
    }

    /**
     * Draws the Canadian flag with red side bars and a simplified maple leaf.
     */
    private void drawCanadaFlag() {
        // Red side bars
        fill(255, 0, 0);
        rect(0, 0, width / 4, height);
        rect(3 * width / 4, 0, width / 4, height);

        // White centre
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
