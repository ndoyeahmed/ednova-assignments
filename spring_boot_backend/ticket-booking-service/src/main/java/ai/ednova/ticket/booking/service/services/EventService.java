package ai.ednova.ticket.booking.service.services;

import ai.ednova.ticket.booking.service.dtos.requests.EventRequest;
import ai.ednova.ticket.booking.service.dtos.responses.EventResponse;

import java.util.List;
import java.util.UUID;

public interface EventService {
	EventResponse create(EventRequest eventRequest);

	EventResponse get(String eventId);

	EventResponse update(String eventId, EventRequest eventRequest);

	void delete(String eventId);
}
