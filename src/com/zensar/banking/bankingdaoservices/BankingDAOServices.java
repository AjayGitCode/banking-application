package com.zensar.banking.bankingdaoservices;
import java.util.ArrayList;
import java.util.HashMap;

import com.zensar.banking.beans.Account;
import com.zensar.banking.beans.Customer;
import com.zensar.banking.beans.Transaction;
import com.zensar.banking.exceptions.ServicesNotFoundException;
public interface BankingDAOServices {
	int insertCustomer(Customer customer);
	boolean updateCustomer(Customer customer);
	int insertAccount(int custId,Account account);
	boolean updateAccount(int custId, Account account);
	boolean insertTransaction(int custId,int accNo,Transaction transaction );
	Customer getCustomer(int custId);
	Account getAccount(int custId,int accNo);
	HashMap<Integer, Customer> getCustomers();
	HashMap<Integer, Account> getAccounts(int custId);
	ArrayList<Transaction> getTransactions(int custId,int accNo);
	boolean deleteCustomer(int custId);
	boolean deleteAccount(int custId,int accNo);
	public boolean closeBankingDaoServices() throws ServicesNotFoundException;
	public int generatePin();
}
