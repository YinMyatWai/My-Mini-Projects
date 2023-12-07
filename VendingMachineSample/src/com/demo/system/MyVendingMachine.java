package com.demo.system;

import java.util.Scanner;

public class MyVendingMachine {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("****************************");
		System.out.println("Welcome to Vending Machine");
		System.out.println("****************************\n");
		
		System.out.println("Products Available : ");
		System.out.println("1. Twix - Price : 100 ");
		System.out.println("2. Coke - Price : 50");
		System.out.println("3. Water - Price : 30");
		System.out.println("4. Sandwich - Price : 150");
		
		
		String decision;
		int change = 0;
		int balance = 0;
		int item1Price = 100;
		int item2Price = 50;
		int item3Price = 30;
		int item4Price = 150;
		
		System.out.println("Your money amount : (more than 30)");
		int userAmount = sc.nextInt();
		
		do {
			
			if(userAmount>=30) {
				
				System.out.println("\nPlease select your product : ");
				int selectedItem = sc.nextInt();
				
				System.out.println("Please enter quantity of selected item : ");
				int quantity = sc.nextInt();
				
				switch(selectedItem) {
					case 1:{
						System.out.println("Comfirm message : You selected item "+selectedItem+" of quantity "+quantity);
						balance += item1Price * quantity;
						break;
					}
					case 2:{
						System.out.println("Comfirm message : You selected item "+selectedItem+" of quantity "+quantity);
						balance += item2Price * quantity;
						break;
					}
					case 3:{
						System.out.println("Comfirm message : You selected item "+selectedItem+" of quantity "+quantity);
						balance += item3Price * quantity;
						break;
					}
					case 4:{
						System.out.println("Comfirm message : You selected item "+selectedItem+" of quantity "+quantity);
						balance += item4Price * quantity;
						break;
					}
					default: {
						System.out.println("There is no item like this!");
						break;
					}
				
				}	
				
			}else{
				System.out.println("Amount not enough to buy!!!");
				System.exit(0);
			};
			if(userAmount>=balance) {
				 change = userAmount - balance;
				
			}else {
				System.out.println("Reach to the limit of your amount, Sorry!");
				System.exit(0);
			}
				

			sc.nextLine();
			System.out.println("Do you want to buy more? (Please enter y for yes and n for no) : ");
			decision = sc.nextLine();
			
			
			
		}while(decision.equals("y"));
		
		System.out.println("Your balance is : "+ balance);
		System.out.println("Your change is : "+ change);
		System.out.println("Thanks for shopping!");
		

	}

}
