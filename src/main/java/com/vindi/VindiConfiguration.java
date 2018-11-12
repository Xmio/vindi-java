package com.vindi;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class VindiConfiguration {

	private final static String URL = "https://app.vindi.com.br/api/v1";
	private final String tokenId;

	public VindiConfiguration(String token) {
		tokenId = token;
	}

	public Client getNewClient() {
		return ClientBuilder.newClient().register(new Authenticator(tokenId, ""));
	}

	public Client getNewClientNotAuth() {
		return ClientBuilder.newClient();
	}

	public static String url(String endpoint) {
		return URL + endpoint;
	}

}