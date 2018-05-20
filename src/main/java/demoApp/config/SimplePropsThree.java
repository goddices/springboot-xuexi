package demoApp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value="classpath:simple3.properties")
public class SimplePropsThree {
	@Value("hostRoot")
	private String hostRoot;
	
	@Value("apiUrl1")
	private String apiUrl1;
	
	@Value("apiUrl2")
	private String apiUrl2;
	
	
	public String getHostRoot() {
		return hostRoot;
	}
	public void setHostRoot(String hostRoot) {
		this.hostRoot = hostRoot;
	}
	public String getApiUrl1() {
		return apiUrl1;
	}
	public void setApiUrl1(String apiUrl1) {
		this.apiUrl1 = apiUrl1;
	}
	public String getApiUrl2() {
		return apiUrl2;
	}
	public void setApiUrl2(String apiUrl2) {
		this.apiUrl2 = apiUrl2;
	}
}
