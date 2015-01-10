
package org.usfirst.frc.team5137.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
	
		RobotDrive chassis = new RobotDrive(0,1);
		Joystick driveStick = new Joystick(0);
	
    public void robotInit() {
        chassis.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        chassis.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);

    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    
    chassis.arcadeDrive(driveStick);
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
