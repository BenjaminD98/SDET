package mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker;

import com.fasterxml.jackson.databind.ObjectMapper;

public class BookingDates1 {

	private String checkin;
	private String checkout;
	
	public BookingDates1()
	{
		
	}
	
	public BookingDates1(String checkin, String checkout)
	{
		this.checkin=checkin;
		this.checkout=checkout;
	}
	
	public String getCheckin()
	{
		return this.checkin;
	}
	
	public String getCheckout()
	{
		return this.checkout;
	}
	
	public void setCheckin(String checkin)
	{
		this.checkin=checkin;
	}
	
	public void setCheckout(String checkout)
	{
		this.checkout=checkout;
	}

}
