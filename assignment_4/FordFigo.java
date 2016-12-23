package assignment_4;

public class FordFigo extends AbstractCar {
 private float maxSpeed ;
  private int milage;
  
	public FordFigo(String ln) {
		super(ln);
				// TODO Auto-generated constructor stub
	}

	@Override
	public void setMaxSpeed(float maxSpeed) {
		this.maxSpeed=maxSpeed;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMilage(int milage) {
		this.milage=milage;
				// TODO Auto-generated method stub
		
	}

	@Override
	public float getMaxSpeed() {
		// TODO Auto-generated method stub
		return this.maxSpeed;
	}

	@Override
	public int getMilage() {
		// TODO Auto-generated method stub
		return this.milage;
	}
	
	@Override
	public String toString() {
		return "FordFigo [maxSpeed=" + maxSpeed + ", milage=" + milage + "]";
	}
	

}
