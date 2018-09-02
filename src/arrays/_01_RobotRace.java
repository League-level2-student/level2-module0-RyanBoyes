package arrays;



import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {

	//1. make a main method
public static void main(String[] args) {
	boolean finished = false;
	Robot[] Rs = new Robot[5];
	Robot[] Rz = new Robot[4];
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.
for(int i = 0; i<Rz.length;i++) {
	Rz[i] = new Robot();
}
		//4. make each robot start at the bottom of the screen, side by side, facing up
for(int a = 0; a<Rz.length;a++) {
	Rz[a].setX(a*100+90); Rz[a].setY(800);

}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
Random randy = new Random();


while(!finished) {
	for(int q = 0;q<Rz.length;q++) {
		Rz[q].setSpeed(15);
		int rand = randy.nextInt(100);
		Rz[q].move(rand);
		if(Rz[q].getY()<=200*q+100) {
			Rz[q].turn(90);
		}
		if(Rz[q].getX()>=1500-q*200) {
			Rz[q].turn(90);
		}
		if(Rz[q].getY()<=0) {
			JOptionPane.showMessageDialog(null, "Robot number " + q + " is the winner.");
		}
	}
}






while(!finished) {
for(int z = 0;z<Rs.length;z++) {
	Rs[z].setSpeed(15);
	int ran = randy.nextInt(100);
	Rs[z].move(ran);
if(Rs[z].getY()<=0) {
	JOptionPane.showMessageDialog(null, "Robot number " + z + " is the winner.");
}
}

}

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.

}
}

