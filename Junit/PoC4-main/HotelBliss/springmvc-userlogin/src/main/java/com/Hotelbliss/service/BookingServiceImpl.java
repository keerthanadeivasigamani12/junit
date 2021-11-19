package com.Hotelbliss.service;
import org.springframework.beans.factory.annotation.Autowired;



import com.Hotelbliss.model.Booking;



import com.Hotelbliss.dao.BookingDao;


public class BookingServiceImpl implements bookingService {
	@Autowired
	public BookingDao BookingDao;



	public int booking(Booking roombook) {
	return BookingDao.booking(roombook);
	}
	public void update(Booking roombook) {
	BookingDao.update(roombook);
	}
	}

