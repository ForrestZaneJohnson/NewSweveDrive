package frc.robot;

public class OI {
  public Joystick driveStick; 
  public OI () {
     this.driveStick = new Joystick(RobotMap.driveJoystickPort); 
  } 
} // end of class
