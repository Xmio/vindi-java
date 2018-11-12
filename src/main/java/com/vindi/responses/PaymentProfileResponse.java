package com.vindi.responses;

import com.vindi.model.PaymentProfile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentProfileResponse extends PaymentProfile {

	private static final long serialVersionUID = 3177100649907218908L;
	private Integer id;

}