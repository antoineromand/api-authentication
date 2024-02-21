package com.antoineromand.api_authentication.domain.contract;

public interface UserRepository {
    boolean userExists(String email);

    void saveUser();
}
