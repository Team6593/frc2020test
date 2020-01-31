/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ShootOut extends SubsystemBase {
  /**
   * Creates a new Shoot_out.
   */
   public final SpeedController shM = Constants.shootingM;

   public void start(double s){
     shM.set(s);
   }

  public void back(double s) {
    shM.set(-s);
  }

  public void stop(){
    shM.set(0);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
