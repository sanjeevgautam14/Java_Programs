package StringTest;

public class ReverseStringUsingForLoop {

	public static void main(String[] args) {
		String str = "Rain in Bangalore";
		String reverse="";
		for(int i=0;i<str.length();i++) {
		char ch= str.charAt(i);
		reverse=ch+reverse;
			
		}
		System.out.println("Original String : " + str);
        System.out.println("Reversed String : " + reverse);
	}

}
