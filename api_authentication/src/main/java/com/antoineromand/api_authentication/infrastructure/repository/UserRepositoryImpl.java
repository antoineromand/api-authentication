package com.antoineromand.api_authentication.infrastructure.repository;

import com.antoineromand.api_authentication.infrastructure.repository.interfaces.UserRepository;

public class UserRepositoryImpl implements UserRepository {

    @Override
    public void saveUser() {
        System.out.println("User saved");
    }

}
