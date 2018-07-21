package com.seymur.controller;

import com.seymur.model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;

/**
 * Created by Seymur on 7/21/2018.
 */

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping("/test")
    public ResponseEntity<Customer> test(){
        Customer customer=new Customer();
        customer.setAge(1);
        customer.setBirthday(new Date());
        customer.setEmail("seymurmansurov168@gmail.com");
        customer.setGender("kisi");
        customer.setPhone("0517656347");
        customer.setName("seymur");

        return new ResponseEntity<Customer>(customer,HttpStatus.OK);
    }



    @PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> add(@Valid @RequestBody Customer customer){


            return new ResponseEntity<Customer>(customer,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable long id){
        Customer customer=new Customer();
        customer.setAge(1);
        customer.setBirthday(new Date());
        customer.setEmail("seymurmansurov168@gmail.com");
        customer.setGender("kisi");
        customer.setPhone("0517656347");
        customer.setName("seymur");
        return new ResponseEntity<Customer>(customer,HttpStatus.OK);
    }


}
