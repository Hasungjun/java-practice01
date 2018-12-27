package practice01;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		System.out.print("숫자를 입력하세요:");
		int num = scanner.nextInt();  
		int c = 0;
		int result = 0;
		
		if(num%2==0)
		{
			c=2;
		}
		else
		{
			c=1;
		}
		
		for(int i=c;i<=num;i=i+2)
		{
			
			result = result+i;
				
		}
		
		System.out.println("결과 값 : "+result);
		
		
		scanner.close();
		
	}
}
