package mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetBooking1 extends HerokuBaseClass {
	
	@Test(dependsOnMethods="mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker.DeleteBooking.deleteBooking")
	public void getBooking1()
	{
		String id=Integer.toString(bookingid);
		Response respgetBooking= RestAssured.given()
				.contentType(ContentType.JSON)
				.when()
				//.accept(ContentType.JSON)
				.log().all()
				.get("https://restful-booker.herokuapp.com/booking/{id}",id)
				.then().extract().response();
		Assert.assertTrue(respgetBooking.getStatusCode()==404);
		
	}

}
