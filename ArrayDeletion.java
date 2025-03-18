package day2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeletion {
	public static void main(String[] args) {
	
		int arr[]=new int[20];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur Array Size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
		       System.out.print(arr[i]);
		       System.out.print(" ");
		   }
		//System.out.println(Arrays.toString(arr));
		System.out.println("Enter the position to delete value");
		int pos=sc.nextInt();
		//arr[pos-1]=0;
		for(int n=pos-1;n<size;n++)
		{
			arr[n]=arr[n+1];
		}
		size--;
		for(int i=0;i<size;i++){
		       System.out.print(arr[i]);
		       System.out.print(" ");
		   }
		//System.out.println(Arrays.toString(arr));
	}
	
}
