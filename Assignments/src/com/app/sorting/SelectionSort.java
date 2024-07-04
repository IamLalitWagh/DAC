package com.app.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void swap(int[] a, int i, int j) {
		int temp;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	public static void selectionSort(int[] arr) {
		int i,j;
		for(i=0; i<arr.length-1; i++) {
			for(j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					swap(arr,i,j);
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
				}
				
				
			}
			System.out.println(Arrays.toString(arr));
			
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {22,54,65,45,86,3,6,44,87};
		
		System.out.println("Before Swap"+Arrays.toString(a));
		
		selectionSort(a);
		
		System.out.println("After Swap"+Arrays.toString(a));
		
	}

}
