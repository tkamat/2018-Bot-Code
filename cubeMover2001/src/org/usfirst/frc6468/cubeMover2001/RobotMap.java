// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6468.cubeMover2001;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController slideTrainslider;
    public static SpeedController slideTrainleftSide;
    public static SpeedController slideTrainrightSide;
    public static RobotDrive slideTrainRobotDrive21;
    public static SpeedController verticalLiftliftMotor;
    public static Servo clawclawServo;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        slideTrainslider = new Spark(0);
        LiveWindow.addActuator("slideTrain", "slider", (Spark) slideTrainslider);
        
        slideTrainleftSide = new Spark(1);
        LiveWindow.addActuator("slideTrain", "leftSide", (Spark) slideTrainleftSide);
        
        slideTrainrightSide = new Spark(2);
        LiveWindow.addActuator("slideTrain", "rightSide", (Spark) slideTrainrightSide);
        
        slideTrainRobotDrive21 = new RobotDrive(slideTrainleftSide, slideTrainrightSide);
        
        slideTrainRobotDrive21.setSafetyEnabled(true);
        slideTrainRobotDrive21.setExpiration(0.1);
        slideTrainRobotDrive21.setSensitivity(0.5);
        slideTrainRobotDrive21.setMaxOutput(1.0);

        verticalLiftliftMotor = new Spark(3);
        LiveWindow.addActuator("verticalLift", "liftMotor", (Spark) verticalLiftliftMotor);
        
        clawclawServo = new Servo(4);
        LiveWindow.addActuator("claw", "clawServo", clawclawServo);
        

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
