package com.sushma.java.forex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushma.java.forex.common.entity.Customer;
import com.sushma.java.forex.dao.CustomerDAO;

@Service
public class CustomerService extends BaseService<Customer, Customer>{

	@Autowired
	CustomerDAO customerDao;
	
	@Override
	public Customer create(Customer customer) {
		customer = customerDao.save(customer);
		return customer;
	}

	@Override
	public Customer update(Customer customer) {
		customer = customerDao.save(customer);
		return customer;
	}

	@Override
	public Customer read(Long id) {
		Customer customer = customerDao.findById(id).orElse(null);
		return customer;
	}

	@Override
	public void delete(Long id) {
		customerDao.deleteById(id);
	}

	@Override
	public void generateMultiple(Integer noOfEntities) {
		
	}

}
