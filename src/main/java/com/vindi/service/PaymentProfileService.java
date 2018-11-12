package com.vindi.service;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

import com.vindi.VindiConfiguration;
import com.vindi.exception.VindiException;
import com.vindi.model.PaymentProfile;

public class PaymentProfileService {

	private VindiConfiguration vindi;
	private final String DEFAULT_PAYMENT_URL = VindiConfiguration.url("/payment_profiles");

	public PaymentProfileService(VindiConfiguration vindiConfiguration) {
		this.vindi = vindiConfiguration;
	}

	public PaymentProfile setPaymentProfile(PaymentProfile paymentProfile) throws VindiException {
		Response response = this.vindi.getNewClient().target(DEFAULT_PAYMENT_URL).request()
				.post(Entity.entity(paymentProfile, APPLICATION_JSON));

		int ResponseStatus = response.getStatus();
		String ResponseText = null;

		if (ResponseStatus == 201)
			return response.readEntity(PaymentProfile.class);

		if (response.hasEntity())
			ResponseText = response.readEntity(String.class);

		response.close();

		throw new VindiException("Error set payment profile!", ResponseStatus, ResponseText);
	}
}
