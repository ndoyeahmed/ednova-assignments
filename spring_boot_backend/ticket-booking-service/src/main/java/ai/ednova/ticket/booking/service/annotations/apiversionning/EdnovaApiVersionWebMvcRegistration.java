package ai.ednova.ticket.booking.service.annotations.apiversionning;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

public class EdnovaApiVersionWebMvcRegistration implements WebMvcRegistrations {
	@Override
	public RequestMappingHandlerMapping getRequestMappingHandlerMapping() {
		return new VersionedRequestMappingHandlerMapping();
	}
}
