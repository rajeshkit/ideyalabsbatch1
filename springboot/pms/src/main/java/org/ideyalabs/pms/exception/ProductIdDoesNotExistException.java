package org.ideyalabs.pms.exception;

public class ProductIdDoesNotExistException extends RuntimeException {
    public ProductIdDoesNotExistException(String string) {
        super(string);
    }
}
