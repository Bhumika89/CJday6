package com.manipal.file;
public class Customer {
	private String custNo;
	private String custName;
	private String category;
	
	public Customer(String custNo, String custName, String category) {		
		
		
		this.category = category;
		//custNo starts with 'C' or 'c'
		
				
		if(custNo.charAt(0) == 'C' || custNo.charAt(0) == 'c' ) {
			this.custNo = custNo;	
		}	else {
			try {
				throw new InvalidInputException("Invalid Input - Customer No starts with either 'C' or 'c' ");
			}catch(InvalidInputException iie) {
			System.out.println(iie.getMessage());
			}
		}
		
		
		if(custName.length() >=4) {
			this.custName = custName;
		}else {
			try {
				throw new InvalidInputException("Invalid Input : Name must have atleast 4 characters");
			}catch(InvalidInputException iie) {
				System.out.println(iie.getMessage());
			}
		}
		
		if(category.equalsIgnoreCase("platinum")|| category.equalsIgnoreCase("Gold") || category.equalsIgnoreCase("Silver") )
			this.category = category;
		else {
			try {
				throw new InvalidInputException("Invalid Input : Category must be any one - Platinum , Gold, Silver");
			}catch(InvalidInputException iie) {
			System.out.println(iie.getMessage());
			}
		}
		
	}

	public String getCustNo() {
		return custNo;
	}

	public String getCustName() {
		return custName;
	}

	public String getCategory() {
		return category;
	}
	
	
	
	
	
	
	
}
