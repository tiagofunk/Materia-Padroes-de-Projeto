package exemplo_01;

public class CeillingFan {

	public static final int HIGH = 3;
	public static final int MEDIUM = 3;
	public static final int LOW = 3;
	public static final int OFF = 3;
	
	private String location;
	private int speed;
	
	public CeillingFan(String location) {
		super();
		this.location = location;
	}
	
	public void high() {
		speed = HIGH;
	}
	
	public void medium() {
		speed = MEDIUM;
	}
	
	public void low() {
		speed = LOW;
	}
	
	public void off() {
		speed = OFF;
	}

	public int getSpeed() {
		return speed;
	}
	
	
}
