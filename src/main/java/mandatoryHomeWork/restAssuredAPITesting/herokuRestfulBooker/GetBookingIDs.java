package mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetBookingIDs extends HerokuBaseClass{

	
	@Test(dependsOnMethods="mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker.CreateBooking.createBooking")
	public void getBookingIDs()
	{
		RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		Response respgetBookingIDs= RestAssured.given()
				.contentType(ContentType.JSON)
				.when()
				.accept(ContentType.JSON)
				.log().all()
				.get()
				.then().extract().response();
		System.out.println(respgetBookingIDs.getStatusLine());
		JsonPath jsonPath = respgetBookingIDs.jsonPath();
		System.out.println(super.bookingid);
		List<Integer> bookingIds = jsonPath.getList("bookingid");
		System.out.println(bookingIds);
		Assert.assertTrue(bookingIds.contains(super.bookingid));
		
	}
}
