package warmup;

import java.util.Scanner;

/*
 * 
 * https://www.hackerrank.com/challenges/the-time-in-words

 Problem Statement

 Given the time in numerals we may convert it into words, as shown below:

 5:005:015:105:305:405:455:475:28→ five o' clock→ one minute past five→ ten minutes past five→ half past five→ twenty minutes to six→ quarter to six→ thirteen minutes to six→ twenty eight minutes past five

 Write a program which prints the time in words for the input given in the format mentioned above.

 Input Format

 There will be two lines of input:
 H, representing the hours
 M, representing the minutes

 Constraints
 1≤H≤12
 0≤M<60

 Output Format

 Display the time in words.

 Sample Input

 5  
 47  

 Sample Output

 thirteen minutes to six

 */

public class TheTinmeInWords {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int m = in.nextInt();
		String time[] = { "one", "two", "three", "four", "five", "six",
				"seven", "eight", "nine", "ten", "eleven", "twelve",
				"thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "nineteen", "twenty", "twenty one", "twenty two",
				"twenty three", "twenty four", "twenty five", "twenty six",
				"twenty seven", "twenty eight", "twenty nine" };
		if (m == 0)
			System.out.println(time[h-1] + " o' clock");
		else if (m == 1)
			System.out.println(time[m - 1] + " minute past " + time[h-1]);
		else if (m < 15)
			System.out.println(time[m - 1] + " minutes past " + time[h-1]);
		else if (m == 15)
			System.out.println("quarter past " + time[h-1]);
		else if (m < 30)
			System.out.println(time[m - 1] + " minutes past " + time[h-1]);
		else if (m == 30)
			System.out.println("half past " + time[h-1]);
		else if (m < 45)
			System.out.println(time[60 - m - 1] + " minutes to " + time[h]);
		else if (m == 45)
			System.out.println("quarter to " + time[h ]);
		else if (m == 59)
			System.out.println(time[60 - m - 1] + " minute to " + time[h]);
		else
			System.out.println(time[60 - m-1] + " minutes to " + time[h]);
}

}
