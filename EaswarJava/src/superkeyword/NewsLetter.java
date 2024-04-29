package superkeyword;

public class NewsLetter extends News{
	int c = 3;
	public void display() {
		System.out.println("C Value from Parent class : " +super.c);
		System.out.println("C Value from Child class : " +c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NewsLetter sc = new NewsLetter();
		sc.display();
		
	}

}
