package ifandLoops;

public class Primenumber {

	public void getPrimeNumber(int input){
		boolean flag=true;
		for(int i=2;i<=input/2;i++){
			if (input%i==0){
				System.out.println(input+" is not prime number");
				flag=false;
				break;
			}
			
		}
		if (flag)
			System.out.println(input+" is prime number");		
	}
	
	public static void main(String[] args) {
		Primenumber obj=new Primenumber();
		obj.getPrimeNumber(69);
		// TODO Auto-generated method stub

	}

}
