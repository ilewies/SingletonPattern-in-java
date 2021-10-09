package com.lavesh.lazyInitialization;

public class LazyInitialization {
	public static LazyInitialization linstance;
	
	private LazyInitialization() {
		
	}
	public static LazyInitialization getLazyInitialization() {
		if(linstance == null) {
			linstance = new LazyInitialization();
		}
		return linstance;
	}

}
