package stringassignment;


public class Palindrome {

	public static void main(String[] args) {
		
		int i;
		String sc = "Java";
		String sc1 = "";
		int len =sc.length();
		for(i=(len-1);i>=0;i--)
		{
			sc1 = sc1 + sc.charAt(i);
		}
		if (sc.equalsIgnoreCase(sc1))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
