package com.lavesh.billPughInitialization;

public class BillPughInitialization {

	private BillPughInitialization() {

	}

	public static class HelperInit {

		private static final BillPughInitialization INSTANCE = new BillPughInitialization();

	}

	public static BillPughInitialization getBillPughInitialization() {
		return HelperInit.INSTANCE;
	}
}
