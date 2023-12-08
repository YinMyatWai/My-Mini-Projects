package com.demo.system.ATM;

import java.util.Scanner;

public class ATMsystem {
	

	public static void main(String[] args) {
		
		String inputId = "";
		String inputName = "";
		String inputPassword = "";
		String inputYesOrNo = "";
		double withdraw = 0;
		double remainBalance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//id, name, password, balance
		User user1 = new User("A0001","Kyaw Kyaw", "kyaw30",3000);
		User user2 = new User("A0002","Chaw Chaw", "chaw",8000);
		User user3 = new User("A0003","Su Su", "susu20",2000);
		User user4 = new User("A0004","Aye Aye", "ayeaye70",7000);
		User user5 = new User("A0005","Mi Mi", "mimi10",10000);
		User user6 = new User("A0006","Mg Mg", "mgmg12",12000);
		User user7 = new User("A0007","Wai Wai", "waiwai45",4500);
		User user8 = new User("A0008","Aung Aung", "aungaung60",6000);
		User user9 = new User("A0009","Tun Tun", "tuntun15",1500);
		User user10 = new User("A0010","Mo Mo", "momo80",800);
		
		System.out.println("Please enter your id : ");
		inputId = sc.nextLine();
		
		while(!inputId.equals(user1.id)&&!inputId.equals(user2.id)&&!inputId.equals(user3.id)&&!inputId.equals(user4.id)&&!inputId.equals(user5.id)&&!inputId.equals(user6.id)&&!inputId.equals(user7.id)&&!inputId.equals(user8.id)&&!inputId.equals(user9.id)&&!inputId.equals(user10.id)) {
			System.out.println(" Wrong Id! Please Enter your id again : ");
			inputId = sc.nextLine();
		}

		
		switch(inputId) {
			case "A0001":{
				System.out.println("Please enter your password : ");
				inputPassword = sc.nextLine();
				
				while(!inputPassword.equals(user1.password)) {
					System.out.println("Wrong Password! Please enter your password : ");
					inputPassword = sc.nextLine();
				}
				System.out.println("***** Your information *****");
				System.out.println("Name : "+user1.name);
				System.out.println("Balance : "+user1.balance);
				System.out.println("****************************");
				
				System.out.println("Do you want to withdraw? Type Yes or No : ");
				inputYesOrNo = sc.nextLine();
				
				while(!inputYesOrNo.equals("Yes")&&!inputYesOrNo.equals("No")) {
					System.out.println("You have to type Yes or No!");
					inputYesOrNo = sc.nextLine();
				}
				
				if(inputYesOrNo.equals("Yes")) {
					System.out.println("Please enter the amount you want to withdraw : ");
					withdraw = sc.nextDouble();
				
					while(withdraw>user1.balance) {
						System.out.println("You cannot withdraw that much amount! Please enter withdraw agin : ");
						withdraw = sc.nextDouble();
					}
					if(withdraw <= user1.balance) {
						remainBalance = user1.balance - withdraw;
						
						System.out.println("Withdraw amount : "+withdraw);
						System.out.println("Remain Balance : "+remainBalance);
						System.out.println("Withdraw Successful!");
						System.out.println("Thanks for using our services.");
					}
					
				}else {
					System.out.println("Thanks for using our services.");
				}	
				break;
			}
			case "A0002":{
				System.out.println("Please enter your password : ");
				inputPassword = sc.nextLine();
				
				while(!inputPassword.equals(user2.password)) {
					System.out.println("Wrong Password! Please enter your password : ");
					inputPassword = sc.nextLine();
				}
				System.out.println("***** Your information *****");
				System.out.println("Name : "+user2.name);
				System.out.println("Balance : "+user2.balance);
				System.out.println("****************************");
				
				System.out.println("Do you want to withdraw? Type Yes or No : ");
				inputYesOrNo = sc.nextLine();
				
				while(!inputYesOrNo.equals("Yes")&&!inputYesOrNo.equals("No")) {
					System.out.println("You have to type Yes or No!");
					inputYesOrNo = sc.nextLine();
				}
				
				if(inputYesOrNo.equals("Yes")) {
					System.out.println("Please enter the amount you want to withdraw : ");
					withdraw = sc.nextDouble();
				
					while(withdraw>user2.balance) {
						System.out.println("You cannot withdraw that much amount! Please enter withdraw agin : ");
						withdraw = sc.nextDouble();
					}
					if(withdraw <= user1.balance) {
						remainBalance = user2.balance - withdraw;
						
						System.out.println("Withdraw amount : "+withdraw);
						System.out.println("Remain Balance : "+remainBalance);
						System.out.println("Withdraw Successful!");
						System.out.println("Thanks for using our services.");
					}
					
				}else {
					System.out.println("Thanks for using our services.");
				}	
				break;
			}
			case "A0003":{
				System.out.println("Please enter your password : ");
				inputPassword = sc.nextLine();
				
				while(!inputPassword.equals(user3.password)) {
					System.out.println("Wrong Password! Please enter your password : ");
					inputPassword = sc.nextLine();
				}
				System.out.println("***** Your information *****");
				System.out.println("Name : "+user3.name);
				System.out.println("Balance : "+user3.balance);
				System.out.println("****************************");
				
				System.out.println("Do you want to withdraw? Type Yes or No : ");
				inputYesOrNo = sc.nextLine();
				
				while(!inputYesOrNo.equals("Yes")&&!inputYesOrNo.equals("No")) {
					System.out.println("You have to type Yes or No!");
					inputYesOrNo = sc.nextLine();
				}
				
				if(inputYesOrNo.equals("Yes")) {
					System.out.println("Please enter the amount you want to withdraw : ");
					withdraw = sc.nextDouble();
				
					while(withdraw>user3.balance) {
						System.out.println("You cannot withdraw that much amount! Please enter withdraw agin : ");
						withdraw = sc.nextDouble();
					}
					if(withdraw <= user1.balance) {
						remainBalance = user3.balance - withdraw;
						
						System.out.println("Withdraw amount : "+withdraw);
						System.out.println("Remain Balance : "+remainBalance);
						System.out.println("Withdraw Successful!");
						System.out.println("Thanks for using our services.");
					}
					
				}else {
					System.out.println("Thanks for using our services.");
				}	
				break;
			}
			case "A0004":{
				System.out.println("Please enter your password : ");
				inputPassword = sc.nextLine();
				
				while(!inputPassword.equals(user4.password)) {
					System.out.println("Wrong Password! Please enter your password : ");
					inputPassword = sc.nextLine();
				}
				System.out.println("***** Your information *****");
				System.out.println("Name : "+user4.name);
				System.out.println("Balance : "+user4.balance);
				System.out.println("****************************");
				
				System.out.println("Do you want to withdraw? Type Yes or No : ");
				inputYesOrNo = sc.nextLine();
				
				while(!inputYesOrNo.equals("Yes")&&!inputYesOrNo.equals("No")) {
					System.out.println("You have to type Yes or No!");
					inputYesOrNo = sc.nextLine();
				}
				
				if(inputYesOrNo.equals("Yes")) {
					System.out.println("Please enter the amount you want to withdraw : ");
					withdraw = sc.nextDouble();
				
					while(withdraw>user4.balance) {
						System.out.println("You cannot withdraw that much amount! Please enter withdraw agin : ");
						withdraw = sc.nextDouble();
					}
					if(withdraw <= user4.balance) {
						remainBalance = user4.balance - withdraw;
						
						System.out.println("Withdraw amount : "+withdraw);
						System.out.println("Remain Balance : "+remainBalance);
						System.out.println("Withdraw Successful!");
						System.out.println("Thanks for using our services.");
					}
					
				}else {
					System.out.println("Thanks for using our services.");
				}	
				break;
			}
			case "A0005":{
				System.out.println("Please enter your password : ");
				inputPassword = sc.nextLine();
				
				while(!inputPassword.equals(user5.password)) {
					System.out.println("Wrong Password! Please enter your password : ");
					inputPassword = sc.nextLine();
				}
				System.out.println("***** Your information *****");
				System.out.println("Name : "+user5.name);
				System.out.println("Balance : "+user5.balance);
				System.out.println("****************************");
				
				System.out.println("Do you want to withdraw? Type Yes or No : ");
				inputYesOrNo = sc.nextLine();
				
				while(!inputYesOrNo.equals("Yes")&&!inputYesOrNo.equals("No")) {
					System.out.println("You have to type Yes or No!");
					inputYesOrNo = sc.nextLine();
				}
				
				if(inputYesOrNo.equals("Yes")) {
					System.out.println("Please enter the amount you want to withdraw : ");
					withdraw = sc.nextDouble();
				
					while(withdraw>user5.balance) {
						System.out.println("You cannot withdraw that much amount! Please enter withdraw agin : ");
						withdraw = sc.nextDouble();
					}
					if(withdraw <= user5.balance) {
						remainBalance = user5.balance - withdraw;
						
						System.out.println("Withdraw amount : "+withdraw);
						System.out.println("Remain Balance : "+remainBalance);
						System.out.println("Withdraw Successful!");
						System.out.println("Thanks for using our services.");
					}
					
				}else {
					System.out.println("Thanks for using our services.");
				}	
				break;
			}
			case "A0006":{
				System.out.println("Please enter your password : ");
				inputPassword = sc.nextLine();
				
				while(!inputPassword.equals(user6.password)) {
					System.out.println("Wrong Password! Please enter your password : ");
					inputPassword = sc.nextLine();
				}
				System.out.println("***** Your information *****");
				System.out.println("Name : "+user6.name);
				System.out.println("Balance : "+user6.balance);
				System.out.println("****************************");
				
				System.out.println("Do you want to withdraw? Type Yes or No : ");
				inputYesOrNo = sc.nextLine();
				
				while(!inputYesOrNo.equals("Yes")&&!inputYesOrNo.equals("No")) {
					System.out.println("You have to type Yes or No!");
					inputYesOrNo = sc.nextLine();
				}
				
				if(inputYesOrNo.equals("Yes")) {
					System.out.println("Please enter the amount you want to withdraw : ");
					withdraw = sc.nextDouble();
				
					while(withdraw>user6.balance) {
						System.out.println("You cannot withdraw that much amount! Please enter withdraw agin : ");
						withdraw = sc.nextDouble();
					}
					if(withdraw <= user6.balance) {
						remainBalance = user6.balance - withdraw;
						
						System.out.println("Withdraw amount : "+withdraw);
						System.out.println("Remain Balance : "+remainBalance);
						System.out.println("Withdraw Successful!");
						System.out.println("Thanks for using our services.");
					}
					
				}else {
					System.out.println("Thanks for using our services.");
				}	
				break;
			}
			case "A0007":{
				System.out.println("Please enter your password : ");
				inputPassword = sc.nextLine();
				
				while(!inputPassword.equals(user7.password)) {
					System.out.println("Wrong Password! Please enter your password : ");
					inputPassword = sc.nextLine();
				}
				System.out.println("***** Your information *****");
				System.out.println("Name : "+user7.name);
				System.out.println("Balance : "+user7.balance);
				System.out.println("****************************");
				
				System.out.println("Do you want to withdraw? Type Yes or No : ");
				inputYesOrNo = sc.nextLine();
				
				while(!inputYesOrNo.equals("Yes")&&!inputYesOrNo.equals("No")) {
					System.out.println("You have to type Yes or No!");
					inputYesOrNo = sc.nextLine();
				}
				
				if(inputYesOrNo.equals("Yes")) {
					System.out.println("Please enter the amount you want to withdraw : ");
					withdraw = sc.nextDouble();
				
					while(withdraw>user7.balance) {
						System.out.println("You cannot withdraw that much amount! Please enter withdraw agin : ");
						withdraw = sc.nextDouble();
					}
					if(withdraw <= user7.balance) {
						remainBalance = user7.balance - withdraw;
						
						System.out.println("Withdraw amount : "+withdraw);
						System.out.println("Remain Balance : "+remainBalance);
						System.out.println("Withdraw Successful!");
						System.out.println("Thanks for using our services.");
					}
					
				}else {
					System.out.println("Thanks for using our services.");
				}	
				break;
			}
			case "A0008":{
				System.out.println("Please enter your password : ");
				inputPassword = sc.nextLine();
				
				while(!inputPassword.equals(user8.password)) {
					System.out.println("Wrong Password! Please enter your password : ");
					inputPassword = sc.nextLine();
				}
				System.out.println("***** Your information *****");
				System.out.println("Name : "+user8.name);
				System.out.println("Balance : "+user8.balance);
				System.out.println("****************************");
				
				System.out.println("Do you want to withdraw? Type Yes or No : ");
				inputYesOrNo = sc.nextLine();
				
				while(!inputYesOrNo.equals("Yes")&&!inputYesOrNo.equals("No")) {
					System.out.println("You have to type Yes or No!");
					inputYesOrNo = sc.nextLine();
				}
				
				if(inputYesOrNo.equals("Yes")) {
					System.out.println("Please enter the amount you want to withdraw : ");
					withdraw = sc.nextDouble();
				
					while(withdraw>user8.balance) {
						System.out.println("You cannot withdraw that much amount! Please enter withdraw agin : ");
						withdraw = sc.nextDouble();
					}
					if(withdraw <= user8.balance) {
						remainBalance = user8.balance - withdraw;
						
						System.out.println("Withdraw amount : "+withdraw);
						System.out.println("Remain Balance : "+remainBalance);
						System.out.println("Withdraw Successful!");
						System.out.println("Thanks for using our services.");
					}
					
				}else {
					System.out.println("Thanks for using our services.");
				}	
				break;
			}
			case "A0009":{
				System.out.println("Please enter your password : ");
				inputPassword = sc.nextLine();
				
				while(!inputPassword.equals(user9.password)) {
					System.out.println("Wrong Password! Please enter your password : ");
					inputPassword = sc.nextLine();
				}
				System.out.println("***** Your information *****");
				System.out.println("Name : "+user9.name);
				System.out.println("Balance : "+user9.balance);
				System.out.println("****************************");
				
				System.out.println("Do you want to withdraw? Type Yes or No : ");
				inputYesOrNo = sc.nextLine();
				
				while(!inputYesOrNo.equals("Yes")&&!inputYesOrNo.equals("No")) {
					System.out.println("You have to type Yes or No!");
					inputYesOrNo = sc.nextLine();
				}
				
				if(inputYesOrNo.equals("Yes")) {
					System.out.println("Please enter the amount you want to withdraw : ");
					withdraw = sc.nextDouble();
				
					while(withdraw>user9.balance) {
						System.out.println("You cannot withdraw that much amount! Please enter withdraw agin : ");
						withdraw = sc.nextDouble();
					}
					if(withdraw <= user9.balance) {
						remainBalance = user9.balance - withdraw;
						
						System.out.println("Withdraw amount : "+withdraw);
						System.out.println("Remain Balance : "+remainBalance);
						System.out.println("Withdraw Successful!");
						System.out.println("Thanks for using our services.");
					}
					
				}else {
					System.out.println("Thanks for using our services.");
				}	
				break;
			}
			case "A0010":{
				System.out.println("Please enter your password : ");
				inputPassword = sc.nextLine();
				
				while(!inputPassword.equals(user10.password)) {
					System.out.println("Wrong Password! Please enter your password : ");
					inputPassword = sc.nextLine();
				}
				System.out.println("***** Your information *****");
				System.out.println("Name : "+user10.name);
				System.out.println("Balance : "+user10.balance);
				System.out.println("****************************");
				
				System.out.println("Do you want to withdraw? Type Yes or No : ");
				inputYesOrNo = sc.nextLine();
				
				while(!inputYesOrNo.equals("Yes")&&!inputYesOrNo.equals("No")) {
					System.out.println("You have to type Yes or No!");
					inputYesOrNo = sc.nextLine();
				}
				
				if(inputYesOrNo.equals("Yes")) {
					System.out.println("Please enter the amount you want to withdraw : ");
					withdraw = sc.nextDouble();
				
					while(withdraw>user10.balance) {
						System.out.println("You cannot withdraw that much amount! Please enter withdraw agin : ");
						withdraw = sc.nextDouble();
					}
					if(withdraw <= user10.balance) {
						remainBalance = user10.balance - withdraw;
						
						System.out.println("Withdraw amount : "+withdraw);
						System.out.println("Remain Balance : "+remainBalance);
						System.out.println("Withdraw Successful!");
						System.out.println("Thanks for using our services.");
					}
					
				}else {
					System.out.println("Thanks for using our services.");
				}	
				break;
			}
			default:{
				System.out.println("Worng Id!");
				break;
			}
		}
		

	}

}


























