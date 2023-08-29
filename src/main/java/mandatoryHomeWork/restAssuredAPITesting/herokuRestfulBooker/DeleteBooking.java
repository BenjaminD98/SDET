package mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.response.Response;

public class DeleteBooking extends HerokuBaseClass{
	
	@Test(dependsOnMethods="mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker.UpdateBooking.updateBooking")
	public void deleteBooking()
	{
		String id=Integer.toString(bookingid);
		Response respdeleteBooking= RestAssured.given()
				.contentType(ContentType.JSON)
				.when().cookie(new Cookie.Builder("token", token).build())
				.log().all()
				.delete("https://restful-booker.herokuapp.com/booking/{id}",id)
				.then().extract().response();
		System.out.println(respdeleteBooking.getStatusLine());
		

		
	}

}
