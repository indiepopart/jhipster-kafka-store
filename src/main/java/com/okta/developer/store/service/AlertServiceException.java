package com.okta.developer.store.service;

public class AlertServiceException extends RuntimeException {

    public AlertServiceException(Throwable e) {
        super(e);
    }

    public AlertServiceException(String message) {
        super(message);
    }
}
