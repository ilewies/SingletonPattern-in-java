package com.lavesh.eagarInitialization;

public class EagarInitialization {
	private static final EagarInitialization einstance = new EagarInitialization();

	private EagarInitialization() {

	}

	public static EagarInitialization getEagarInitialization() {
		return einstance;
	}

}
