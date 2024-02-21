package com.antoineromand.api_authentication.domain.contract;

public interface UserService {
    boolean userExists(String email);
}
