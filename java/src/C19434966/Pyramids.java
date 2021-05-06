package C19434966;

import processing.core.*;

public class Pyramids {
    MyVisuals pp; //Declaring variables.
    float height;
    float width;
    float t = 100; //Declaring T as a float for the position of easy vertex for the pyramids.
    float t1 = 85;
    float t2 = 65;
    float t3 = 45;
    float angle1;
    float angle2;



    float angle;

    public Pyramids(MyVisuals pp) //Constructor 
    {
        this.pp=pp;
    }

    public void render(){

    pp.pushMatrix();
    pp.beginShape();
    pp.translate(pp.width/2f, pp.height/2f); //Positioning to the centre
    pp.stroke(PApplet.map(pp.getAmplitude()*4, 0, 1, 0, 255), 255, 255);  //React to the colors
        angle += 0.01f;
        angle1 += 0.02f;
        angle2 += 0.03f;
        
            pp.rotateX(angle);
            pp.rotateY(angle1);
            pp.rotateZ(angle2);

            pp.vertex(-t, -t, -t);
            pp.vertex( t, -t, -t);
            pp.vertex( 0, 0, t);
    
            pp.vertex( t, -t, -t);
            pp.vertex( t, t, -t);
            pp.vertex( 0, 0, t);
        
            pp.vertex( t, t, -t);
            pp.vertex(-t, t, -t);
            pp.vertex( 0, 0, t);
        
            pp.vertex(-t, t, -t);
            pp.vertex(-t, -t, -t);
            pp.vertex( 0, 0, t);
            pp.endShape();
            pp.popMatrix();


            //NEXT SHAPE
        pp.pushMatrix();
        pp.beginShape();
        pp.translate(pp.width/2f, pp.height/2f);
        pp.stroke(PApplet.map(pp.getAmplitude()*4, 0, 1, 0, 255), 255, 255);
            angle += 0.01f;

                pp.rotateX(angle);
                pp.rotateY(angle1);
                pp.rotateZ(angle2);

                pp.vertex(-t1, -t1, -t1);
                pp.vertex( t1, -t1, -t1);
                pp.vertex( 0, 0, t1);
        
                pp.vertex( t1, -t1, -t1);
                pp.vertex( t1, t1, -t1);
                pp.vertex( 0, 0, t1);
            
                pp.vertex( t1, t1, -t1);
                pp.vertex(-t1, t1, -t1);
                pp.vertex( 0, 0, t1);
            
                pp.vertex(-t1, t1, -t1);
                pp.vertex(-t1, -t1, -t1);
                pp.vertex( 0, 0, t1);
            pp.endShape();
            pp.popMatrix();
            //next shape
        
        pp.pushMatrix();
        pp.beginShape();
        pp.translate(pp.width/2f, pp.height/2f);
        pp.stroke(PApplet.map(pp.getAmplitude()*4, 0, 1, 0, 255), 255, 255); 
            angle += 0.01f;

                pp.rotateX(angle);
                pp.rotateY(angle1);
                pp.rotateZ(angle2);

                pp.vertex(-t2, -t2, -t2);
                pp.vertex( t2, -t2, -t2);
                pp.vertex( 0, 0, t2);
        

                pp.vertex( t2, -t2, -t2);
                pp.vertex( t2, t2, -t2);
                pp.vertex( 0, 0, t2);
            

                pp.vertex( t2, t2, -t2);
                pp.vertex(-t2, t2, -t2);
                pp.vertex( 0, 0, t2);
            

                pp.vertex(-t2, t2, -t2);
                pp.vertex(-t2, -t2, -t2);
                pp.vertex( 0, 0, t2);
            pp.endShape();
            pp.popMatrix();

    pp.pushMatrix();
    pp.beginShape();
    pp.translate(pp.width/2f, pp.height/2f);
    pp.stroke(PApplet.map(pp.getAmplitude()*4, 0, 1, 0, 255), 255, 255); 
        angle += 0.01f;
        
            pp.rotateX(angle);
            pp.rotateY(angle1);
            pp.rotateZ(angle2);

            pp.vertex(-t, -t, -t);
            pp.vertex( t, -t, -t);
            pp.vertex( 0, 0, t);
    
            pp.vertex( t, -t, -t);
            pp.vertex( t, t, -t);
            pp.vertex( 0, 0, t);
        
            pp.vertex( t, t, -t);
            pp.vertex(-t, t, -t);
            pp.vertex( 0, 0, t);
        
            pp.vertex(-t, t, -t);
            pp.vertex(-t, -t, -t);
            pp.vertex( 0, 0, t);
            pp.endShape();
            pp.popMatrix();

             //next shape
        pp.pushMatrix();
        pp.beginShape();
        pp.translate(pp.width/2f, pp.height/2f);
        pp.stroke(PApplet.map(pp.getAmplitude()*4, 0, 1, 0, 255), 255, 255);
            angle += 0.01f;

                pp.rotateX(angle);
                pp.rotateY(angle1);
                pp.rotateZ(angle2);

                pp.vertex(-t1, -t1, -t1);
                pp.vertex( t1, -t1, -t1);
                pp.vertex( 0, 0, t1);
        

                pp.vertex( t1, -t1, -t1);
                pp.vertex( t1, t1, -t1);
                pp.vertex( 0, 0, t1);
            

                pp.vertex( t1, t1, -t1);
                pp.vertex(-t1, t1, -t1);
                pp.vertex( 0, 0, t1);
            

                pp.vertex(-t1, t1, -t1);
                pp.vertex(-t1, -t1, -t1);
                pp.vertex( 0, 0, t1);
            pp.endShape();
            pp.popMatrix();

             //next shape
        pp.pushMatrix();
        pp.beginShape();
        pp.translate(pp.width/2f, pp.height/2f);
        pp.stroke(PApplet.map(pp.getAmplitude()*4, 0, 1, 0, 255), 255, 255);
            angle += 0.01f;

                pp.rotateX(angle);
                pp.rotateY(angle1);
                pp.rotateZ(angle2);

                pp.vertex(-t3, -t3, -t3);
                pp.vertex( t3, -t3, -t3);
                pp.vertex( 0, 0, t3);
        

                pp.vertex( t3, -t3, -t3);
                pp.vertex( t3, t3, -t3);
                pp.vertex( 0, 0, t3);
            

                pp.vertex( t3, t3, -t3);
                pp.vertex(-t3, t3, -t3);
                pp.vertex( 0, 0, t3);
            

                pp.vertex(-t3, t3, -t3);
                pp.vertex(-t3, -t3, -t3);
                pp.vertex( 0, 0, t3);
            pp.endShape();
            pp.popMatrix();
            
            
            pp.stroke(PApplet.map(pp.getAmplitude()*15, 0, 1, 0, 255), 255, 255);
            pp.translate(400, 500, 0); //Positioning
            float gap = 2*pp.getSmoothedAmplitude();
            for (float t = 0; t < pp.width; t+=0.5 ) {
                float x = (t * PApplet.cos(t)*gap);
                float y = (t * PApplet.sin(t))*gap;
                pp.point(x, y);
            }
            
            pp.stroke(PApplet.map(pp.getAmplitude()*15, 0, 1, 0, 255), 255, 255);
            pp.translate(1000, 0); //Positioning
            for (float t = 0; t < pp.width; t+=0.5 ) { //incremenet every time by 0.05
                float x = (t * PApplet.cos(t)*gap); //Makes a gap
                float y = (t * PApplet.sin(t))*gap; //Makes a gap
                pp.point(x, y); //Constructs and insitalizes a point at x and y
            }
            
}
}
