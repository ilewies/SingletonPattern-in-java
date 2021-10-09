package com.lavesh.threadSafeInitialization;

public class ThreadSafeInitialization {
	private static ThreadSafeInitialization tinstance;

	private ThreadSafeInitialization() {

	}

	public static synchronized ThreadSafeInitialization getThreadSafeInitialization() {
		if (tinstance == null) {
			tinstance = new ThreadSafeInitialization();
		}
		return tinstance;
	}

	public static ThreadSafeInitialization getThreadSafeInitializationDoubleLock() {
		if (tinstance == null) {
			synchronized (ThreadSafeInitialization.class) {
				if (tinstance == null) {
					tinstance = new ThreadSafeInitialization();
				}

			}
		}
		return tinstance;
	}

}
