package Try1;
import processing.core.PApplet;

    public class TryProcessing extends PApplet{
        public static void main(String[] args) {
            TryProcessing process = new TryProcessing();
            PApplet.runSketch(new String[]{"Main"}, process);

        }
        public void settings() {
            size(700, 480);
        }
        public void setup() {
            ellipse(350,250 ,100, 100);

        }
    }


