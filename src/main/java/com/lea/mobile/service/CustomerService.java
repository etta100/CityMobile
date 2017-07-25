package com.lea.mobile.service;

import com.lea.mobile.dao.api.CustomerDao;
import com.lea.mobile.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerDao customerDao;

    public void create(Customer customer) {
        customerDao.create(customer);
    }
}