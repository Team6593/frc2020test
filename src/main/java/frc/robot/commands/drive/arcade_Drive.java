/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.drive;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

public class arcade_Drive extends CommandBase {
  private final DriveTrain m_DriveTrain;
  private final DoubleSupplier m_speedvalue;
  private final DoubleSupplier m_rotatevalue;

  /**
   * Creates a new arcadeDrive.
   */
  public arcade_Drive(DriveTrain driveTrain, DoubleSupplier speed, DoubleSupplier rotatevalue) {
    m_DriveTrain = driveTrain;
    m_speedvalue = speed;
    m_rotatevalue = rotatevalue;
   
    addRequirements(m_DriveTrain);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_DriveTrain.arcadedrive(m_speedvalue.getAsDouble(), m_rotatevalue.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_DriveTrain.arcadedrive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
