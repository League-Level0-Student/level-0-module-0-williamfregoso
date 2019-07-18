package _02_robot_graffiti;
import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	
	public static void main(String[] args) {
		Robot bob = new Robot();
		bob.penDown();
		bob.setSpeed(20);
 bob.setAngle(135);
 bob.move(100);
 bob.setAngle(45);;
 bob.move(100);
 bob.setAngle(135);
 bob.move(100);
 bob.setAngle(45);;
 bob.move(100);
	}

}
