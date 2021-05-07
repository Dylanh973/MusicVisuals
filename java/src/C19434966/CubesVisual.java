package C19434966;

import processing.core.*;


public class CubesVisual {

    MyVisuals mv; 
    float angle = 0; //Declaring angle as a variable and setting it to 0.
    float width; //Declaring width as a variable.
    float height; //Declaring height as a variable.
    float t = 225; //Declaring T as a variable for the size of the vertices
    float cube = 200;
    float cube1 = 800;
    float average;

   
    public CubesVisual(MyVisuals mv) //Constructor 
    {
        this.mv=mv;
    }

    public void render ()
        {
                //Top right cube/sphere
            mv.pushMatrix(); 
            mv.lights(); //Getting lights
            mv.noFill(); //Don't fill
            mv.translate(1500, cube, 0); //Position of the cube/sphere
            mv.rotateY(angle); //Rotating its axis
            mv.rotateX(angle);
            mv.strokeWeight(1); //How thick the lines are
            mv.stroke(PApplet.map(mv.getSmoothedAmplitude()*2, 0, 1, 0, 255), 255, 255); //Changes the lines and borders in relation to the Amplitude
            angle += 0.02f; //How fast it changes the angle to spin
            mv.box(200); //Box size1
            mv.sphere(150/2 * mv.getSmoothedAmplitude() * 5); //Declaring the sphere to half the size of the box to make sure it will fit inside
            cube += 0.3;
            mv.popMatrix(); 

                //Comments above relate to this code also
                //Bottom left cube/sphere 
            mv.pushMatrix();
            mv.lights();
            mv.noFill();
            mv.translate(300, cube1, 0);
            mv.rotateX(angle);
            mv.rotateY(angle);
            mv.strokeWeight(1);
            mv.stroke(PApplet.map(mv.getSmoothedAmplitude()*2, 0, 1, 0, 255), 255, 255);
            angle += 0.02f;
            mv.box(200);
            mv.sphere(150/2 * mv.getSmoothedAmplitude() * 5);
            cube1 -= 0.3;
            mv.popMatrix();

            //Pyramid in centre of screen
            mv.pushMatrix();
            mv.translate(mv.width/2f, mv.height/2f);
            mv.stroke(PApplet.map(mv.getAmplitude()*4, 0, 1, 0, 255), 255, 255); 
            mv.rotateZ(angle);

            mv.beginShape();
            mv.vertex(-t, -t, -t);
            mv.vertex( t, -t, -t);
            mv.vertex( 0, 0, t);
    

            mv.vertex( t, -t, -t);
            mv.vertex( t, t, -t);
            mv.vertex( 0, 0, t);
        

            mv.vertex( t, t, -t);
            mv.vertex(-t, t, -t);
            mv.vertex( 0, 0, t);
        

            mv.vertex(-t, t, -t);
            mv.vertex(-t, -t, -t);
            mv.vertex( 0, 0, t);
            mv.endShape();
            
            angle += 0.01f;
            mv.translate(200, 200, 0);
            mv.strokeWeight(1);
            mv.sphere(40 * mv.getSmoothedAmplitude() * 7);
            mv.translate(-100, -100, 0);
            mv.sphere(40 * mv.getSmoothedAmplitude() * 7);
            mv.translate(-200, -200, 0);
            mv.sphere(40 * mv.getSmoothedAmplitude() * 7);
            mv.translate(100, 100, 0);
            mv.sphere(40 * mv.getSmoothedAmplitude() * 7);
            mv.translate(-200, -200, 0);
            mv.sphere(40 * mv.getSmoothedAmplitude() * 7);

            mv.translate(395,-100,0);
            mv.stroke(PApplet.map(mv.getAmplitude()*4, 0, 1, 0, 255), 255, 255);         
            mv.strokeWeight(1);
            mv.noFill(); 
            mv.ellipse(width / 4, 100, 50 + average * 500, 50 + average * 500); //Circle

            mv.translate(-390,400,0);
            mv.stroke(PApplet.map(mv.getAmplitude()*4, 0, 1, 0, 255), 255, 255);         
            mv.strokeWeight(1);
            mv.noFill(); 
            mv.ellipse(width / 4, 100, 50 + average * 500, 50 + average * 500); //Making a circle
            mv.popMatrix();
        }
        
    }