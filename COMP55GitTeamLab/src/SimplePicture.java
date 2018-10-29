//comment one
import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage("robot.jpg", 200, 100);
		add(robot);
<<<<<<< HEAD
		GLabel label = new GLabel("How We feel when using GitHub martyr", 200, 400);
=======
		GLabel label = new GLabel("How We feel when using github hakslah", 200, 400);
>>>>>>> branch 'master' of https://github.com/comp55-fall18/git-team-lab-sky-guppies.git
		add(label);
		
		GLabel label2 = new GLabel("We need to get help finishing this lab", 300, 500);
		add(label2);
		
		//this is a comment
	}
}