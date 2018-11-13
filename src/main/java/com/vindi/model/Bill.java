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
public class Bill implements Serializable {

	private static final long serialVersionUID = 6133950427300254390L;

	private Integer id;

	@JsonProperty("customer_id")
	private Integer customerId;

	@JsonProperty("payment_method_code")
	private String paymentMethodCode;

	@JsonProperty("bill_items")
	private List<BillItem> billItems;

}
