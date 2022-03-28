/*
 * author: Rajendra Prasad G
 * https://github.com/rajenrishi
 * 
 */

package assignments;

//Assignment: 23
//Write a program to create a Bank class. Write an instance method to calculate 
//interest at the rate of 10% for the amount passed during object initialization.
//Write two more classes Branch1 & Branch2. Branch1 & Branch2 will inherit from Bank class.
//Override the interest calculation method, in Branch1 calculate interest rate at 11% 
//and in Branch2 calculate the interest rate at 9%.
//Amount on which interest to be calculated will be passed during object creation.
//Along with the respective branch interest amount display, also print the interest calculation by Bank.
//Hint: Call Bank calculation method from Branch classes.

class Bank {
	
	double dAmount;
	final float fIntRate = 10.0f;
	
	Bank(double amt) {
		
		this.dAmount = amt;
	}

	public void calInterest() {
		
		double dIntAmt = 0.0;

		dIntAmt = (dAmount * fIntRate) / 100;
		
		System.out.println("Interest amount to be paid at Bank is: " + dIntAmt);
	}
}

class Branch1 extends Bank {
	
	double dAmount;
	final float fIntRate = 11.0f;
	
	Branch1(double amt) {
		
		super(amt);
		this.dAmount = amt;
	}

	public void calInterest() {
		
		double dIntAmt = 0.0;

		dIntAmt = (dAmount * fIntRate) / 100;
		
		System.out.println("Interest amount to be paid at Branch1 is: " + dIntAmt);
		super.calInterest();
	}
}

class Branch2 extends Bank {
	
	double dAmount;
	final float fIntRate = 9.0f;
	
	Branch2(double amt) {
		
		super(amt);
		this.dAmount = amt;
	}

	public void calInterest() {
		
		double dIntAmt = 0.0;

		dIntAmt = (dAmount * fIntRate) / 100;
		
		System.out.println("Interest amount to be paid at Branch2 is: " + dIntAmt);
		super.calInterest();
	}
}

public class Assign23BankBranchInheritance {

	public static void main(String[] args) {

		Branch1 br1 = new Branch1(10000);
		br1.calInterest();
		Branch2 br2 = new Branch2(10000);
		br2.calInterest();
	}
}
