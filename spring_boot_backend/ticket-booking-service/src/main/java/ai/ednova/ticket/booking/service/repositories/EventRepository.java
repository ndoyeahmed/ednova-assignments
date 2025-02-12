package ai.ednova.ticket.booking.service.repositories;

import ai.ednova.ticket.booking.service.entities.Event;
import ai.ednova.ticket.booking.service.repositories.base.BaseCustomMongoRepository;

public interface EventRepository extends BaseCustomMongoRepository<Event, String> {

}
