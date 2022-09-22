package com.enbuild;

import java.util.Random;
import java.util.Scanner;




//1. Render the Triangle for the given character and number of rows. 
//That means if input character is D and number of rows are 4 then pyramid will be:
//D
//D E
//D E F
//D E F G

public class Assignment {
	static Scanner sc = new Scanner(System.in);
	public static void Triangle() {
		System.out.println("Enter any character");
		char alfa = sc.next().charAt(0);
		char ref=alfa;
		System.out.println("Enter number for iterations");
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(alfa);
				alfa++;
			}
			System.out.println();
			alfa=ref;
		}
	}
	
	//2. Write a game to "Guess the number", that means your program will generate any random number and the user will need to guess the number.
	//In this if take the input from the user
	//- if user guesses the correct number (i.e. it is equal to the generated random number) 
	//then show him success message as "You have guessed the number " + number and if  
	//- if user fails to guess then show message "Not a correct number please try again" 
	//and take the next number from the user

	public static void Guess() {
		int num;
		int guess;
		int max=10;
		Random rn= new Random();
		boolean flag=false;
		num= rn.nextInt(max)+1;
		
		while(!flag) {
			System.out.println("Guess the number upto 10 ");
			guess=sc.nextInt();
			if(guess==num) {
				System.out.println("You have guessed the number "+guess);
				flag=true;
			}
			else {
				System.out.println("Not a correct number try again");
			}
		}
		
	}
	
	//3. Write a program to print the first 100 prime numbers.
	
	public static void Prime() {
		int count=0;
		int div1=0;
		int j=2;
		System.out.println("First 100 prime numbers are as below");
		while(count<100) {
				for (int i = 1; i <= j; i++) {
					if (j % i == 0) {
						div1=div1+1;
					}
				}
				if(div1<=2) {
					System.out.println(j);	
					count=count+1;
				}
				j=j+1;
				div1=0;
			
		}
	}
	
	
	//4. Consider one integer array. Update the array as per the following requirements:
//	- If the element is negative number then make the square of the number
//	- Keep the 0 as is
//	- If the number is positive even number then add the same even number to that
//	- If the number is positive odd number then print the next odd number to that
//	Ex. {0, 13, 5, -4, 6} --> {0, 15, 7, 16, 12}

	
	public static void Integerarray() {
		System.out.println("Enter the number for the size of array");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements of array are");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n;i++) {

			 if (arr[i]<0) {
				arr[i]=(arr[i]*arr[i]);
			}
			else if(arr[i]>0) {
				if(arr[i]%2==0) {
					arr[i]=arr[i]+arr[i];
				}
				else {
					arr[i]=arr[i]+2;
				}
			}
		}
		System.out.println("Elements of updated array are");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

	public static void main(String[] args) {
		Triangle();
		Guess();
		Prime();
		Integerarray();
	}

}
