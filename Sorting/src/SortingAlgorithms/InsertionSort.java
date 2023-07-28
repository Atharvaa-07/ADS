package SortingAlgorithms;
import java.util.*;
public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr;
		int size,val,pos=0;
		System.out.println("Enter the Size of Array:");
		size= sc.nextInt();
		arr= new int[size];
		
		while(pos<size) {
			System.out.println("Enter the value to be inserted:");
			val=sc.nextInt();
			for(int i=pos-1;i>=0;i--) {
				if(val>arr[i])
					arr[i+1]=arr[i];
				else
					break;		
			}
			arr[i+1]=val;
			pos++;
			
		}
		
	}

}
