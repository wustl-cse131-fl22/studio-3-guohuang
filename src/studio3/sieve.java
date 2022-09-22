package studio3;

import java.util.Scanner;

public class sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Pick n.");
		int n  = in.nextInt();
		
		boolean[] array = new boolean[n];
		int upperBound = (int) Math.sqrt(n);
		
		for (int i = 1; i < n+1; i++) 
		{
			for (int j = 2; j <= upperBound; j++) 
			{
				if (i % j == 0) 
				{
					array[i-1] = true;
				}	
			}
			array[1] = false;
			array[2] = false;
			if (array[i-1] == false) 
			{
				System.out.println(i);
			}
			
		}
		
		
//	array[1] = false; 
//	if (array[i-1] = false) {
//		System.out.println(i);}
//		for (int k = 1; k < n+1; k++) {
//			if (array[k-1] = false) {
//				System.out.println(k);
//			}
//		}		
		
	}

}
