package com.vindi.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address implements Serializable {
	private static final long serialVersionUID = 4749413127967164387L;

	private String street;

	private String number;

	@JsonProperty("additional_details")
	private String additionalDetails;

	@JsonProperty("zipcode")
	private String zipCode;

	private String neighborhood;

	private String city;

	private String state;

	private String country;

}
