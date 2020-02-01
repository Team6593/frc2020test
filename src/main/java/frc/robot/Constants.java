/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.XboxController;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static SpeedController leftMotor = new Spark(0);
    public static SpeedController leftMotor2 = new Spark(1);
    public static SpeedControllerGroup leftMotors = new SpeedControllerGroup (leftMotor, leftMotor2);

    public static SpeedController rightMotor = new Spark(2);
    public static SpeedController rightMotor2 = new Spark(3);
    public static SpeedControllerGroup rightMotors = new SpeedControllerGroup(rightMotor, rightMotor2);

    public static DoubleSolenoid ds1 = new DoubleSolenoid(0, 0);
    public static DoubleSolenoid ds2 = new DoubleSolenoid(0, 0);

    public static Compressor com = new Compressor();

    public static SpeedController intakeM = new Spark(4);
    public static SpeedController shootingM = new Spark(5);

    public static final int XBOX_PORT_ID = (0);
    public static final XboxController XBOX_CONTROLLER = new XboxController(XBOX_PORT_ID);
   
    public static final int L_X_AXIS = 0;
    public static final int L_Y_AXIS = 1;
   
    public static final int L_TRIGGER = 2;
    public static final int R_TRIGGER = 3;
   
    public static final int R_X_AXIS = 4;
    public static final int R_Y_AXIS = 5;
   
    public static final int A_BUTTON = 1;
    public static final int B_BUTTON = 2;
    public static final int X_BUTTON = 3;
    public static final int Y_BUTTON = 4;

    public static final int LEFT_TRIGGER_BUTTON = 5;
    public static final int RIGHT_TRIGGER_BUTTON = 6;

    public static final int LEFT_SMALL_BUTTON = 7;
    public static final int RIGHT_SMALL_BUTTON = 8;

    public static final int LEFT_JOYSTICK_BUTTON = 9;
    public static final int RIGHT_JOYSTICK_BUTTON = 10;












































    

    


}
