package assignment_4;

public class Nexus implements Mobile {

	private boolean smart;
	private String backup;
	private float MP;
	
	public void setSmartPhone(boolean smart) {
		this.smart=smart;
		
	}

	public void setBatteryBackup(String backup) {
		this.backup=backup;
		
	}

	public void setCameraMP(float MP) {
		this.MP=MP;
		
	}


	public boolean getSmartPhone() {
		// TODO Auto-generated method stub
		return smart;
	}

	public String getBatteryBackup() {
		// TODO Auto-generated method stub
		return backup;
	}

	public float getCameraMP() {
		// TODO Auto-generated method stub
		return MP;
	}

	public void displayMobileinfo()
	{System.out.println("Nexus mobile having following features :" );
	System.out.println("Smart Phone: "+ getSmartPhone());
	System.out.println("BatteryBackup: " + getBatteryBackup());
	System.out.println("Camara :"+getCameraMP());
	}

	

}
