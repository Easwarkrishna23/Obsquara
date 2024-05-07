package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s = ExcelRead.readStringData(0, 0);
		System.out.println(s);
		String s1 = ExcelRead.readIntegerData(2, 2);
		System.out.println(s1);
		

	}

}
