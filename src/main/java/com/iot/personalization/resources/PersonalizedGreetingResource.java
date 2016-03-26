package com.iot.personalization.resources;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.iot.personalization.CustomerIdentity;
import com.iot.personalization.CustomerService;
import com.iot.personalization.DummyCustomerService;

@Path("/greet")
public class PersonalizedGreetingResource {
	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getGreeting(@DefaultValue("Suresh") @QueryParam("rfid") String rfid) {
		CustomerIdentity identity = new CustomerIdentity();
		identity.rfid = rfid;
		String name = new DummyCustomerService().getCustomerNameFromCustomerIdentity(identity);
        return "Hello "+name+"!";
    }
}
