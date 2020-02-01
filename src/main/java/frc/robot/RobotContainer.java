/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.drive.arcade_Drive;
import frc.robot.commands.intake.intake_Start;
import frc.robot.commands.pistons.piston_Push;
import frc.robot.commands.rotateMotors.rotateMotors_Start;
import frc.robot.commands.shootOut.shootOut_Start;
import frc.robot.subsystems.DriveTrain;
/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  private final DriveTrain m_drive = new DriveTrain();

  private final piston_Push p_P = new piston_Push();
  private final intake_Start i_S = new intake_Start();
  private final shootOut_Start s_S = new shootOut_Start();
  private final rotateMotors_Start r_S = new rotateMotors_Start(m_drive);

  private final XboxController x_stick = new XboxController(0);

  private Command m_autoCommand;
  /**
   * The container for the robot. Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    m_drive.setDefaultCommand(new arcade_Drive(m_drive, ()-> x_stick.getRawAxis(1), ()->x_stick.getRawAxis(4)));
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {


    final JoystickButton a_Button = new JoystickButton(x_stick, Constants.B_BUTTON);
    final JoystickButton b_Button = new JoystickButton(x_stick, Constants.A_BUTTON);
    final JoystickButton x_Button = new JoystickButton(x_stick, Constants.X_BUTTON);
    final JoystickButton y_Button = new JoystickButton(x_stick, Constants.Y_BUTTON);

    a_Button.whenPressed(p_P);
    b_Button.whenPressed(i_S);
    x_Button.whenPressed(s_S);
    y_Button.whenPressed(r_S);
    
    


    





  }

  /**
   * 
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
