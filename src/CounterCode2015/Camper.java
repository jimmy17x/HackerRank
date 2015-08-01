package CounterCode2015;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Camper {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();

		int snip[] = new int[k];
		for (int i = 0; i < k; ++i)
			snip[i] = in.nextInt();

		Arrays.sort(snip);

		Map<Integer, Integer> indexes = new HashMap<>();

		boolean players[] = new boolean[n];
		for (int i = 0; i < n; ++i)
			players[i] = true;

		for (int i = 0; i < k; ++i) {
			if (snip[0] == 1 && i == 0) {
				players[1] = false;
				// System.out.println(2);
			} else if (snip[k - 1] == n && i == k - 1) {
				players[n - 2] = false;
				// System.out.println(n-1);
			} else {
				players[snip[i] - 2] = false;
				players[snip[i]] = false;

				// System.out.println(snip[i] - 1 );
				// System.out.println(snip[i] + 1);
			}

		}

		int ttl = 0;

		for (int i = 0; i < n; ++i) {

			if (i == n - 1 && !players[i - 1]) {

				++ttl;
				break;
			}

			if (players[i] == false) {
				// System.out.println(i);
				continue;
			}

			else if (isSniper(i + 1, snip)) {
				++ttl;
				// System.out.println("sniper" + (i+1));

			} else if (i != 0 && !players[i - 1] && !isSniper(i + 2, snip)) {

				++ttl;
			} else if (i == 0 && !isSniper(i + 2, snip))
				++ttl;
			else
				players[i] = false;
		}

		 System.out.println(ttl);

	}

	private static boolean isSniper(int b, int[] snip) {
		for (int i = 0; i < snip.length; ++i) {
			if (snip[i] == b)
				return true;

		}
		return false;
	}
}