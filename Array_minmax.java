package day1;

import java.util.Arrays;
import java.util.Scanner;

public class Array_minmax {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Min value "+arr[0]);
		System.out.println("Max value "+arr[size-1]);
		
	}

}
