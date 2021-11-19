package com.Hotelbliss.dao;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.Hotelbliss.model.Booking;

public class BookingDaoImpl implements BookingDao {
	@Autowired
	DataSource datasource;



	@Autowired
	JdbcTemplate jdbcTemplate;
	public int booking(Booking roombook) {
	String sql = "insert into bookings values(?,?,?,?,?)";

	return jdbcTemplate.update(sql, new Object[] { roombook.getUsername(), roombook.getRoomnumber(), roombook.getNoofmemberstostay(),
	roombook.getStayfrom(), roombook.getStayto() });
	}
	public void update(Booking roombook) {

	String a="Booked";
	String SQL = "update hotelrooms set Roomstatus = ? where Roomnumber = ?";
	jdbcTemplate.update(SQL, a, roombook.getRoomnumber());
	System.out.println("Updated Record for roomnumber = " + roombook.getRoomnumber() );



	}
	}




