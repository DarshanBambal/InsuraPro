package com.policy.model;

import lombok.Data;

@Data
public class PolicyDto {
	private String policyName;
	private int policyAmount;
	private int duration;
	private String policyType;
}
