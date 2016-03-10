package org.usfirst.frc.team2856.robot;

//import edu.wpi.first.wpilibj.AnalogAccelerometer;
//import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;

public class RobotMap {
//	public static AnalogAccelerometer DRIVE_ACCEL;
//	public static AnalogGyro DRIVE_GYRO;
	public static Encoder DRIVE_ENCODER_LEFT;
	public static Encoder DRIVE_ENCODER_RIGHT;
	public static SpeedController DRIVE_MOTOR_LEFT;
	public static SpeedController DRIVE_MOTOR_RIGHT;
	public static SpeedController INTAKE_MOTOR;

	public static void init() {
		// Analog In (0-3, 4-7)
//		DRIVE_ACCEL = new AnalogAccelerometer(0);
//		DRIVE_GYRO = new AnalogGyro(1);
		
		// Analog Out (none, 0-1)
		
		// DIO (0-9, 10-25)
		DRIVE_ENCODER_LEFT = new Encoder(0, 1, true, EncodingType.k4X);
		DRIVE_ENCODER_RIGHT = new Encoder(2, 3, false, EncodingType.k4X);
		
		// PWM (0-9, 10-19)
		DRIVE_MOTOR_LEFT = new Jaguar(0);
		DRIVE_MOTOR_RIGHT = new Jaguar(1);
		INTAKE_MOTOR = new Victor(4);
		
		// Relay (0-3, none)
		
		// Additional hardware configurations
//		DRIVE_ACCEL.setSensitivity(1.0);
//		DRIVE_GYRO.setSensitivity(1.0);
		
		DRIVE_ENCODER_LEFT.setDistancePerPulse(0.003522);	// (feet/count)
		DRIVE_ENCODER_RIGHT.setDistancePerPulse(0.003522);	// (feet/count)
		
		DRIVE_MOTOR_LEFT.setInverted(true);
		DRIVE_MOTOR_RIGHT.setInverted(true);
	}
}
