package com.manipal.file;
import java.util.Scanner;

public class TestCustomer
 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter customer no : - cust number must start with either 'C' or 'c' ");
		String no = scanner.next();
		System.out.println("Enter customer name  : ");
		String name = scanner.next();		
		System.out.println("Enter customer category : ");
		String category = scanner.next();
		
		Customer customer = new Customer(no, name, category);
		
		System.out.println("Customer Details : ");
		System.out.println(customer.getCustNo());
		System.out.println(customer.getCustName());
		System.out.println(customer.getCategory());
		
		
	}
}

