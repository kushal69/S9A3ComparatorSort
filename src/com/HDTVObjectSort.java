package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//	Main Class implemented to demonstrate the use of Comparator on the User defined objects
public class HDTVObjectSort {  

	//	Main method which takes the user input based on the choice which will be provided and invoking the SizeComparator Comparator to sort
	public static void main(String[] args) {
		HDTV hdtv = new HDTV();											//	User Defined Class object 
		
		Scanner userInput = new Scanner(System.in);						//	Scanner object to take the user input from the console
		List<HDTV> hdtvList = new ArrayList<HDTV>();
		
		int choice = 0;													//	Declaring the choice element to store the user entered choice

		while (true) {													//	Infinite Loop to get the user input until it is user interpreted.
			System.out.print("Enter 1. Add HDTV 2. Display HDTV List 3. Exit : ");	//	Displaying options

			choice = userInput.nextInt();								//	Getting the choice from the user

			if (choice == 1) {											//	If Choice is 1 then user can enter values to HDTV Object
				hdtv = new HDTV();										//	Creating new HDTV object every time
				
				System.out.print("Enter a Brand Name of HDTV : ");
				String brandName = userInput.next(); 
				hdtv.setBrandName(brandName);							//	Setting the Brand name of the object
				
				System.out.print("Enter the size of the " + userInput.nextLine() + " HDTV : ");
				hdtv.setSize(userInput.nextLong());						//	Setting the Size of the object
				
				hdtvList.add(hdtv);										//	Adding it to the ArrayList of type HDTV
			} else if (choice == 2) {									//	If Choice is 2 All the Elements in the Array list are displayed
				Collections.sort(hdtvList, new SizeComparator());		//	Invoking the Custom Comparator to sort the HDTV objects based on the size
					
				System.out.println("------------------------------------------------------------------------------------------------------------------------");
				System.out.println("Entered HDTV's List are -> ");
				for(HDTV tv : hdtvList){								//	Loop to display the HDTV objects
					System.out.println("Size ->	" + tv.getSize() + "	|	" + "BradName ->	" + tv.getBrandName() );
				}
				System.out.println("------------------------------------------------------------------------------------------------------------------------");
			} else if (choice == 3) {									//	If Choice is 3 Exited from the Loop
				System.out.println("Exited ............... ");
				break;
			} else {													//	If User Enters any choice other than the provided
				System.out.println("Enter a Valid Choice ................ ");
				continue;
			}
		}

		userInput.close();												//	Closing the scanner stream to handle memory leak
	}}
