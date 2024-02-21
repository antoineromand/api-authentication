package com.antoineromand.api_authentication.domain.entity;

public class UserInformation {
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String createdAt;
    private String updatedAt;
    private User user;

    public UserInformation() {
    }

    public UserInformation(int id, String firstName, String lastName, String phone, String address, String createdAt,
            String updatedAt, User user) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.user = user;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public User getUser() {
        return user;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserInformation [address=" + address + ", createdAt=" + createdAt + ", firstName=" + firstName + ", id="
                + id + ", lastName=" + lastName + ", phone=" + phone + ", updatedAt=" + updatedAt + "]";
    }
}
