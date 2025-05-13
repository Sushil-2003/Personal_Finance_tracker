package com.sushil.Personal_Finance_Tracker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sushil.Personal_Finance_Tracker.entity.Transaction;
import com.sushil.Personal_Finance_Tracker.entity.User;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByUser(User user);
}