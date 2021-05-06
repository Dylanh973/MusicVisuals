package C19434966;

import processing.core.PConstants;

public class Menu {
        MyVisuals mm;

    public Menu(MyVisuals mm) {
        this.mm = mm;
    }

    public void render() {
        mm.textSize(50);
        mm.fill(0, 255, 255);
        mm.text("This is my music visualizer", 500, 100);
        mm.fill(233, 255, 120);
        mm.text("Programmed by Dylan Heathcote, C19434966", 500, 200);
        mm.fill(175, 255, 255);
        mm.text("Press P To start the music", 500, 300);
        mm.fill(135, 255, 255);
        mm.text("Press L to pause the music", 500, 400);
        mm.fill(70, 255, 255);
        mm.text("Press K to restart the song", 500, 500);
        mm.fill(40, 255, 255);
        mm.text("Press 1-3 to check out my visuals!", 500, 600);
        mm.fill(160, 255, 255);
        mm.text("Hope you enjoy!", 500, 700);


    }
}
