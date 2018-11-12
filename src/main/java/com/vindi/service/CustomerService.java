package com.vindi.service;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.vindi.VindiConfiguration;
import com.vindi.exception.VindiException;
import com.vindi.model.Customer;
import com.vindi.responses.CustomerResponse;

public class CustomerService {

	private VindiConfiguration vindi;
	private final String CREATE_URL = VindiConfiguration.url("/customers");

	public CustomerService(VindiConfiguration vindiConfiguration) {
		this.vindi = vindiConfiguration;
	}

	public CustomerResponse create(Customer customer) throws VindiException {
		Response response = this.vindi.getNewClient().target(CREATE_URL).request()
				.post(Entity.entity(customer, MediaType.APPLICATION_JSON));

		int ResponseStatus = response.getStatus();
		String ResponseText = null;

		if (ResponseStatus == 201)
			return response.readEntity(CustomerResponse.class);

		if (response.hasEntity())
			ResponseText = response.readEntity(String.class);

		response.close();

		throw new VindiException("Error creating customer!", ResponseStatus, ResponseText);
	}

}