package Algorithms;


/*
 * Problem Statement

Julius Caesar protected his confidential information from his enemies by encrypting it. Caesar rotated every alphabet in the string by a fixed number K. This made the string unreadable by the enemy. You are given a string S and the number K. Encrypt the string and print the encrypted string.

For example:
If the string is middle-Outz and K=2, the encoded string is okffng-Qwvb. Note that only alphabets are encrypted while symbols like - are untouched.
'm' becomes 'o' when alphabets are rotated twice,
'i' becomes 'k',
'-' remains the same because only alphabets are encoded,
'z' becomes 'b' when rotated twice.

Input Format

Input consists of an integer N equal to the length of the string, followed by the string S and an integer K.

Constraints
1≤N≤100
0≤K≤100
S is a valid ASCII string and doesn't contain any spaces.

Output Format

For each test case, print the encoded string.

Sample Input

11
middle-Outz
2

Sample Output

okffng-Qwvb

 */
import java.util.Scanner;

public class CaeserCipher {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int len = in.nextInt();
		in.nextLine();
		String str = in.nextLine();
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		int k = in.nextInt() % 26;
		

		for (int i = 0; i < len; ++i) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				if (ch + k > 'z') {
					ch = (char) ('a' + ch +  k - 'z' - 1);
				} else {
					ch += k;
				}
			} else if (ch >= 'A' && ch <= 'Z') {
				if (ch + k > 'Z') {
					ch = (char) ('A' + ch +  k - 'Z' - 1);

				} else {
					ch += k;
				}
			}
			sb.setCharAt(i, ch);

		}

		System.out.println(sb.toString());
	}

}
