package com.lavesh.test;

import com.lavesh.billPughInitialization.BillPughInitialization;
import com.lavesh.eagarInitialization.EagarInitialization;
import com.lavesh.lazyInitialization.LazyInitialization;
import com.lavesh.serializedInitialization.SerializedInitialization;
import com.lavesh.staticBlockInitialization.StaticBlockInitialization;
import com.lavesh.threadSafeInitialization.ThreadSafeInitialization;

public class Test {

	public static void main(String[] args) {
		
		//EagarInitialization Test
		EagarInitialization eagarInitialization = EagarInitialization.getEagarInitialization();
		System.out.println(eagarInitialization);
		
		EagarInitialization eagarInitialization2 = EagarInitialization.getEagarInitialization();
		System.out.println(eagarInitialization2);
		System.out.println();
		
		//StaticBlockInitialization test
		
		StaticBlockInitialization staticBlockInitialization = StaticBlockInitialization.getStaticBlockInitialization();
		System.out.println(staticBlockInitialization);
		
		StaticBlockInitialization staticBlockInitialization2 = StaticBlockInitialization.getStaticBlockInitialization();
		System.out.println(staticBlockInitialization2);
		System.out.println();
		
		//LazyInitialization test
		
		LazyInitialization lazyInitialization = LazyInitialization.getLazyInitialization();
		System.out.println(lazyInitialization);
		
		LazyInitialization lazyInitialization2 = LazyInitialization.getLazyInitialization();
		System.out.println(lazyInitialization2);
		System.out.println();
		
		//ThreadSafeInitialization test
		
		ThreadSafeInitialization threadSafeInitialization = ThreadSafeInitialization.getThreadSafeInitialization();
		System.out.println(threadSafeInitialization);
		
		ThreadSafeInitialization threadSafeInitialization2 = ThreadSafeInitialization.getThreadSafeInitialization();
		System.out.println(threadSafeInitialization2);
		
		ThreadSafeInitialization threadSafeInitialization3 = ThreadSafeInitialization.getThreadSafeInitializationDoubleLock();
		System.out.println(threadSafeInitialization3);
		
		ThreadSafeInitialization threadSafeInitialization4 = ThreadSafeInitialization.getThreadSafeInitializationDoubleLock();
		System.out.println(threadSafeInitialization4);

		
		System.out.println();
		//BillPughInitialization test
		
		BillPughInitialization billPughInitialization = BillPughInitialization.getBillPughInitialization();
		System.out.println(billPughInitialization);
		
		BillPughInitialization billPughInitialization2 = BillPughInitialization.getBillPughInitialization();
		System.out.println(billPughInitialization2);
		System.out.println();
		
		//		SerializedInitialization test
		SerializedInitialization serializedInitialization = SerializedInitialization.getSerializedInitialization();
		System.out.println(serializedInitialization);
		
		SerializedInitialization serializedInitialization2 = SerializedInitialization.getSerializedInitialization();
		System.out.println(serializedInitialization2);
		

	}

}
