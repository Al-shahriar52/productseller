package com.example.productseller.service;

import com.example.productseller.model.User;


import java.util.Optional;
public interface IUserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void makeAdmin(String username);
}
