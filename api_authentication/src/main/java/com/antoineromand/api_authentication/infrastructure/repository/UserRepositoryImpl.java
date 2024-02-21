package com.antoineromand.api_authentication.infrastructure.repository;

import com.antoineromand.api_authentication.domain.contract.UserRepository;

public class UserRepositoryImpl implements UserRepository {

    @Override
    public void saveUser() {
        System.out.println("User saved");
    }

    @Override
    public boolean userExists(String email) {
        System.out.println(email);
        return true;
    }

}
