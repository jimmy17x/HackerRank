
//https://www.hackerrank.com/challenges/the-love-letter-mystery/editorial
package warmup;

import java.util.Scanner;


public class PalindromeOperaations {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();

		while (n-- > 0) {
			String s = in.nextLine();
			int len = s.length();
			int count = 0;
			for (int i = 0, j = len - 1; i < j; ++i, --j) {

				count += (Math.abs(s.charAt(i) - s.charAt(j)));
			}
			System.out.println(count);
		}

	}

}
