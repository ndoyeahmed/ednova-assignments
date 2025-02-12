package ai.ednova.ticket.booking.service.repositories.impl;

import ai.ednova.ticket.booking.service.entities.Event;
import ai.ednova.ticket.booking.service.repositories.EventRepository;
import ai.ednova.ticket.booking.service.repositories.base.impl.AbstractBaseCustomMongoRepository;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EventRepositoryImpl extends AbstractBaseCustomMongoRepository<Event, String> implements EventRepository {

	protected EventRepositoryImpl(MongoTemplate mongoTemplate) {
		super(mongoTemplate, Event.class);
	}
}
