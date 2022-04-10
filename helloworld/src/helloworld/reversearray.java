package helloworld;

import java.util.Arrays;

public class reversearray {
public static void main(String[] args) {
	int[] arr1= {1,5,3,7,11,9,15};
	System.out.println(Arrays.toString(arr1));
	
	reverseArray(arr1);
	System.out.println(Arrays.toString(arr1));	
}

private static void reverseArray(int[] arr1) {
	int maxIndex=arr1.length-1;
	int halfLength=arr1.length/2;
	for(int i=0;i<halfLength;i++)
	{
		int temp=arr1[i];
		arr1[i]=arr1[maxIndex];
		arr1[maxIndex]=temp;
	}
}
}
