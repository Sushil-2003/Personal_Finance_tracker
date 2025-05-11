package com.sushil.Personal_Finance_Tracker.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}