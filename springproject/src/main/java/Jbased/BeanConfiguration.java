package Jbased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
  
	@Bean
	public Account getAccount() {
		Account acn = new Account();
		acn.setAcno(12345);
		acn.setCustName("sutherland");
		acn.setBalance(8000);
		return acn;
	}
}
