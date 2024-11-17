package org.firstinspires.ftc.teamcode.Omniman;


import com.acmerobotics.roadrunner.Pose2d;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.Drive.MecanumDrive;


public class Omniman {
    //Motor Values
    private double WANTEDARMPOSITION = 0;
    private double ARMPOSITION=0;
    private double WANTEDLINEARARMPOSITION=0;
    private double LINEARARMPOSITION=0;
    private double WANTEDSPECIMANARMPOSITION=0;
    private double SPECIMANARMPOSITION=0;

    //Motor Variables
    DcMotor linear_slide;
    DcMotor arm_position;
    DcMotor specimen_arm;

    //Servo Variables
    Servo Intake;
    Servo Specimen_adjuster;
    Servo Ypodraiser;
    Servo Xpodraiser;

    public MecanumDrive drive;
    public Omniman(HardwareMap hwMap){
        this(hwMap, new Pose2d(0,0,0));
    }
    public Omniman(HardwareMap hwMap, Pose2d pose)
    {
        drive=new MecanumDrive(hwMap, pose);
        //Sample Arm code
        //Arm Position base code
        arm_position=hwMap.dcMotor.get("arm_position");
        arm_position.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        arm_position.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        ARMPOSITION=arm_position.getCurrentPosition();
        WANTEDARMPOSITION=arm_position.getTargetPosition();
        //Linear Slide base code
        linear_slide=hwMap.dcMotor.get("linear_slide");
        linear_slide.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        linear_slide.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        LINEARARMPOSITION=linear_slide.getCurrentPosition();
        WANTEDLINEARARMPOSITION=linear_slide.getCurrentPosition();
        //Sample arm code end
        //Specimen arm base code
        specimen_arm=hwMap.dcMotor.get("specimen_arm");
        specimen_arm.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        specimen_arm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        SPECIMANARMPOSITION=specimen_arm.getCurrentPosition();
        WANTEDSPECIMANARMPOSITION=specimen_arm.getTargetPosition();

        //Intake code
        Intake=hwMap.servo.get("Intake");

        //Specimen Arm adjuster
        Specimen_adjuster=hwMap.servo.get("Specimen_adjuster");

        //Odometery Pod Movers
        Ypodraiser=hwMap.servo.get("Ypodraiser");
        Xpodraiser=hwMap.servo.get("XpodRaiser");


    }
    public void delay(double seconds){
        ElapsedTime timer = new ElapsedTime();
        timer.reset();
        while(timer.seconds() < seconds){

        }

    }

    public double getWANTEDARMPOSITION() {
        return WANTEDARMPOSITION;
    }

    public double getWANTEDLINEARARMPOSITION() {
        return WANTEDLINEARARMPOSITION;
    }

    public double getWANTEDSPECIMANARMPOSITION() {
        return WANTEDSPECIMANARMPOSITION;
    }
}
