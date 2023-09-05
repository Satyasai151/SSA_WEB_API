package com.info.service;

import org.springframework.stereotype.Service;

@Service
public class SsaService {
	public String fetchstateName(String ssn) {
		String stateName = null;
		if (ssn.startsWith("4")) {
			stateName = "new jersey";
		} else if (ssn.startsWith("5")) {
			stateName = "Rhode Island";
		} else if (ssn.startsWith("6")) {
			stateName = "Kentuky";
		} else if (ssn.startsWith("7")) {
			stateName = "ohio";
		} else {
			stateName = "Invalid SSN";
		}

		return stateName;

	}

}
