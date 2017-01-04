package string;

public class Occuranceofchar {

	public void getCharOcurrance(char ch){
		String S= "My first computer";
		System.out.println("first occurance of given character : "+ S.indexOf(ch));
		System.out.println("Last occurance of given character : "+ S.lastIndexOf(ch));
	}
	public static void main(String[] args) {
		Occuranceofchar obj=new Occuranceofchar();
		obj.getCharOcurrance(' ');// TODO Auto-generated method stub

	}

}
