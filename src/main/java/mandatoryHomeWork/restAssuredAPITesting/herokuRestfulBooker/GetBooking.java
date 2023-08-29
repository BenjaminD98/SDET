package mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetBooking extends HerokuBaseClass{
	
	@Test(dependsOnMethods="mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker.GetBookingIDs.getBookingIDs")
	public void getBooking()
	{
		String id=Integer.toString(bookingid);
		//RestAssured.baseURI="https://restful-booker.herokuapp.com/booking/:id";
		Response respgetBooking= RestAssured.given()
				.contentType(ContentType.JSON)
				.when()
				//.accept(ContentType.JSON)
				.log().all()
				.get("https://restful-booker.herokuapp.com/booking/{id}",id)
				.then().extract().response();
		System.out.println(respgetBooking.getStatusLine());
		respgetBooking.prettyPrint();
		Booking resbooking = respgetBooking.getBody().as(Booking.class);
		Assert.assertTrue(resbooking.getFirstname().equalsIgnoreCase(super.firstname));
		Assert.assertTrue(resbooking.getLastname().equalsIgnoreCase(super.lastname));
		Assert.assertTrue(resbooking.getTotalprice()==super.totalprice);
		Assert.assertTrue(resbooking.isDepositpaid()==super.depositpaid);
		Assert.assertTrue(resbooking.bookingdates.getCheckin().equalsIgnoreCase(super.checkin));
		Assert.assertTrue(resbooking.bookingdates.getCheckout().equalsIgnoreCase(super.checkout));
		Assert.assertTrue(resbooking.getAdditionalneeds().equalsIgnoreCase(super.additionalneeds));

		
	}

}
