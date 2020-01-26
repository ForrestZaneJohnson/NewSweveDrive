package frc.robot.subsystems;
import edu.wpi.first.wpilibj.command.Subsystem;

public class SwerveModule extends Subsystem {
 // global variables 
  public VictorSRX drive;
  public TalonSRX steering; 

 // constructor   
  public ExampleSubsytem(int drivePort, int steeringPort) {
    this.drive = new TalonSRX(drivePort); 
    this.steering = new TalonSRX(SteeringPort); 
  }

  // drive
  public void drive (double speed) {
    this.drive.set(ControlMode.PercentOutput,-speed); 
  }

  // steering 
  public void turnRightFast () {
    this.steering.set(ControlMode.PercentOutput,.75); 
  }
  public void turnRightSlow () {
    this.steering.set(ControlMode.PercentOutput,.25); 
  }
  public void turnLeftFast () {
    this.steering.set(ControlMode.PercentOutput,-.75); 
  }
  public void turnLeftSlow () {
    this.steering.set(ControlMode.PercentOutput,-.25); 
  }

} // end of class