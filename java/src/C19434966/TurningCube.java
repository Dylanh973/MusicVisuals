package C19434966;

import processing.core.*;

public class TurningCube {
    MyVisuals tc;

    int OFF_MAX = 200;
    float width;
    float height;
    float angle = 0;
    float angle1 = 0;

    public TurningCube(MyVisuals tc)
    {
        this.tc=tc;
    }

    public void render() {
        tc.background(0);
        tc.translate(tc.width/2f, tc.height/2f);
        tc.rotateX(angle);
        tc.rotateY(angle);
        tc.rotateZ(angle);
        

        for (int xo = -OFF_MAX; xo <= OFF_MAX; xo += 30) {
          for (int yo = -OFF_MAX; yo <= OFF_MAX; yo += 30) {
            for (int zo = -OFF_MAX; zo <= OFF_MAX; zo += 30) {
              tc.pushMatrix();
              tc.translate(xo, yo, zo);
              tc.rotateX(angle);
              tc.rotateY(angle);
              tc.rotateZ(angle);
              tc.strokeWeight(2);
              tc.stroke(PApplet.map(tc.getSmoothedAmplitude(), 0, 1, 0,255), 255, 255); 
              tc.strokeWeight(5);
              tc.fill(0, 0, 100);
              tc.box((float) (15 + (Math.sin(angle1)) * 10));
              tc.popMatrix();
            }
            angle += 0.00005f;
            angle1 += 0.00005f;
          }
        }
      }
      

}
