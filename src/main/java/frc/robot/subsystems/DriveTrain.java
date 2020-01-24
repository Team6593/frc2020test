/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  /**
   * Creates a new DriveTrain.
   */
  
    public final SpeedControllerGroup leftMotors = Constants.leftMotors;
    public final SpeedControllerGroup rightMotors = Constants.rightMotors;
    public final DifferentialDrive m_Drive = new DifferentialDrive(leftMotors, rightMotors);
  private DifferentialDrive drive;
  
    public void _arcadeDrive(double x, double y){
      m_Drive.arcadeDrive(x, y);
    }
     public void _arcadeDrive(XboxController joy){
      _arcadeDrive(joy.getX(Hand.kLeft), joy.getY(Hand.kRight));

  }

  public void arcadedrive(double movevalue, double rotatevalue){
    drive.arcadeDrive(movevalue, rotatevalue);
  }
  
  public void stopmotor(){
    drive.stopMotor();
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
