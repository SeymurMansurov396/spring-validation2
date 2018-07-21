package com.seymur.model;

/**
 * Created by Seymur on 7/22/2018.
 */
public class CustomerErrorResponse {
    //custom error responses
    private int errorCode;
    private String errorMessage;
    private long timestamp;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
