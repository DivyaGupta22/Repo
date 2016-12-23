package assignment_4;


	public class Subaru extends AbstractCar {
		private float maxSpeed ;
		  private int milage;
		  
		public Subaru(String ln) {
			super(ln);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void setMaxSpeed(float maxSpeed) {
			this.maxSpeed=maxSpeed;// TODO Auto-generated method stub
			
		}

		@Override
		public float getMaxSpeed() {
			// TODO Auto-generated method stub
			return maxSpeed;
		}

		

		@Override
		public int getMilage() {
			// TODO Auto-generated method stub
			return milage;
		}

		@Override
		public void setMilage(int milage) {
		this.milage=milage;
			
		}

		@Override
		public String toString() {
			return "Subaru [maxSpeed=" + maxSpeed + ", milage=" + milage + "]";
		}
		

}
