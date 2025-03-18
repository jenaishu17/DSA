package day1;

import java.util.Arrays;
import java.util.Scanner;

public class Array_rev {
	
	public static void main(String[] args) {
		  
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter ur array size");
		   int size=sc.nextInt();
		   int num[]=new int[size];

		   for(int i=0;i<size;i++){
		       num[i]=sc.nextInt();
		   
		   }
		   System.out.println(Arrays.toString(num));
		   
		   int start = 0;
	        int end = size - 1;

	        while (start < end) {	           
	            int temp = num[start];
	            num[start] = num[end];
	            num[end] = temp;
	            start++;
	            end--;
	        }
	        System.out.println("\n");
	        System.out.println(Arrays.toString(num));

	}
}
