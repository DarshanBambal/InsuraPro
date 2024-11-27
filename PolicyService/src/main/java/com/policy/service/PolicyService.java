package com.policy.service;

import java.util.List;

import com.policy.dto.policyDto;
import com.policy.exception.PolicyNotAddedException;
import com.policy.exception.PolicyNotFoundException;
import com.policy.model.Policy;

public interface PolicyService {
	String addPolicy(Policy policy) throws PolicyNotAddedException;
	List<Policy> showAllPolicy();
	String updatePolicy(Policy policy);
	String deletePolicy(int policyId);
	int findAmount(int policyId);
	Policy findPolicyById(int policyId) throws PolicyNotFoundException;
	policyDto getDetails(int policyID);
	
}
