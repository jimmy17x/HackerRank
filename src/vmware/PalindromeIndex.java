package vmware;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PalindromeIndex {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		in.nextLine();
		while (t-- > 0) {
			String str = in.nextLine();
			int len = str.length() - 1;
            int index = -1 ;
            int i = 0 ;
			for (; i < len; ++i) {
				if (str.charAt(i) != str.charAt(len)) {
					break;
				}
				--len;
			}
            
            index = i ;
            int tempL = len;
            int tempI = i ;
            for(int  j = i+1 ; j < len ; ++j, --len)
                {
                if(str.charAt(j) != str.charAt(len)){
                    index = tempL;
                    break;
                }
            }
			System.out.println(index);
		}

	
        
    }
}
