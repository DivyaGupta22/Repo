package ifandLoops;

public class evennumber {
	public void even_number (int input){
		for (int i=1;i<=input;i++){
			if(i%2==0){
				System.out.println(i+"is a even number");
			}
			else{
				System.out.println(i+"is a odd number");
			}
		}
		System.out.println("End for looping");
	}

	public static void main(String[] args) {
		evennumber obj= new evennumber();
		obj.even_number(20);

	}

}
