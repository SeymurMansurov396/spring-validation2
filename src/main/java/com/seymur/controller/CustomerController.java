package com.seymur.controller;

import com.seymur.model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Seymur on 7/21/2018.
 */

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping("/test")
    public String test(){
        return "hello";
    }

    @PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> add(@RequestBody Customer customer){
        return new ResponseEntity<Customer>(HttpStatus.OK);
    }


}
