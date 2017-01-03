package ifandLoops;

public class Fibonacci {
	public void myfibonacci(int count)
	{
	int[] fibo=new int[count];
	fibo[0]=0;
	fibo[1]=1;
	
	for(int i=2;i<count;i++){
		fibo[i]=fibo[i-1]+fibo[i-2];
		
	}
	
	for (int i=0;i<count;i++){
		System.out.print(fibo[i]+" ");
		
	}
	}


	public static void main(String[] args) {
		Fibonacci obj = new Fibonacci();
		obj.myfibonacci(19);
		
		// TODO Auto-generated method stub

	}

	}
