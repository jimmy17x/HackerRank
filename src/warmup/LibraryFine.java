package warmup;



//Problem Statement
//
//The Head Librarian at a library wants you to make a program that calculates the fine for returning the book after the return date. You are given the actual and the expected return dates. Calculate the fine as follows:
//
//    If the book is returned on or before the expected return date, no fine will be charged.
//    If the book is returned in the same month as the expected return date, Fine = 15 Hackos × Number of late days
//    If the book is not returned in the same month but in the same year as the expected return date, Fine = 500 Hackos × Number of late months
//    If the book is not returned in the same year, the fine is fixed at 10000 Hackos.
//
//Input Format
//
//You are given the actual and the expected return dates in D M Y format respectively. There are two lines of input. The first line contains the D M Y values for the actual return date and the next line contains the D M Y values for the expected return date.
//
//Constraints
//1≤D≤31
//1≤M≤12
//1≤Y≤3000
//
//Output Format
//
//Output a single value equal to the fine.
//
//Sample Input
//
//9 6 2015
//6 6 2015
//
//Sample Output
//
//45
//
//Explanation
//
//Since the actual date is 3 days late than expected, fine is calculated as 15×3=45 Hackos.

import java.util.Scanner;

public class LibraryFine {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int dr = in.nextInt();
		int mr = in.nextInt();
		int yr = in.nextInt();

		int d = in.nextInt();
		int m = in.nextInt();
		int y = in.nextInt();

		if (yr != y) {
			if (yr < y) {
				System.out.println(0);
			} else {
				System.out.println("10000");
			}
			return;
		}
		if (mr != m) {
			if (mr < m) {
				System.out.println(0);
			} else {
				System.out.println(500 * (mr - m));
			}
			return;
		} else {
			if (dr <= d) {
				System.out.println(0);
				return;
			} else {
				System.out.println(15 * (dr - d));
				return;
			}

		}

	}
}