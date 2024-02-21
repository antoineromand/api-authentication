package com.antoineromand.api_authentication.application.service.register;

import org.springframework.stereotype.Service;

import com.antoineromand.api_authentication.domain.contract.UserRepository;
import com.antoineromand.api_authentication.domain.contract.UserService;

@Service
public class RegisterService {

    private final UserRepository userRepository;
    private final UserService userService;

    public RegisterService(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    public void registerUser() throws Exception {
        if (this.userService.userExists(null)) {
            throw new Exception("User already exists");
        }
        this.userRepository.saveUser();
    }

}
