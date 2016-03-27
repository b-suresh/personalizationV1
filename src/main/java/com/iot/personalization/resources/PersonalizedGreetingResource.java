package com.iot.personalization.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.iot.personalization.CustomerIdentity;
import com.iot.personalization.DummyCustomerService;
import com.iot.personalization.Greeting;
import com.iot.personalization.GreetingRequest;

@Path("/personalization")
public class PersonalizedGreetingResource {
	
	@Path("/greet")
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public Greeting getGreeting(@DefaultValue("Suresh") @QueryParam("rfid") String rfid) {
		CustomerIdentity identity = new CustomerIdentity();
		identity.rfid = rfid;
		String name = new DummyCustomerService().getCustomerNameFromCustomerIdentity(identity);
        return new Greeting("Hello "+name+"!");
    }
	
	@Path("/greetjson")
	@POST
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public Greeting getGreeting(GreetingRequest request) {
		CustomerIdentity identity = new CustomerIdentity();
		identity.rfid = request.getRfid();
		String name = new DummyCustomerService().getCustomerNameFromCustomerIdentity(identity);
        return new Greeting("Hello "+name+"!");
    }
}
