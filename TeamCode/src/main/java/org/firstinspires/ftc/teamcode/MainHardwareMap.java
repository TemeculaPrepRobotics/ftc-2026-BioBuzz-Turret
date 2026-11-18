package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.CRServo;
public class MainHardwareMap {

    public void init(HardwareMap hardwareMap){

        //DriveTrain initialization

        DcMotorEx frontLeftDTM = hardwareMap.get(DcMotorEx.class, "FrontLeftDTM");
        DcMotorEx frontRightDTM = hardwareMap.get(DcMotorEx.class, "FrontRightDTM");
        DcMotorEx rearLeftDTM = hardwareMap.get(DcMotorEx.class, "RearLeftDTM");
        DcMotorEx rearRightDTM = hardwareMap.get(DcMotorEx.class, "RearRightDTM");

        frontLeftDTM.setDirection(DcMotorSimple.Direction.REVERSE);
        rearLeftDTM.setDirection(DcMotorSimple.Direction.REVERSE);
        frontRightDTM.setDirection(DcMotorSimple.Direction.FORWARD);
        rearRightDTM.setDirection(DcMotorSimple.Direction.FORWARD);

        // Zero power behavior and encoder reset
        DcMotor[] driveMotors = {frontLeftDTM, frontRightDTM, rearLeftDTM, rearRightDTM};
        for (DcMotor motor : driveMotors) {
            motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        }

        //Servo Initialization

        CRServo TurretServo = hardwareMap.get(CRServo.class, "Turret Servo");
        TurretServo.setDirection(DcMotorSimple.Direction.FORWARD);
        TurretServo.setPower(0);
    }



}