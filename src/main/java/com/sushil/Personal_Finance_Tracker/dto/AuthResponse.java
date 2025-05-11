package com.sushil.Personal_Finance_Tracker.dto;

import lombok.Data;

@Data
public class AuthResponse {
    private String token;
    private UserDTO user;
}