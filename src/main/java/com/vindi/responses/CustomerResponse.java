package com.vindi.responses;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.vindi.model.Customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerResponse extends Customer {

	private static final long serialVersionUID = 3177100649907218908L;
	private Integer id;

}
