package practice01;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		System.out.println("문자열을 입력하세요. :");
		String a = scanner.nextLine();
		
		int len = a.length();
		
		for(int i=0;i<=len;i++)
		{
			System.out.println(a.substring(0, i));
		}
		
		
		
		
		scanner.close();
		
	}

}
