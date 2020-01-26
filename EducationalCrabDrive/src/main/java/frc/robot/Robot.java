package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends TimedRobot {
  public static OI;
  public Joystick driveStick;
  public Drive drive; 

  @Override
  public void robotInit() {
    SmartDashboard.putData("Auto mode", m_chooser);
    this.OI = new OI();
    this.drive = new Drive(); 
    this.driveStick = new Joystick (); 
  }

  @Override
  public void robotPeriodic() {
    // N/A
  }

  @Override
  public void disabledInit() {
      // N/A
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void autonomousInit() {
    // N/A
  }

  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
    // N/A
  }

  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();

    drive.drive(); 

    if (OI.driveStick.getRawAxis(2)) {
      drive.fastLeftSteering; 
    }
    if (OI.driveStick.getRawAxis(3)) {
      drive.fastRightSteering; 
    }
    if (OI.driveStick.getRawButton(9)) {
      drive.slowLeftSteering; 
    }
    if (OI.driveStick.getRawButton(10)) {
      drive.slowRightSteering; 
    }
  }

  @Override
  public void testPeriodic() {
    // N/A
  }
} // end of class 
