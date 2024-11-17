package org.firstinspires.ftc.teamcode.Omniman.TeleOP;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.PoseVelocity2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Drive.MecanumDrive;
import org.firstinspires.ftc.teamcode.Omniman.Omniman;

public class TeleOP extends LinearOpMode{

    private com.qualcomm.robotcore.hardware.HardwareMap HardwareMap;
    Omniman Man;
    @Override
    public void runOpMode() throws InterruptedException {

        waitForStart();

        MecanumDrive drive = new MecanumDrive(hardwareMap, new Pose2d(0, 0, 0));
        Man= new Omniman(hardwareMap);

        while(!isStopRequested() && opModeIsActive())
        {

        }
    }
}
