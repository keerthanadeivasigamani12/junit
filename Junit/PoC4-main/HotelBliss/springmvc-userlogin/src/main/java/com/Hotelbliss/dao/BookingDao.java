package com.Hotelbliss.dao;

import com.Hotelbliss.model.Booking;

public interface BookingDao {
	int booking(Booking roombook);
	void update(Booking roombook);
}
