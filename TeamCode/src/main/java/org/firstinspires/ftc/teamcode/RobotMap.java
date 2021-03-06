package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;

public class RobotMap{

    // Robot Parameters
    public static final Boolean DISPLAY_TIME = true;

    // Drivetrain Parameters
    public static final String LEFT_DRIVE_MOTOR = "left_drive";
    public static final String RIGHT_DRIVE_MOTOR = "right_drive";
    public static final DcMotor.Direction LEFT_DRIVE_DIRECTION = DcMotor.Direction.FORWARD;
    public static final DcMotor.Direction RIGHT_DRIVE_DIRECTION = DcMotor.Direction.REVERSE;

    //Arm Parameters
    public static final String LEFT_ARM_MOTOR = "arm_left";
    public static final String RIGHT_ARM_MOTOR = "arm_right";
    public static final DcMotor.Direction LEFT_ARM_DIRECTION = DcMotor.Direction.FORWARD;
    public static final DcMotor.Direction RIGHT_ARM_DIRECTION = DcMotor.Direction.FORWARD;
    public static final double HIGHSPEED_LIMIT_ARM = 0.6; //0.4;
    public static final double LOWSPEED_ARM = 0.2;
    public static final double ARM_CLIMB = -11.02;
    public static final double PICKUP_POSITION = -202.0;
    public static final double LANDER_STORAGE_DROP = -72.6;
    public static final double kP = 0.05;


    //TankDrive Parameters
    public static final Boolean DISPLAY_MOTOR_VALUES = true;
    public static final Boolean REVERSE_JOYSTICKS = false;
    public static final double HIGHSPEED_LIMIT = 0.8;
    public static final double LOWSPEED = 0.3;

    //Claw Parameters
    public static final String CLAW_SERVO = "claw_servo";
    public static final double SERVO_OPEN = 0.0;
    public static final double SERVO_CLOSED = 1.0;
    public static final double MINIMUM_SERVO_POSITION = 0.0;
    public static final double MAXIMUM_SERVO_POSITION = 1.0;
    public static final double SERVO_ANGLE_DEFAULT = SERVO_CLOSED;

    //Encoder Parameters
    public static final Boolean DISPLAY_ENCODER_VALUES = true;
    public static final double MOTOR_SCALE = -1440.0 / (4.0 * 3.14159); //counts per inch
    public static final double ARM_SCALE = -21.67; //counts per degree
}
