package com.antoineromand.api_authentication.domain.service;

import com.antoineromand.api_authentication.domain.contract.UserRepository;
import com.antoineromand.api_authentication.domain.contract.UserService;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean userExists(String email) {
        return this.userRepository.userExists(email);
    }

}
