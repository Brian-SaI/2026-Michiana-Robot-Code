package org.firstinspires.ftc.teamcode.Subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ShooterSubsystem extends SubsystemBase {

    private final DcMotorEx lShooter;
    private final DcMotorEx rShooter;

    public ShooterSubsystem(final HardwareMap hMap) {
        lShooter = hMap.get(DcMotorEx.class, "LShooter");
        rShooter = hMap.get(DcMotorEx.class, "RShooter");

        // Optional but recommended: Reverse one motor if they face opposite directions
        // rShooter.setDirection(DcMotorEx.Direction.REVERSE);
    }

    @Override
    public void periodic() {
        // Will run automatically every loop cycle if needed later
    }

    public void runShooter(double velocity) {
        lShooter.setVelocity(velocity);
        rShooter.setVelocity(velocity);
    }
}