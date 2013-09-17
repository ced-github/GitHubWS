package github.test;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "GitHubWSSEI", targetNamespace = "http://test.github/")
public interface GitHubWSSEI {

	@WebMethod(operationName = "test", action = "urn:Test")
	public String test(String param);

}
