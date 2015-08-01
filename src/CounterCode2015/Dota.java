package CounterCode2015;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Dota {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int n = in.nextInt();
			ArrayList<Integer> num = new ArrayList<>();
			for (int i = 0; i < n; ++i)
				num.add(i+1);

			
			int end = n - 1;

			while (end > 0 && num.get(end) + num.get(end-1) > (n + 1) ) {
				num.add(end, num.get(0));
				num.remove(0);
				end-=2;
			}
			
			for(int i = 0 ; i < n ; ++i){
				if(i == n-1) 
				System.out.print(num.get(i));
				else
					System.out.print(num.get(i)  + " ");
					
			}
			System.out.println();
			
			

		}

	
    }
}