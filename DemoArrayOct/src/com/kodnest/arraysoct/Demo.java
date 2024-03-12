package com.kodnest.arraysoct;


1. even elements of an Array 
2. odd elenents of an Array
3. even index values of an Array
4. odd inded values of an Array






import java.util.Scanner;

class Demo {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("User! please enter the size of an Array");
		int size = scan.nextInt();
		
		//size = 5
		int a[] = new  int[size];
		
		//10 20 30 40 50
		System.out.println("User! please enter the character elements of an Array");
		for(int i=0; i< a.length; i++) {			
			a[i] = scan.nextInt();
		}
		
		System.out.println("The array elements are:");
		for(int i=0; i<=a.length-1; i++) {			
			System.out.println(a[i]);
		}
				
	}
}
