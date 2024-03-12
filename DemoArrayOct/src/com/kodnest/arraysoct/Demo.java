package com.kodnest.arraysoct;








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
