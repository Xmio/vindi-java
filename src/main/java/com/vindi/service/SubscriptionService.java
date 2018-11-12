package com.vindi.service;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

import com.vindi.VindiConfiguration;
import com.vindi.exception.VindiException;
import com.vindi.model.Subscription;
import com.vindi.responses.SubscriptionResponse;

public class SubscriptionService {

	private VindiConfiguration vindi;
	private final String DEFAULT_PAYMENT_URL = VindiConfiguration.url("/subscriptions");

	public SubscriptionService(VindiConfiguration vindiConfiguration) {
		this.vindi = vindiConfiguration;
	}

	public SubscriptionResponse subscribe(Subscription subscription) throws VindiException {
		Response response = this.vindi.getNewClient().target(DEFAULT_PAYMENT_URL).request()
				.post(Entity.entity(subscription, APPLICATION_JSON));

		int ResponseStatus = response.getStatus();
		String ResponseText = null;

		if (ResponseStatus == 201)
			return response.readEntity(SubscriptionResponse.class);

		if (response.hasEntity())
			ResponseText = response.readEntity(String.class);

		response.close();

		throw new VindiException("Error set subscription!", ResponseStatus, ResponseText);
	}
}
