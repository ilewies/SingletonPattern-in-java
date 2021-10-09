package com.lavesh.staticBlockInitialization;

public class StaticBlockInitialization {
	private static StaticBlockInitialization sinstance;
	
	private StaticBlockInitialization() {
		
	}
	static {
		try {
			sinstance = new StaticBlockInitialization();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static StaticBlockInitialization getStaticBlockInitialization() {
		return sinstance;
	}

}
