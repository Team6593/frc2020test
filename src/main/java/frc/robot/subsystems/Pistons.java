/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Pistons extends SubsystemBase {

  private final DoubleSolenoid d1 = Constants.ds1;
  private final DoubleSolenoid d2 = Constants.ds2;

  public void forward(){
    d1.set(DoubleSolenoid.Value.kForward);
    d2.set(DoubleSolenoid.Value.kForward);
  }

  public void back(){
    d1.set(DoubleSolenoid.Value.kReverse);
    d2.set(DoubleSolenoid.Value.kReverse);
  }

  public void stop(){
    d1.set(DoubleSolenoid.Value.kOff);
    d2.set(DoubleSolenoid.Value.kOff);

  }
  /**
   * Creates a new Pistons.
   */
  public Pistons() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
