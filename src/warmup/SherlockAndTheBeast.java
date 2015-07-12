package warmup;

import java.util.Scanner;

public class SherlockAndTheBeast {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while (t-- > 0) {
			String s = "";
			int n = in.nextInt();

			for (int j = n; j >= 0; --j) {
				if (j % 3 == 0 && (n - j) % 5 == 0) {
					s = repeat('5', j) + repeat('3',n-j);
					break;
				}
			}
			if(s.equals(""))
				System.out.println("-1");
			else 
				System.out.println(s);
		}

	}

	private static String repeat(char c, int j) {
		//System.out.println(c + "  " + j );
		StringBuilder sb = new StringBuilder();
		while(j-->0)
		{
			sb.append(c);
					
		}
		return sb.toString();
	}

}
