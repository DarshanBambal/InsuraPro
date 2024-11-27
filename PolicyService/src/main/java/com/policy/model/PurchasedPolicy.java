package com.policy.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class PurchasedPolicy {
	@Id
	private int userId;
	private int policyId;
	private LocalDate expiryDate;
}
