package SortingAlgorithms;

import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size,temp;
		size=sc.nextInt();
		int [] arr= new int[size];
		
		System.out.println("Enter the Array:");
		
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Elements of  the Array:");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i< arr.length-1;i++) {
			for(int j=0;j<(arr.length-1)-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					
				}
				
			}
			
		}
		System.out.println("\nSorted Array is");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
