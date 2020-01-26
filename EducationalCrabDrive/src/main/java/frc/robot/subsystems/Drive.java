package frc.robot.subsystems;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive extends Subsystem {
 // global variables           
  private SwerveModule rightFrontModule; 
  private SwerveModule leftFrontModule; 
  private SwerveModule rightBackModule; 
  private SwerveModule leftBackModule; 
  public static OI;

  public Drive () {
    this.rightFrontModule = new ServeModule(RobotMap.rightFrontDriveMotorPort, RobotMap.rightFrontSteeringMotorPort); 
    this.leftFrontModule = new ServeModule(RobotMap.leftFrontDriveMotorPort, RobotMap.leftFrontSteeringMotorPort);
    this.rightBackModule = new ServeModule(RobotMap.righBackDriveMotorPort, RobotMap.righBackSteeringMotorPort);
    this.leftBackModule = new ServeModule(RobotMap.leftBackDriveMotorPort, RobotMap.leftBackSteeringMotorPort);
    this.OI = new OI(); 
  }

  // drive 
  public void drive () {
    double speed = OI.driveSitck.getRawAxis(1); 
    rightFrontModule.drive(speed); 
    leftFrontModule.drive(speed); 
    rightBackModule.drive(speed); 
    leftBackModule.drive(speed); 
  }

  // steering
  public void fastRightSteering () {
    rightFrontModule.turnRightFast(); 
    leftFrontModule.turnRightFast(); 
    rightBackModule.turnRightFast(); 
    leftBackModule.turnRightFast(); 
  }
  public void slowRightSteering () {
    rightFrontModule.turnRightSlow(); 
    leftFrontModule.turnRightSlow(); 
    rightBackModule.turnRightSlow(); 
    leftBackModule.turnRightSlow(); 
  }
  public void fastLeftSteering () {
    rightFrontModule.turnLeftFast(); 
    leftFrontModule.turnLeftFast(); 
    rightBackModule.turnLeftFast(); 
    leftBackModule.turnLeftFast(); 
  }
  public void slowLeftSteering () {
    rightFrontModule.turnLeftSlow(); 
    leftFrontModule.turnLeftSlow(); 
    rightBackModule.turnLeftSlow(); 
    leftBackModule.turnLeftSlow(); 
  }


} // end of class