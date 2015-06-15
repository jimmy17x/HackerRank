package Algorithms;

import java.util.Scanner;

public class Freeway {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt();

		int width[] = new int[n];
		for (int i = 0; i < n; ++i) {
			width[i] = in.nextInt();
		}
		
		while(t-- > 0 )
		{
			int i = in.nextInt();
			int j = in.nextInt();
			
			int smallest = 100000 ;
			for(int m = i ; m <= j ; ++m)
			{
				if(width[m] < smallest )
				{
					smallest  =width[m];
				}
			}
			System.out.println(smallest);
		}
		
		

	}

}
