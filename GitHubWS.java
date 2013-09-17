package github.test;

import javax.jws.WebService;

@WebService(targetNamespace = "http://test.github/", endpointInterface = "github.test.GitHubWSSEI", portName = "GitHubWSPort", serviceName = "GitHubWSService")
public class GitHubWS implements GitHubWSSEI {
	   public String test(String param){
	         return param;
	   }

}
