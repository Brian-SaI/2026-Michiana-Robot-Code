package org.firstinspires.ftc.teamcode.Subsystems;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorEx;

public class IndexerSubsystem extends SubsystemBase {

    CRServo topRight;
    CRServo topLeft;
    CRServo bottomRight;
    CRServo bottomLeft;

    public IndexerSubsystem() {
        topLeft =  hardwareMap.get(CRServo.class, "TopLServo");
        bottomLeft =  hardwareMap.get(CRServo.class, "BottomLServo");
        topRight =  hardwareMap.get(CRServo.class, "TopRServo");
        bottomRight =  hardwareMap.get(CRServo.class, "BottomRServo");
    }

    @Override
    public void periodic() {
    }

    public void runIndexer(double power) {
        topLeft.setPower(power);
        topRight.setPower(power);
        bottomLeft.setPower(power);
        bottomRight.setPower(power);
    }
}