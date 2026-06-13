package com.jumpstart.foodorderingsystem.exception;

/**
 * Custom exception thrown when category is not found.
 */
public class CategoryNotFoundException extends RuntimeException {

    public CategoryNotFoundException(String message) {
        super(message);
    }
}