package org.firstinspires.ftc.teamcode.Omniman.TeleOP;

import com.acmerobotics.roadrunner.Pose2d;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Drive.MecanumDrive;
import org.firstinspires.ftc.teamcode.Omniman.Omniman;
public class teleopArmControl {
    Omniman man;
    // Power imports
    double armPositionPower=man.getARMPOWER();
    double LinearSlidePower=man.getLINEARARMPOWER();
    double SpecimenPower=man.getSPECIMANARMPOWER();
    double IntakePower=man.getINTAKEPOWER();
    public teleopArmControl()
    {
        
    }
}
