package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		example1();
	}
	
	public static void example1()
	{
		menu();
		Bank bank = new Bank("Bank of CPHS");
		int ewbankAccountNo = bank.createAccount("Mr. Ewbank");
		int howardAccountNo = bank.createAccount("Mr. Howard");
		
		bank.deposit(ewbankAccountNo, 25);
		bank.deposit(howardAccountNo, 75);

		bank.checkBalance(ewbankAccountNo);
		bank.checkBalance(howardAccountNo);
		
		bank.withdraw(ewbankAccountNo, 10);
		bank.closeAccount(howardAccountNo);
		
		bank.checkBalance(ewbankAccountNo);
		bank.checkBalance(howardAccountNo);
		
	}
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to our bank! How can we help you?");
		System.out.println("1: Deposit");
		System.out.println("2: Withdraw");
		System.out.println("3: Check");
		System.out.println("4: Create");
		System.out.println("5: Close");
		System.out.println("6: Transfer");
		System.out.println("7: Steal");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("2: Withdraw");
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		}






	}
}
