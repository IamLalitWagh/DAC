package com.app.sorting;

import java.util.Arrays;

public class MergeSort {

	
		public static void mergeSort(int[] arr, int left, int right){
			
			//base condition/terminating condition: left >= right
			if(left >=right) 
				return;//terminates
			
			
			int mid=(left+right)/2; //dividing array
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			
			int[] temp = new int[right-left+1];
			
			int i=left, j=mid+1, k=0;
			
			while(i<=mid && j<=right) {
				if(arr[i]<arr[j])
					temp[k++]=arr[i++];
				else
					temp[k++]=arr[j++];
			}
			
			//copying remaining elements
			while(i<=mid)
				 temp[k++]=arr[i++];
			while(j<=right)
				temp[k++]=arr[j++];
			
			for(i=0; i<temp.length; i++) {
				arr[left+i]=temp[i];
			}
			
			System.out.println("the array is: " + Arrays.toString(arr));
			
			
		}
		
		public static void main(String[] args) {
	        int[] arr = { 231, 22, 213, 14, 5};

	        System.out.println("this is merge sort");
	        System.out.println("the array is: " + Arrays.toString(arr));
	        mergeSort(arr, 0, arr.length-1);
	        System.out.println("the sorted array is: " + Arrays.toString(arr));
	        }
}
