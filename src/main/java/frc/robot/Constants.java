/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

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


}
