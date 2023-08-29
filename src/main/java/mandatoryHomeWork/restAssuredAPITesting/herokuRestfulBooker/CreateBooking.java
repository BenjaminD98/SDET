package mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import io.restassured.response.Response;
//import java.time.LocalDate;
//import com.fasterxml.jackson.datatype.jsr310.*;
//import java.util.Date;

public class CreateBooking extends HerokuBaseClass {
	
	@Test (dependsOnMethods="mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker.CreateToken.createToken")
	public void createBooking()
	{
		RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		//BookingDates bookingdates= new BookingDates(LocalDate.of(2023, 9, 30),LocalDate.of(2023, 10, 02));
		BookingDates1 bookingdates= new BookingDates1("2023-09-30","2023-10-02");
		Booking booking= new Booking("Benjamin","D",2500,true,bookingdates,"AC Necessary");
		Response respCreateBooking= RestAssured.given()
				.contentType(ContentType.JSON)
				.when()
				//.accept(ContentType.JSON)
				.body(booking)
				.log().all()
				.post()
				.then().extract().response();
		System.out.println(respCreateBooking.getStatusLine());
		respCreateBooking.prettyPrint();
		BookingID resbooking = respCreateBooking.getBody().as(BookingID.class);
		super.bookingid=resbooking.getBookingid();
		super.firstname=resbooking.booking.getFirstname();
		super.lastname=resbooking.booking.getLastname();
		super.totalprice=resbooking.booking.getTotalprice();
		super.depositpaid=resbooking.booking.isDepositpaid();
		super.checkin=resbooking.booking.bookingdates.getCheckin();
		super.checkout=resbooking.booking.bookingdates.getCheckout();
		super.additionalneeds=resbooking.booking.getAdditionalneeds();
		
	}

}
