package mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker;

public class BookingID {
	
	int bookingid;
	Booking booking;
	
	public BookingID() {
	}
	
	public BookingID(int bookingid, Booking booking) {

		this.bookingid = bookingid;
		this.booking = booking;
	}
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	
	

}
