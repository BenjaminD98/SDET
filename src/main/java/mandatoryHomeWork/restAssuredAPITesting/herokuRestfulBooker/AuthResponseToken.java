package mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker;

import com.fasterxml.jackson.databind.ObjectMapper;

public class AuthResponseToken {
	
	String token;
	
	public AuthResponseToken(String token)
	{
		this.token=token;
	}
	public AuthResponseToken()
	{
		
	}
	
	public String getToken()
	{
		return this.token;
	}
	
	public void setToken(String token)
	{
		this.token=token;
	}

}
