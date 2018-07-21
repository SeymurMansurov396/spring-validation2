package com.seymur.exception;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.seymur.model.CustomerErrorResponse;
import com.seymur.model.CustomerFieldError;
import com.seymur.model.CustomerValidationError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.MissingFormatArgumentException;

/**
 * Created by Seymur on 7/21/2018.
 */

@ControllerAdvice
public class CustomerExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public ResponseEntity<CustomerValidationError> validateCustomer(MethodArgumentNotValidException ex) {


        BindingResult bindingResult = ex.getBindingResult();
        CustomerValidationError customerValidationError = new CustomerValidationError();
        customerValidationError.setMessage("Validation Failed");
        customerValidationError.setErrorCode(HttpStatus.BAD_REQUEST.value());
        Date date = new Date();
        customerValidationError.setTimestamp(date.getTime());
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        List<CustomerFieldError> customerFieldErrors = new ArrayList<>();
        for (FieldError fieldError : fieldErrors) {

            CustomerFieldError customerFieldError = new CustomerFieldError();
            customerFieldError.setField(fieldError.getField());
            customerFieldError.setMessage(fieldError.getDefaultMessage());
            customerFieldError.setRejectedValue((fieldError.getRejectedValue().toString()));
            customerFieldErrors.add(customerFieldError);
            customerValidationError.setFieldErrors(customerFieldErrors);

        }

        return new ResponseEntity<CustomerValidationError>(customerValidationError, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<CustomerErrorResponse> handleMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException ex) {

        CustomerErrorResponse errorResponse = new CustomerErrorResponse();
        //custom error responses can be used as well,this is for demonstrative purposes
        errorResponse.setErrorCode(701);
        errorResponse.setTimestamp(new Date().getTime());
        errorResponse.setErrorMessage(ex.getMessage());

        return new ResponseEntity<CustomerErrorResponse>(errorResponse, HttpStatus.valueOf(701));
    }
    @ExceptionHandler(InvalidFormatException.class)
    public ResponseEntity<CustomerErrorResponse> handleInvalidFormatException(InvalidFormatException m){
        CustomerErrorResponse errorResponse=new CustomerErrorResponse();
        //custom codes for errors
        errorResponse.setErrorCode(702);
        errorResponse.setTimestamp(new Date().getTime());
        errorResponse.setErrorMessage(m.getLocalizedMessage());
        return new ResponseEntity<CustomerErrorResponse>(errorResponse,HttpStatus.BAD_REQUEST);
    }
}
