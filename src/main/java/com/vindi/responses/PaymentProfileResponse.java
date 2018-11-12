package com.vindi.responses;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import com.vindi.model.PaymentProfile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentProfileResponse implements Serializable {

	private static final long serialVersionUID = 3177100649907218908L;
	@JsonProperty("payment_profile")
	private PaymentProfile paymentProfile;

}
