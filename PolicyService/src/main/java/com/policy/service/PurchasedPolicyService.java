package com.policy.service;

import java.time.LocalDate;

import com.policy.dto.PurchasePolicyDto;
import com.policy.exception.UserIdNotFoundException;
import com.policy.model.PurchasedPolicy;

public interface PurchasedPolicyService {
	String getPolicy(PurchasedPolicy purchasePolicy);
	int findPolicyById(int policyId);
	LocalDate settingExpirydate(int policyId);
	PurchasePolicyDto notificationDetails(int policyId) throws UserIdNotFoundException;
}
