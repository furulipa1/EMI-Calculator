package day4;

import java.util.Scanner;

public class EMIcalculator {

	public static void main(String[] args) {
	
		Scanner scanner= new Scanner (System.in);
		
		System.out.println("Enter loan amount in USD");
		double principal = scanner.nextDouble();
		
		System.out.println("enter annualinterest Rate (in %)");
		double annualinterestrate = scanner.nextDouble();
		
		System.out.println("Enter loan tenure");
		int tenureYears=scanner.nextInt();
		
		int  tenureMonths=tenureYears*12;
		
		double monthlyInterestRate= annualinterestrate/(12*100);
		
		double emi = principal*monthlyInterestRate* Math.pow(1+monthlyInterestRate,tenureMonths)
			/ (Math.pow(1+monthlyInterestRate,tenureMonths)-1);
			 
		
		System.out.println("Your monthly EMI is "+emi);
		

	}

}


