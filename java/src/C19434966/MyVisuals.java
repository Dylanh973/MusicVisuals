package C19434966;


import ie.tudublin.*;

public class MyVisuals extends Visual {

    boolean cube = false;
    boolean turning = false;
    boolean circles = false;
    boolean menu = true;



    CubesVisual cv;
    TurningCube tc;
    Circles cc;
    Menu mm;


    int which = 0;


        public void settings() {
            size(1800, 1050, P3D);
        }

        public void setup()
        {
            startMinim();
            frameRate(60);
            loadAudio("Ecstasy.mp3");
            colorMode(HSB);

            tc = new TurningCube(this);
            cv = new CubesVisual(this);
            cc = new Circles(this);
            mm = new Menu(this);
        }


        public void keyPressed()
        {
            if (key == 'p')
            {
                getAudioPlayer().play();
            }
            if (key == 'l')
            {
                getAudioPlayer().pause();
            }
            if (key == 'k')
            {
                getAudioPlayer().cue(0);
            }
            if ( key == '0')
            {
                menu = ! menu;
                turning = false;
                cube = false;
                circles = false;
            }
            if (key == '1')
            {
                cube = ! cube;
                turning = false;
                menu = false;

            }
            if( key == '2')
            {
                turning = ! turning;
                cube = false;
                menu = false;
            }
            if ( key == '3')
            {
                circles = ! circles;
                turning = false;
                cube = false;
                menu = false;
            }
            if( key == '4')
            {
                cube = ! cube;
            }
        }

        public void draw()
        {
            calculateAverageAmplitude();   
            calculateFrequencyBands(); 

            background(0);
            if(menu)
            {
                mm.render();
            }
            if(cube)
            {
                cv.render();
            }

            if(turning)
            {
                tc.render();
            }
            if(circles)
            {
                cc.render();
            }

        }
    }
