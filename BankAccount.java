package com.java.manoj;
		class BankAccount implements BankOperations {
		    private String accountHolderName;
		    private String bankName;
		    private double accountBalance;

		    public BankAccount(String accountHolderName, String bankName, double initialBalance) {
		        this.accountHolderName = accountHolderName;
		        this.bankName = bankName;
		        this.accountBalance = initialBalance;
		    }
		    public double getBalance() {
		        return accountBalance;
		    }
		    public void deposit(double amount) {
		        if (amount > 0) {
		            accountBalance += amount;
		            System.out.println("Deposited $" + amount + " into " + bankName + " account of " + accountHolderName);
		        } else {
		            System.out.println("Invalid deposit amount");
		        }
		    }
		    public void withdraw(double amount) {
		        if (amount > 0 && amount <= accountBalance) {
		            accountBalance -= amount;
		            System.out.println("Withdrawn $" + amount + " from " + bankName + " account of " + accountHolderName);
		        } else {
		            System.out.println("Invalid withdrawal amount or insufficient funds");
		        }
		    }

		    public static void main(String[] args) {
		        BankAccount account1 = new BankAccount("ManojKumar", "ICICI", 1000.0);
		        BankAccount account2 = new BankAccount("Keerthana", "HDFC", 1000.0);
		        BankAccount account3 = new BankAccount("Harish", "SBI", 1500.0);
		        account1.deposit(500.0);
		        account1.withdraw(200.0);

		        account2.deposit(1000.0);
		        account2.withdraw(500.0);

		        account3.deposit(300.0);
		        account3.withdraw(2000.0);
		        System.out.println("\nAccount Balances:");
		        System.out.println(account1.accountHolderName + "'s " + account1.bankName + " account balance: Rs" + account1.getBalance());
		        System.out.println(account2.accountHolderName + "'s " + account2.bankName + " account balance: Rs" + account2.getBalance());
		        System.out.println(account3.accountHolderName + "'s " + account3.bankName + " account balance: RS" + account3.getBalance());
		    }
		    
		    
		


	}


