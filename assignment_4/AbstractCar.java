package assignment_4;

public abstract class AbstractCar {

/*	float maxSpeed;
	int milage;*/
	String licenceNumber;

	public AbstractCar(String ln){
		this.licenceNumber =ln;
		System.out.println("This Car having License Number : "+licenceNumber);
		}
	
	public   abstract void setMaxSpeed(float maxSpeed);
	public abstract float getMaxSpeed();
	public abstract int getMilage();
	
	public abstract void setMilage(int milage);
	
	
	
}

