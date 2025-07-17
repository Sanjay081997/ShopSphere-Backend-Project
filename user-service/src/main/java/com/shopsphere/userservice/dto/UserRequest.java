package com.shopsphere.userservice.dto;

public class UserRequest {
    private String name;
    private String email;
    private String phone;

    // Constructors
    public UserRequest() {}

    public UserRequest(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // Getters & setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}
