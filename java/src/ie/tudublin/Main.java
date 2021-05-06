package ie.tudublin;

import C19434966.*;
import example.AudioBandsVisual;
import example.*;


public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new MyVisuals());		
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();			
	}
}