package com.example.whatsappmsg;

import org.springframework.context.annotation.Configuration;

import com.twilio.Twilio;

@Configuration
public class twilioconfig {
	private final String twilioAccountSid = "ACad3f0b5bf895e626bdd964b5cc986b69"; 
    private final String twilioAuthToken = "b40560e72a9c40712e385c37177be0f1"; 

    public twilioconfig() {
        Twilio.init(twilioAccountSid, twilioAuthToken);
    }

}
