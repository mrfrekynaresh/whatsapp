package com.example.whatsappmsg.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.whatsappmsg.model.consumer;
import com.example.whatsappmsg.service.whatservice;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controllermsg {
	@Autowired
	whatservice ser;
	
	@RequestMapping("/home") 
	public String page() {
		return "index";
	}
	
	 @PostMapping("/massage")
	    public String sendMessage(@RequestParam String numder, @RequestParam String msg) {
	        ser.sendWhatsAppMessage(numder, msg);
	        return "success";
	    }
	 @GetMapping("/allmsg")
	 public String getMethodName(Model m) {
		m.addAttribute("msgall", ser.allsendmsg());
	return "printmsg";
	 }
	 @PostMapping("/msgsend")
	 public String postMethodName(@RequestParam String bodymsg) {
		 List<consumer> st=new ArrayList<consumer>(ser.allsendmsg());
		 for(consumer s:st) {
			 String a=s.getWhatapp_num();
			 ser.sendWhatsAppMessage(a, bodymsg);
		 }
	 	return "success";
	 }
	 
	 

}
