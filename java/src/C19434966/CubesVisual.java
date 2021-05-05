package C19434966;

import processing.core.*;

public class CubesVisual {

    MyVisuals mv; 
    float angle = 0; //Declaring angle as a variable and setting it to 0.
    float width; //Declaring width as a variable.
    float height; //Declaring height as a variable.
   
    public CubesVisual(MyVisuals mv) //Constructor 
    {
        this.mv=mv;
    }

    public void render() 
        {
                //Top right cube/sphere
            mv.pushMatrix(); 
            mv.lights(); //Getting lights
            mv.noFill(); //Don't fill
            mv.translate(1600, 200, 0); //Position of the cube/sphere
            mv.rotateY(angle); //Rotating its axis
            mv.rotateX(angle);
            mv.strokeWeight(1); //How thick the lines are
            mv.stroke(PApplet.map(mv.getSmoothedAmplitude()*2, 0, 1, 0, 255), 255, 255); //Changes the lines and borders in relation to the Amplitude
            angle += 0.02f; //How fast it changes the angle to spin
            mv.box(200); //Box size
            mv.sphere(100/2 * mv.getSmoothedAmplitude() * 10); //Declaring the sphere to half the size of the box to make sure it will fit inside
            mv.popMatrix(); 

                //Comments above relate to this code also
                //Bottom left cube/sphere 
            mv.pushMatrix();
            mv.lights();
            mv.noFill(); 
            mv.translate(300, 800, 0);
            mv.rotateX(angle);
            mv.rotateY(angle);
            mv.strokeWeight(2);
            mv.stroke(PApplet.map(mv.getAmplitude()*4, 0, 1, 0, 255), 255, 255);
            angle += 0.02f;
            mv.box(200);
            mv.sphere(100/2 * mv.getSmoothedAmplitude() * 10);
            mv.popMatrix();
        }
    }
