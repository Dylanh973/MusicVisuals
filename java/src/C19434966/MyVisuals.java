package C19434966;

import ie.tudublin.*;

public class MyVisuals extends Visual {

    boolean cube = false;
    boolean turning = false;

    CubesVisual cv;
    TurningCube tc;

    int which = 0;


        public void settings() {
            size(1920, 1080, P3D);
        }

        public void setup()
        {
            startMinim();
            frameRate(60);
            loadAudio("Ecstasy.mp3");
            colorMode(HSB, 100);

            tc = new TurningCube(this);
            cv = new CubesVisual(this);
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
            if (key == '1')
            {
                cube = ! cube;
            }
            if( key == '2')
            {
                turning = ! turning;
            }
        }

        public void draw()
        {
            calculateAverageAmplitude();   

            background(0);
            if(cube)
            {
                cv.render();
            }

            if(turning)
            {
                tc.render();
            }

        }
    }
