package com.vindi.model;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer implements Serializable {

	private static final long serialVersionUID = 7630116326840233673L;

	private Integer id;

	private String email;

	private String name;

	@JsonProperty("phones")
	private List<Phone> phones;

	private Address address;

}
