package tarvellers;

public class Sort {
	void sort(int arr[],int n) {
	
	for(int i=0;i<n;i++)
	{
		//find the largest element of array
		 int max=arr[i];
		 int pos=i;

		for(int j=i+1;j<n;j++)	
		{
		
			if(arr[j]>max)
			{
				max=arr[j];
				pos=j;
			}
		
		}

		//swap it with the current position		
		int t=arr[i];
		arr[i]=arr[pos];
		arr[pos]=t;
	}
	}
	
}



