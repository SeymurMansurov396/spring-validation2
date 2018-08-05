package com.seymur.model;

import java.util.List;

/**
 * Created by Seymur on 7/22/2018.
 */
public class CustomerValidationError {
    private Long timestamp;
    private String message;
    private int errorCode;
    private List<CustomerFieldError> fieldErrors;


    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public List<CustomerFieldError> getFieldErrors() {
        return fieldErrors;
    }

    public void setFieldErrors(List<CustomerFieldError> fieldErrors) {
        this.fieldErrors = fieldErrors;
    }
}
