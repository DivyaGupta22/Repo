package assignment_4;

public class AppMobile {

	public static void main(String[] args)
	{
		Nexus ne= new Nexus();
		ne.setBatteryBackup("24 hours");
		ne.setCameraMP(8.5f);
		ne.setSmartPhone(true);
		ne.displayMobileinfo();
		Motorola mo =new Motorola();
		mo.setBatteryBackup("20 hours");
		mo.setCameraMP(10.5f);
		mo.setSmartPhone(true);
		mo.displayMobileinfo();
		
	}
}
