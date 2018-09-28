package com.capgemini.bankappcheck.service;

import com.capgemini.bankappcheck.entities.Customer;

public interface CustomerService
{
	public Customer authenticate(Customer customer);
	public Customer updateProfile(Customer customer);
	public boolean updatePassword(Customer customer, String oldPassword, String newPassword);

}
