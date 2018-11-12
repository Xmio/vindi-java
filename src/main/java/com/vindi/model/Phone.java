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
public class Phone implements Serializable {

	private static final long serialVersionUID = 6171270942949330398L;

	@JsonProperty("phone_type")
	private String phoneType;

	private String number;

}
