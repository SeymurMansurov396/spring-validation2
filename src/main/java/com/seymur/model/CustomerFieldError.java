package com.seymur.model;

/**
 * Created by Seymur on 7/22/2018.
 */
public class CustomerFieldError {
    private String field;
    private String message;
    private String rejectedValue;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRejectedValue() {
        return rejectedValue;
    }

    public void setRejectedValue(String rejectedValue) {
        this.rejectedValue = rejectedValue;
    }
}
