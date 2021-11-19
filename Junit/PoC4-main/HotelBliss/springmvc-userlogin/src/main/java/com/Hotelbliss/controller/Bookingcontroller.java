package com.Hotelbliss.controller;
import javax.servlet.http.HttpServletRequest;



import javax.servlet.http.HttpServletResponse;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Hotelbliss.model.Booking;
import com.Hotelbliss.model.User;
import com.Hotelbliss.service.UserService;
import com.Hotelbliss.service.bookingService;
@Controller
public class Bookingcontroller {
	@Autowired
	public bookingService bookingService;



	@RequestMapping(value = "/bookingProcess", method = RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
	ModelAndView mav = new ModelAndView("roombooking");
	mav.addObject("roombook", new Booking());



	return mav;
	}



	@RequestMapping(value = "/booking", method = RequestMethod.POST)
	public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
	@ModelAttribute("roombook") Booking roombook) {
		bookingService.booking(roombook);
	bookingService.update(roombook);
	return new ModelAndView("roombooking");
	}
	


}
