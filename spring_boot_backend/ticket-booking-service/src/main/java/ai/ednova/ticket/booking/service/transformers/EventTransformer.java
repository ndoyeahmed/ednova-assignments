package ai.ednova.ticket.booking.service.transformers;

import ai.ednova.ticket.booking.service.dtos.requests.EventRequest;
import ai.ednova.ticket.booking.service.dtos.responses.EventResponse;
import ai.ednova.ticket.booking.service.entities.Event;
import org.springframework.stereotype.Component;

@Component
public class EventTransformer {
	public Event convertRequestToModel(EventRequest eventRequest) {
		return null;
	}

	public EventResponse convertModelToResponse(Event event) {
		return null;
	}

	public void updateModelFromRequest(EventRequest eventRequest, Event event) {
	}
}
