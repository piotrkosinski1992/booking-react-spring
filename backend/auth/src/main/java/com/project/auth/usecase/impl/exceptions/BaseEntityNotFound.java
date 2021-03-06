package com.project.auth.usecase.impl.exceptions;

public class BaseEntityNotFound extends RuntimeException {

  public BaseEntityNotFound(String username) {
    super(String.format("BaseEntity for username: %s not found", username));
  }
}
