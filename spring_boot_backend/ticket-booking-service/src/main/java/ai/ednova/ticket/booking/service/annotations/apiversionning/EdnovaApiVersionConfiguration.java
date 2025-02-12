package ai.ednova.ticket.booking.service.annotations.apiversionning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EdnovaApiVersionConfiguration {
	@Bean
	public EdnovaApiVersionWebMvcRegistration apiVersionWebMvcRegistrations() {
		return new EdnovaApiVersionWebMvcRegistration();
	}
}
