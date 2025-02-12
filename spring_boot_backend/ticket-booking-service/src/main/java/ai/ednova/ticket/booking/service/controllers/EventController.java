package ai.ednova.ticket.booking.service.controllers;

import ai.ednova.ticket.booking.service.annotations.apiversionning.EdnovaApiVersion;
import ai.ednova.ticket.booking.service.dtos.requests.EventRequest;
import ai.ednova.ticket.booking.service.dtos.responses.EventResponse;
import ai.ednova.ticket.booking.service.dtos.responses.wrapper.ResponseWrapper;
import ai.ednova.ticket.booking.service.services.EventService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EdnovaApiVersion
@RequestMapping("/events")
public class EventController {
	private final EventService eventService;

	public EventController(EventService eventService) {
		this.eventService = eventService;
	}

	@PostMapping
	public ResponseEntity<ResponseWrapper<EventResponse>> create(EventRequest eventRequest) {
		EventResponse eventResponse = eventService.create(eventRequest);
		return ResponseEntity.status(HttpStatus.CREATED).body(ResponseWrapper.success(eventResponse));
	}

	@GetMapping
	public ResponseEntity<ResponseWrapper<List<EventResponse>>> getAll() {
		return ResponseEntity.ok().build();
	}

	@GetMapping("/{id}")
	public ResponseEntity<ResponseWrapper<EventResponse>> getById(@PathVariable String id) {
		return ResponseEntity.ok().build();
	}

	@PutMapping("/{id}")
	public ResponseEntity<ResponseWrapper<EventResponse>> update(@PathVariable String id,
			@RequestBody EventRequest eventRequest) {
		return ResponseEntity.ok().build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<ResponseWrapper<EventResponse>> delete(@PathVariable String id) {
		return ResponseEntity.ok().build();
	}
}
