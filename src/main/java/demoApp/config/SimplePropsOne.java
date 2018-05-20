package demoApp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//@PropertySource("classpath:simple.properties")
@ConfigurationProperties(prefix="simple")
public class SimplePropsOne {
	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
}
