package org.firstinspires.ftc.teamcode.Commands;

import com.arcrobotics.ftclib.command.CommandBase;
import org.firstinspires.ftc.teamcode.Subsystems.ShooterSubsystem;

public class ShootCommand extends CommandBase {

    private final ShooterSubsystem shooterSubsystem;

    public ShootCommand(ShooterSubsystem shooterSubsystem) {
        this.shooterSubsystem = shooterSubsystem;
        addRequirements(shooterSubsystem);
    }

    @Override
    public void initialize() {
        // Start the shooter once when the command is scheduled
        shooterSubsystem.runShooter(1000);
    }

    @Override
    public void execute() {
        // Intentionally left blank; the motor continues running in the background
    }

    @Override
    public boolean isFinished() {
        // Returns false so the command stays active (e.g., while a button is held)
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        // Automatically stops the shooter when the command is finished or interrupted
        shooterSubsystem.runShooter(0);
    }
}