package Try2;
import processing.core.PApplet;

public class TryProcessing2 extends PApplet {
    public static void main(String[] args) {

        TryProcessing2 process = new TryProcessing2();
        PApplet.runSketch(new String[]{"Try2"}, process);

    }
    public void settings() {
        size(700, 480);

    }

    public void setup() {
        for (int y = 474; y > 0; y = y-150) {
            ellipse(4, y, 10, 10);
        }

    }

}



