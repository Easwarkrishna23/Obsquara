package exceptionhandling;

import java.util.*;

public class Exception6 {

	public static void main(String[] args) throws InvalidAge {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		if(age > 18)
		{
			System.out.println("Eligible for driving liscense");
		}
		else
		{
			throw new InvalidAge("Can't apply for liscense");
		}
	}

}
