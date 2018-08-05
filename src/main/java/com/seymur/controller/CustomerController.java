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


public ResponseEntity<Customer> add(@RequestBody Customer customer){
    return  new ResponseEntity<Customer>(customer,HttpStatus.CREATED);
}


}
