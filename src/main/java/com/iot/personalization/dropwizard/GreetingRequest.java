package com.iot.personalization.dropwizard;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GreetingRequest {
	private String messageId;
	private String name;
	private String rfid;
	
	public GreetingRequest(){
	}
	
	public GreetingRequest( String messageId, String name, String rfid ){
		this.messageId = messageId;
		this.name = name;
		this.rfid = rfid;
	}
	
	@JsonProperty
	public String getMessageId(){
		return messageId;
	}
	@JsonProperty
	public String getName() {
		return name;
	}
	@JsonProperty
	public String getRfid(){
		return rfid;
	}

}
