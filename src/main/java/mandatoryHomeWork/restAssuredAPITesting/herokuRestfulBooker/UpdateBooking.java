package mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.response.Response;

public class UpdateBooking extends HerokuBaseClass{

	@Test(dependsOnMethods="mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker.GetBooking.getBooking")
	public void updateBooking()
	{
		String id=Integer.toString(bookingid);
		//RestAssured.baseURI="https://restful-booker.herokuapp.com/booking/:id";
		int totalprice=25000;
		boolean depositpaid=false;
		BookingDates1 bookingdates= new BookingDates1("2023-09-30","2023-10-02");
		Booking booking= new Booking("Benjamin","D",totalprice,depositpaid,bookingdates,"AC Necessary");
	    /*Cookie myCookie = new Cookie.Builder("session_id", "1234")
	    	      .setSecured(true)
	    	      .setComment("session id cookie")
	    	      .build();*/
		Response respgetBooking= RestAssured.given()
				.contentType(ContentType.JSON)
				.when().cookie(new Cookie.Builder("token", token).build())
				.body(booking)
				//.accept(ContentType.JSON)
				.log().all()
				.put("https://restful-booker.herokuapp.com/booking/{id}",id)
				.then().extract().response();
		System.out.println(respgetBooking.getStatusLine());
		respgetBooking.prettyPrint();
		Booking resbooking = respgetBooking.getBody().as(Booking.class);
		Assert.assertTrue(resbooking.getFirstname().equalsIgnoreCase(super.firstname));
		Assert.assertTrue(resbooking.getLastname().equalsIgnoreCase(super.lastname));
		Assert.assertTrue(resbooking.getTotalprice()==totalprice);
		Assert.assertTrue(resbooking.isDepositpaid()==depositpaid);
		Assert.assertTrue(resbooking.bookingdates.getCheckin().equalsIgnoreCase(super.checkin));
		Assert.assertTrue(resbooking.bookingdates.getCheckout().equalsIgnoreCase(super.checkout));
		Assert.assertTrue(resbooking.getAdditionalneeds().equalsIgnoreCase(super.additionalneeds));

		
	}

}
