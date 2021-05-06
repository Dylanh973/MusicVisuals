package C19434966;

import processing.core.*;

public class TurningCube {
    MyVisuals tc;

    int OFF_MAX = 200; //Declaring variables
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
        tc.translate(tc.width/2f, tc.height/2f); //Putting it in the middle of the screen
        tc.rotateX(angle); //Rotating each box
        tc.rotateY(angle); 
        tc.rotateZ(angle);
        
        for (int xo = -OFF_MAX; xo <= OFF_MAX; xo += 30) {  //Make OFF max -300 till it reaches +300, and determing the spacing between each box
          for (int yo = -OFF_MAX; yo <= OFF_MAX; yo += 30) {
            for (int zo = -OFF_MAX; zo <= OFF_MAX; zo += 30) {
              tc.pushMatrix();
              tc.translate(xo, yo, zo); //Positions of each box when printed
              tc.rotateX(angle);
              tc.rotateY(angle);
              tc.rotateZ(angle);
              tc.stroke(PApplet.map(tc.getSmoothedAmplitude()*13, 0, 1, 0,255), 255, 255);  //Outline of each boxs color in relation to the amplitude
              tc.strokeWeight(4); //The thickness of the lines
              tc.fill(0, 0, 255); //Filling the inside of the boxes white
              tc.box((float) (15 + (Math.sin(angle1)) * 10)); //Printing each box
              tc.popMatrix();
            }
            angle += 0.00005f; //Declaring the angle to determine what speed it rotates
            angle1 += 0.00005f;

          }
        }
      }
      

}
