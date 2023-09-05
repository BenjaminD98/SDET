package mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.response.Response;

public class HerokuBooker extends HerokuBaseClass{
	
	
	@Test
	public void ping()
	{
		RestAssured.baseURI="https://restful-booker.herokuapp.com/ping";
		Response resp= RestAssured.given().get();
		System.out.println(resp.getStatusLine());
		resp.prettyPrint();
		resp.then().assertThat().statusCode(201);
	}
	
	
	@Test (dependsOnMethods="mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker.HerokuBooker.ping")
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
		Assert.assertNotNull(token,"Null Token Value");
		respCreateToken.then().assertThat().statusCode(200);
		
	}
	
	@Test (dependsOnMethods="mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker.HerokuBooker.createToken")
	public void createBooking()
	{
		RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		//BookingDates bookingdates= new BookingDates(LocalDate.of(2023, 9, 30),LocalDate.of(2023, 10, 02));
		BookingDates bookingdates= new BookingDates("2023-09-30","2023-10-02");
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
		respCreateBooking.then().assertThat().statusCode(200);
		
	}
	
	@Test(dependsOnMethods="mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker.HerokuBooker.createBooking")
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
		System.out.println(super.bookingid);
		List<Integer> bookingIds = respgetBookingIDs.jsonPath().getList("bookingid");
		System.out.println(bookingIds);
		Assert.assertTrue(bookingIds.contains(super.bookingid));
		respgetBookingIDs.then().assertThat().statusCode(200);
		
	}
	
	@Test(dependsOnMethods="mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker.HerokuBooker.getBookingIDs")
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
		Assert.assertTrue(resbooking.getFirstname().equals(super.firstname));
		Assert.assertTrue(resbooking.getLastname().equals(super.lastname));
		Assert.assertTrue(resbooking.getTotalprice()==super.totalprice);
		Assert.assertTrue(resbooking.isDepositpaid()==super.depositpaid);
		Assert.assertTrue(resbooking.bookingdates.getCheckin().equals(super.checkin));
		Assert.assertTrue(resbooking.bookingdates.getCheckout().equals(super.checkout));
		Assert.assertTrue(resbooking.getAdditionalneeds().equals(super.additionalneeds));
		respgetBooking.then().assertThat().statusCode(200);

		
	}
	
	@Test(dependsOnMethods="mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker.HerokuBooker.getBooking")
	public void updateBooking()
	{
		String id=Integer.toString(bookingid);
		//RestAssured.baseURI="https://restful-booker.herokuapp.com/booking/:id";
		int totalprice=25000;
		boolean depositpaid=false;
		BookingDates bookingdates= new BookingDates("2023-09-30","2023-10-02");
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
		Assert.assertTrue(resbooking.getFirstname().equals(super.firstname));
		Assert.assertTrue(resbooking.getLastname().equals(super.lastname));
		Assert.assertTrue(resbooking.getTotalprice()==totalprice);
		Assert.assertTrue(resbooking.isDepositpaid()==depositpaid);
		Assert.assertTrue(resbooking.bookingdates.getCheckin().equals(super.checkin));
		Assert.assertTrue(resbooking.bookingdates.getCheckout().equals(super.checkout));
		Assert.assertTrue(resbooking.getAdditionalneeds().equals(super.additionalneeds));
		respgetBooking.then().assertThat().statusCode(200);
		
	}

	
	@Test(dependsOnMethods="mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker.HerokuBooker.updateBooking")
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
		respdeleteBooking.then().assertThat().statusCode(201);

		Response respdeleteBooking2= RestAssured.given()
				.contentType(ContentType.JSON)
				.log().all()
				.get("https://restful-booker.herokuapp.com/booking/{id}",id);
		respdeleteBooking2.then().assertThat().statusCode(404);
	}

}
