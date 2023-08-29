package mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class HealthCheck {
	
	@Test
	public void ping()
	{
		RestAssured.baseURI="https://restful-booker.herokuapp.com/ping";
		Response resp= RestAssured.given().get();
		System.out.println(resp.getStatusLine());
		resp.prettyPrint();
	}

}
