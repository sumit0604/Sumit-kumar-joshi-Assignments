package com.eshoppingzone.product.Exceptions;

public class InvalidInputException extends Throwable {
    public InvalidInputException(String product_id_is_not_valid) {
        super(product_id_is_not_valid);
    }

}
