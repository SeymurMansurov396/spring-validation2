package com.seymur.service;

import com.seymur.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Seymur on 8/5/2018.
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
}
