package ifandLoops;

public class PrintStar {

	public void getPrintStar(int number){
		for (int i=1;i<=number;i++){
			for (int j=0;j<i;j++){
			System.out.print("*");
		}
			System.out.println();
	}
	}
	
  public void getreversePrintstar(int number){
		for (int i=number;i>0;i--){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		}

	public static void main(String[] args) {
		PrintStar obj=new PrintStar();		
		obj.getPrintStar(10);// TODO Auto-generated method stub
		obj.getreversePrintstar(10);

	}

}
