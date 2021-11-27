package com.example.productseller.service;

import com.example.productseller.model.User;

public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
