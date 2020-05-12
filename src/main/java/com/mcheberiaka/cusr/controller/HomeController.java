package com.mcheberiaka.cusr.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mcheberiaka.cusr.model.OneWayList;
import com.mcheberiaka.cusr.model.OneWayTrip;
import com.mcheberiaka.cusr.model.SearchContent;
import com.mcheberiaka.cusr.model.Segment;
import com.mcheberiaka.cusr.model.Station;
import com.mcheberiaka.cusr.service.TrainService;




@Controller
public class HomeController {
	
	//show home page for get request on home url.
	@GetMapping("/")
	public String login(Model model) {
		return "userlogin";
	}
	
	@RequestMapping("/registration")
	public String registration(Model model) {
		return "userreg";
	}
	
	/* No need for admin login
	@RequestMapping("/adminlogin")
	public String adminlogin(Model model) {
		return "adminlogin";
	}
	*/

}