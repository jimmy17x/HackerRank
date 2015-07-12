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
		ArrayList<Character> a = new ArrayList();
		HashMap<Character, Integer> hm = new HashMap();

		for (int i = 0; i < s.length(); ++i) {
			if (hm.containsKey(s.charAt(i)))
				hm.put(s.charAt(i), (hm.get(s.charAt(i))) + 1);
			else
				hm.put(s.charAt(i), + 1);

		}

		for (Entry<Character, Integer> entry : hm.entrySet()) {

			char key = entry.getKey();

			int repeat = entry.getValue() / 2;
			for (int i = 1; i <= repeat; ++i) {
				a.add(key);
			}
		}

		Collections.sort(a);

		for (char c : a) {
			System.out.print(c);
		}

	}

}
