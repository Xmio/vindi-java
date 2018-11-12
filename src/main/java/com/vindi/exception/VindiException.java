package com.vindi.exception;

public class VindiException extends Exception {

	private static final long serialVersionUID = -595046209522037832L;

	public VindiException(String Message, int ResponseCode, String ResponseText) {
		super(Message + " - StatusCode: [" + ResponseCode + "] / ResponseText: [" + ResponseText + "]");
	}
}
