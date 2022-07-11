package tarvellers;

import java.util.*;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the currency size denominations");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println();
		System.out.println("Enter all the currency denomination values");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Enter the amount you want to pay");
		int payamt = sc.nextInt();
		
		System.out.println();
		int []countden=new int[size];
		Sort obj=new Sort();
		obj.sort(arr, size);
		/*System.out.println("currencies in decreasing denominations are:");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]+" ");
		}*/
		
		NotesCount N=new NotesCount();
		N.notesCountImplementation(arr,countden, payamt);
		System.out.println("your payment approach in order to give min no of notes will be");
		for(int i=0;i<arr.length;i++)
		{
			
				if(countden[i]!=0)
					System.out.println(arr[i]+":"+countden[i]);
		}
		
		
	}

}
