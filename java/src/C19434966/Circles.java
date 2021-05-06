package C19434966;

import processing.core.*;

public class Circles {
    MyVisuals cc;

    float width;
    float height;
    float t = 500;
    float angle = 0;

    public Circles(MyVisuals cc)
    {
        this.cc=cc;
    }
    public void render()
  { 


    cc.strokeWeight(1);
    cc.pushMatrix();
    cc.translate(cc.width/2f, cc.height/2f);
    cc.stroke(PApplet.map(cc.getSmoothedAmplitude(), 0, 1, 0,255), 255, 255); 

    cc.rotateX(angle);
    cc.rotateY(angle);
    cc.beginShape();
    cc.vertex(-t, -t, -t);
    cc.vertex( t, -t, -t);
    cc.vertex( 0, 0, t);
  

    cc.vertex( t, -t, -t);
    cc.vertex( t, t, -t);
    cc.vertex( 0, 0, t);
  

    cc.vertex( t, t, -t);
    cc.vertex(-t, t, -t);
    cc.vertex( 0, 0, t);
  

    cc.vertex(-t, t, -t);
    cc.vertex(-t, -t, -t);
    cc.vertex( 0, 0, t);
    cc.endShape();
    angle += 0.01f;
    cc.popMatrix();
  }
}
