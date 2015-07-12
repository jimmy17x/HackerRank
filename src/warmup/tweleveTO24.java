package warmup;

import java.util.Scanner;

//Problem Statement
//
//You are given time in AM/PM format. Convert this into a 24 hour format.
//
//Input Format
//
//Input consists of time in the AM/PM format i.e. hh:mm:ssAM or hh:mm:ssPM
//where
//01≤hh≤12
//00≤mm≤59
//00≤ss≤59
//
//Output Format
//
//You need to print the time in 24 hour format i.e. hh:mm:ss
//where
//00≤hh≤23
//00≤mm≤59
//00≤ss≤59
//
//Sample Input
//
//07:05:45PM
//
//Sample Output
//
//19:05:45

public class tweleveTO24 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String twel = in.nextLine();
		String hours = twel.substring(0, 2);

		String min = twel.substring(3, 5);
		String sec = twel.substring(6, 8);

		String amOrpm = twel.substring(8, 10);

		if (amOrpm.equals("AM")) {
			
			if(hours.equals("12"))
				hours = "00";
			
			System.out.println( hours  + ":" + min + ":" + sec);

		} else {

			if(hours.equals("12"))
				System.out.println(hours + ":" + min + ":" + sec);
			else
				System.out.println(12 + Integer.parseInt(hours) + ":" + min + ":" + sec);

		}

	}

}
