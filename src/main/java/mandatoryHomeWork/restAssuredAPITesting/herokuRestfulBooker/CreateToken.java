package mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class CreateToken extends HerokuBaseClass {
	
	@Test (dependsOnMethods="mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker.HealthCheck.ping")
	public void createToken()
	{
		RestAssured.baseURI="https://restful-booker.herokuapp.com/auth";
		AuthToken auth=new AuthToken("admin","password123");
		Response respCreateToken= RestAssured.given()
				.contentType(ContentType.JSON)
				.body(auth)
				.log().all()
				.post()
				.then().extract().response();
		System.out.println(respCreateToken.getStatusLine());
		respCreateToken.prettyPrint();
		AuthResponseToken tokenResponse= respCreateToken.getBody().as(AuthResponseToken.class);
		super.token=tokenResponse.getToken();
		
	}

}
