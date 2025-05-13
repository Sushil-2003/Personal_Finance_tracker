package com.sushil.Personal_Finance_Tracker.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TransactionDTO {
    private Long id;
    private String type;
    private String category;
    private LocalDate date;
    private double amount;
	
}