package org.firstinspires.ftc.teamcode.Omniman;

import com.acmerobotics.roadrunner.Pose2d;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.teamcode.Omniman.TeleOP.TeleOP;
import org.firstinspires.ftc.teamcode.Drive.MecanumDrive;

public class Omniman {

    TeleOP OPmode;

    // Motor and Servo Variables
    private DcMotor linear_slide = null;
    private DcMotor arm_position = null;
    private DcMotor specimen_arm = null;

    private Servo Intake = null;
    private Servo Specimen_adjuster = null;
    private Servo Ypodraiser = null;
    private Servo Xpodraiser = null;

    public MecanumDrive drive;

    public Omniman(HardwareMap hwMap) {
        this(hwMap, new Pose2d(0, 0, 0));
    }

    public Omniman(HardwareMap hwMap, Pose2d pose) {
        drive = new MecanumDrive(hwMap, pose);

        // Initialize motors
        try {
            arm_position = hwMap.dcMotor.get("arm_position");
            arm_position.setDirection(DcMotorSimple.Direction.REVERSE);
            arm_position.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            arm_position.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        } catch (Exception e) {
            arm_position = null; // Handle missing hardware
        }

        try {
            linear_slide = hwMap.dcMotor.get("linear_slide");
            linear_slide.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            linear_slide.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        } catch (Exception e) {
            linear_slide = null; // Handle missing hardware
        }

        try {
            specimen_arm = hwMap.dcMotor.get("specimen_arm");
            specimen_arm.setDirection(DcMotorSimple.Direction.REVERSE);
            specimen_arm.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            specimen_arm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        } catch (Exception e) {
            specimen_arm = null; // Handle missing hardware
        }

        // Initialize servos
        try {
            Intake = hwMap.servo.get("Intake");
        } catch (Exception e) {
            Intake = null; // Handle missing hardware
        }

        try {
            Specimen_adjuster = hwMap.servo.get("Specimen_adjuster");
        } catch (Exception e) {
            Specimen_adjuster = null; // Handle missing hardware
        }

        try {
            Ypodraiser = hwMap.servo.get("Ypodraiser");
        } catch (Exception e) {
            Ypodraiser = null; // Handle missing hardware
        }

        try {
            Xpodraiser = hwMap.servo.get("XpodRaiser");
        } catch (Exception e) {
            Xpodraiser = null; // Handle missing hardware
        }
    }

    public void delay(double seconds) {
        ElapsedTime timer = new ElapsedTime();
        timer.reset();
        while (timer.seconds() < seconds) {
            // Wait loop
        }
    }

    // Accessor methods for motor and servo states
    public double getArmPosition() {
        return arm_position != null ? arm_position.getCurrentPosition() : 0;
    }

    public double getLinearArmPosition() {
        return linear_slide != null ? linear_slide.getCurrentPosition() : 0;
    }

    public double getSpecimenArmPosition() {
        return specimen_arm != null ? specimen_arm.getCurrentPosition() : 0;
    }

    public double getArmPower() {
        return arm_position != null ? arm_position.getPower() : 0;
    }

    public double getLinearArmPower() {
        return linear_slide != null ? linear_slide.getPower() : 0;
    }

    public double getSpecimenArmPower() {
        return specimen_arm != null ? specimen_arm.getPower() : 0;
    }

    public double getIntakePower() {
        return Intake != null ? Intake.getPosition() : 0;
    }

    public double getSpecimenAdjusterPosition() {
        return Specimen_adjuster != null ? Specimen_adjuster.getPosition() : 0;
    }
    public double getArmTargetPos()
        {
          return arm_position.getTargetPosition();
        }
    public double getLinearTargetPos()
    {
        return linear_slide.getTargetPosition();
    }
    public double getSpecimenTargetPos()
    {
        return specimen_arm.getTargetPosition();
    }
}
