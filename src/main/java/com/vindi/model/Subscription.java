package com.vindi.model;

import java.io.Serializable;

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
public class Subscription implements Serializable {

	private static final long serialVersionUID = -8666265876130561691L;

	private Integer id;

	@JsonProperty("plan_id")
	private Integer planId;

	@JsonProperty("customer_id")
	private Integer customerId;

	@JsonProperty("payment_method_code")
	private String paymentMethodCode;

	private Bill bill;

}
