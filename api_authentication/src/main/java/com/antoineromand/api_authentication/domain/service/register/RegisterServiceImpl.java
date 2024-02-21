package com.antoineromand.api_authentication.domain.service.register;

import org.springframework.stereotype.Service;

import com.antoineromand.api_authentication.infrastructure.repository.interfaces.UserRepository;

@Service
public class RegisterServiceImpl implements RegisterService {

    private final UserRepository userRepository;

    public RegisterServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void registerUser() throws Exception {
        this.userRepository.saveUser();
    }

}
