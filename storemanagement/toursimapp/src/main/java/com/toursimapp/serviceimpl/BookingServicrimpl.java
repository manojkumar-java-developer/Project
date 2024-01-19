package com.toursimapp.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toursimapp.entities.Booking;
import com.toursimapp.exception.ResourceNotFoundException;
import com.toursimapp.repo.BookingRepo;


@Service
public class BookingServicrimpl {
	@Autowired
	BookingRepo serviceDetailRepo ;
	private Object serId;
	
	public Booking getSerById(int id) {
		Optional<Booking> s=Optional.ofNullable(bookingRepo .findById(id));
		Booking sd;
		if(s.isPresent())
		{
			 sd=s.get();
		}else {
				throw new ResourceNotFoundException();
			}
		return sd;
	  
	}

	public Booking addServiceDetail(Booking booking) {
		return  bookingRepo.save(booking);
	}

	public Booking updateDb(int serId,Booking serviceDetail) {
		
		
		Booking s1 = bookingRepo.findById(id);
		if(s1!=null) {  
			s1.setTimes(booking.getTimes());
			s1.setDiscount(booking.getDiscount());
			s1.setEvents(booking.getEvents());
		return bookingRepo.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
	}
	public void deleteDb(int serId) {		
		Booking s2 = bookingRepo .findById(id);
		
		if(s2!=null) {
			bookingRepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}		 
	}
}



