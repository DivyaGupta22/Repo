package assignment_4;

public class AppAbstract {

	public static void main(String[] args) {
		FordFigo figo=new FordFigo("K03MN9610");
		figo.setMaxSpeed(160);
		figo.setMilage(4300);
		System.out.println(figo.toString());
		Subaru su=new Subaru("CAL68870");
		su.setMaxSpeed(200.5f);
		su.setMilage(70);
		System.out.println(su.toString());
		

	}

}
