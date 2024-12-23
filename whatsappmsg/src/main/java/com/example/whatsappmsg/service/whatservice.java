package com.example.whatsappmsg.service;
import com.twilio.type.PhoneNumber;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.twilio.rest.api.v2010.account.Message;
import com.example.whatsappmsg.doa.doarep;
import com.example.whatsappmsg.model.consumer;
import com.twilio.Twilio;

@Service
public class whatservice {
	 @Value("${twilio.account.sid}")
	    private String accountSid;

	    @Value("${twilio.auth.token}")
	    private String authToken;

	    @Value("${twilio.whatsapp.number}")
	    private String twilioWhatsAppNumber;
	    
	    @Autowired
	    doarep rep;

	    public String sendWhatsAppMessage(String num, String messagetext) {
	    	 try {
	             Message msg = Message.creator(
	                     new PhoneNumber("whatsapp:" + num),
	                     new PhoneNumber(twilioWhatsAppNumber), 
	                     messagetext                         
	             ).create();
	             return  msg.getSid();
	         } catch (Exception e) {
	             e.printStackTrace();
	             return e.getMessage();
	         }
	     }
	    public List<consumer> allsendmsg(){
	    	
	        return rep.findAll();
	    }
	    }

