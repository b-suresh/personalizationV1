/**
 * 
 */
package com.iot.personalization;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bsuresh
 *
 */
public class DummyCustomerService implements CustomerService {
	
	private Map rfidToCustomerNameMap = new HashMap();
	
	public DummyCustomerService(){
		rfidToCustomerNameMap.put("123", "Suresh Balasubramanian");
		rfidToCustomerNameMap.put("0004872566", "Vignesh Suresh");
		rfidToCustomerNameMap.put("0004872567", "Vidya Suresh");
	}
	
	public String getCustomerNameFromCustomerIdentity( CustomerIdentity identity ) {
		String name = (String)rfidToCustomerNameMap.get(identity.rfid);
		return name;
		
	}

}
