package string;

public class LongestString {
	public void getLongestString(String[] str)
	{
		//String[] str={"My name is Divya Gupta","Gungun","abc","ndkdlmclmcld"};
		int position =0;
		for(int i=1;i<str.length;i++){
			if(str[i].length()>str[position].length()){
				position=i;
			}			
		}
		System.out.println("Longest string in array is : "+str[position]);	
	}

	public static void main(String[] args) {
		LongestString obj=new LongestString();
		String[] s= {"My ","Gungun","hello my name is Divya","Prathibha"};
		obj.getLongestString(s);


		// TODO Auto-generated method stub

	}

}
