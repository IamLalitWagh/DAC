package com.app.search;

import java.util.Scanner;

public class BinarySearch {

	public static int binarySearch(int []arr, int key) {
		int left=0;
		int right=arr.length-1;
		int mid; 
		
		while(left<=right) {
			mid= (left+right)/2;
			
			if(key==arr[mid])
				return mid;
			if(key< arr[mid])
				right= mid-1;
			else
				left=mid+1;
		}
		return -1;
		
	}
	
	
	//base case: right < left
	//array with one element l=r, we do not want to continue if r<l
	public static int binarySearchRecursive(int []arr, int left, int right, int key) {
		int index;
		int mid= (left+right)/2; 
		
		if(right < left)
			return -1;	
		if(key==arr[mid])
			return mid;
		if(key< arr[mid])
			index=binarySearchRecursive(arr, left, mid-1, key);
		else
			index=binarySearchRecursive(arr, mid+1, right, key);
		
		return index;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			int[] arr= {23,44,55,66,77,88,99,100,102};
			//Arrays.sort(arr);
			
			System.out.println("Enter key to search");
			int key= sc.nextInt();
			
			//int index= binarySearch(arr, key);
			int index= binarySearchRecursive(arr, 0, arr.length-1, key);
			
			if(index != -1) 
				System.out.println("Key Found at index:"+ index);
			else
				System.out.println("Key not found");
		}
		
		

	}

}
