package com.lavesh.serializedInitialization;

import java.io.Serializable;

public class  SerializedInitialization implements Serializable{
	private static final long serialVersionUID = -7604766932017737115L;
	
	private SerializedInitialization(){}
	
	private static class HelperInit{
	
		private static final SerializedInitialization sinstance = new SerializedInitialization();
	}
	public static SerializedInitialization getSerializedInitialization() {
		return HelperInit.sinstance;
	}

}
