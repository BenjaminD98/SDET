package mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker;

import java.time.LocalDate;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.*;
import java.util.Date;

public class BookingDates {
	
	private LocalDate checkin;
	private LocalDate checkout;
	public BookingDates(LocalDate checkin, LocalDate checkout)
	{
		this.checkin=checkin;
		this.checkout=checkout;
	}
	
	public LocalDate getCheckin()
	{
		return this.checkin;
	}
	
	public LocalDate getCheckout()
	{
		return this.checkout;
	}
	
	public void setCheckin(LocalDate checkin)
	{
		this.checkin=checkin;
	}
	
	public void setCheckout(LocalDate checkout)
	{
		this.checkout=checkout;
	}

}
