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
public class PaymentProfile implements Serializable {

	private static final long serialVersionUID = 4037075849029422477L;

	@JsonProperty("gateway_token")
	private String gatewayToken;

	@JsonProperty("customer_id")
	private Integer customerId;

	@JsonProperty("payment_method_code")
	private String paymentMethodCode;

}
