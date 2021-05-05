package C19434966;

import processing.core.*;

public class TurningCube {
    MyVisuals tc;

    int OFF_MAX = 200;
    float width;
    float height;
    float angle = 0;
    float angle1 = 0;
    int colorFromOffset(int offset) {
        return (int) ((offset + OFF_MAX) / (2.0 * OFF_MAX) * 255);
      }

    public TurningCube(MyVisuals tc)
    {
        this.tc=tc;
    }

    public void render() {
        tc.background(0);
        tc.translate(500, 250, -500);
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
              tc.strokeWeight(1);
              tc.fill(PApplet.map(tc.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
              tc.box((float) (15 + (Math.sin(angle1)) * 10));
              tc.popMatrix();
            }
            angle += 0.00005f;
            angle1 += 0.0001f;
          }
        }
      }
      

}
