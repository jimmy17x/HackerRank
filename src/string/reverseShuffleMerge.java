package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class reverseShuffleMerge {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String s = in.nextLine();
		char[] arr = new char[26];
		int[] num = new int[26];
		
		for (int i = 0; i < 26; ++i)
			arr[i] = '0';
		for (int i = 0; i < 26; ++i)
			num[i] = 0;

		for (int i = 0; i < s.length(); ++i) {
			++num[s.charAt(i) - 'a'];
			arr[s.charAt(i) - 'a'] =s.charAt(i) ;
			

		}

		for (int i = 0; i < 26; ++i) {
			if (num[i] != 0) {
				int times = num[i] / 2;
				while (times-- > 0)
					System.out.print(arr[i]);
			}
		}
	}

}
