package warmup;

import java.util.Scanner;

public class AngryProfessor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		while(t-- > 0)
		{
			int n = in.nextInt();
			int k = in.nextInt();
			in.nextLine();
			int studInClass = 0 ;
			for(int i = 0 ; i < n ; ++i)
			{
				if(in.nextInt() <=0)
					++studInClass ; 
					
			}
			if(studInClass  < k )
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}
	}

}
