package Demo;

public class MotorRunner {

	public static void main(String[] args) {
		MotorBike bike1 =new MotorBike();
		MotorBike honda =new MotorBike();
		
		bike1.start("Ducati");
		honda.Start();
		bike1.speed=100;
		honda.speed=90;
	}

}
