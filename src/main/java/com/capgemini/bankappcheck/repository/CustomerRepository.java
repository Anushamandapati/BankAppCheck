package com.capgemini.bankappcheck.repository;

import com.capgemini.bankappcheck.entities.Customer;

public interface CustomerRepository 
{
	public Customer authenticate(Customer customer);
	public Customer updateProfile(Customer customer);
	public boolean updatePassword(Customer customer, String oldPassword, String newPassword);
}
