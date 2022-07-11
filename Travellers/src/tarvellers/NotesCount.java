package tarvellers;

public class NotesCount {
	public void notesCountImplementation(int arr[],int den[],int amount) {
		int i=0;
		
		while(i<arr.length)
		{
			den[i]=amount/arr[i];
			amount=amount%arr[i];
			i++;
		}
					
		
	}
	}
