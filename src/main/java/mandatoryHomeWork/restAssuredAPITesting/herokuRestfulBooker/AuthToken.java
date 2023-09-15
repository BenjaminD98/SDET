package mandatoryHomeWork.restAssuredAPITesting.herokuRestfulBooker;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthToken {
	
	private String username;
	private String password;

}
