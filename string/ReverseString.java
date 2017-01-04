package string;

public class ReverseString {
	
	public void getReverseString(String S) {
		if (S==null){
			System.out.println("please enter string value");
		}
		else {
		char[] ch= S.toCharArray();
		
		System.out.println("Reverse of given string : ");
		for(int i=ch.length-1;i>=0;i--){			
			System.out.print(ch[i]);
		}
		}
	}
	
	
	
	public static void main(String[] args) {
		ReverseString obj=new ReverseString();
			obj.getReverseString("computer");
		// TODO Auto-generated method stub

	}

}
