package practice01;

public class Prob5 {

	public static void main(String[] args) {
		
		int cnt = 0;
		for(int i=1;i<100;i++) {
			
			if(i/10>0)
			{
				int j = i/10;
				
				if(j%3==0) {
					cnt++;
				}
				
				j = i - j * 10;
				
				if(j%3==0 && j!=0) {
					cnt++;
				}
				
			}
			else {
				
				if(i%3==0) {
					cnt++;
				}
				
			}
			
			
			if(cnt>0)
			{
				System.out.print(i);
				for(int j = 0; j<cnt;j++)
				{
					System.out.print("짝");
				}
				System.out.println("");
			}
			
			
			cnt = 0;
			
		}
	}
}
