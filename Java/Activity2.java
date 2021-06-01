package Activities;

import java.util.*;


public class Activity2 {

	public static void main(String[] args) {
		
		int[] Numbr = {10, 15, 10, -19, 80, 10};
		
		System.out.println("The original Array is:" +Arrays.toString(Numbr));
		
		int SearchNum = 10;
		int fixedSum = 30;
		
		System.out.println("Result:" +result(Numbr, SearchNum, fixedSum));
		
		
		
	}

	private static boolean result (int[] number, int searchNum, int fixedSum) {
		
		int temp_sum = 0;
		
		for (int numbers : number) {
			
			if (numbers == searchNum) {
				temp_sum += searchNum;
				
				if ( temp_sum > fixedSum) {
					
					break;
				}
					
			}
		}
		return temp_sum == fixedSum;

			
			
		}
	}		
		
	

	


