package mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker;

import com.fasterxml.jackson.databind.ObjectMapper;

public class AuthToken {
	
	private String username;
	private String password;
	
	public AuthToken(String username, String password)
	{
		this.username=username;
		this.password=password;
	}
	
	public String getUsername()
	{
		return this.username;
	}
	
	public void setUsername(String username)
	{
		this.username=username;
	}
	
	public String getPassword()
	{
		return this.password;
	}
	
	public void setPassword(String password)
	{
		this.password=password;
	}

}
