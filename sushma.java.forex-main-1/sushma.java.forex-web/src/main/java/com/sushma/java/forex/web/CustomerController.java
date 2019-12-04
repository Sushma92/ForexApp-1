package com.sushma.java.forex.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sushma.java.forex.common.entity.Customer;
import com.sushma.java.forex.service.BaseService;
import com.sushma.java.forex.service.CustomerService;

@RestController
//@GetMapping(path = "api/services/forex-app/customer", produces = "application/json")
public class CustomerController extends BaseController<Customer, Customer>{
	
	@Autowired
	CustomerService customerService;

	@Override
	public BaseService<Customer, Customer> getBaseService() {
		return customerService;
	}

}
