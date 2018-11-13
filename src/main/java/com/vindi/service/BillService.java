package com.vindi.service;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

import com.vindi.VindiConfiguration;
import com.vindi.exception.VindiException;
import com.vindi.model.Bill;
import com.vindi.responses.BillResponse;

public class BillService {

	private VindiConfiguration vindi;
	private final String DEFAULT_BILL_URL = VindiConfiguration.url("/bills");

	public BillService(VindiConfiguration vindiConfiguration) {
		this.vindi = vindiConfiguration;
	}

	public BillResponse subscribe(Bill bill) throws VindiException {
		Response response = this.vindi.getNewClient().target(DEFAULT_BILL_URL).request()
				.post(Entity.entity(bill, APPLICATION_JSON));

		int ResponseStatus = response.getStatus();
		String ResponseText = null;

		if (ResponseStatus == 201)
			return response.readEntity(BillResponse.class);

		if (response.hasEntity())
			ResponseText = response.readEntity(String.class);

		response.close();

		throw new VindiException("Error setting bill!", ResponseStatus, ResponseText);
	}
}
