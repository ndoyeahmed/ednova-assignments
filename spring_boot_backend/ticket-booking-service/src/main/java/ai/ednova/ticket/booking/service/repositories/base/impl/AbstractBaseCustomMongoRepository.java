package ai.ednova.ticket.booking.service.repositories.base.impl;

import ai.ednova.ticket.booking.service.constants.MongoConstants;
import ai.ednova.ticket.booking.service.entities.BaseEntity;
import ai.ednova.ticket.booking.service.enums.DocumentStatus;
import ai.ednova.ticket.booking.service.repositories.base.BaseCustomMongoRepository;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.Optional;

public abstract class AbstractBaseCustomMongoRepository<T extends BaseEntity, ID>
		implements
			BaseCustomMongoRepository<T, ID> {
	protected final MongoTemplate mongoTemplate;
	protected final Class<T> entityClass;

	protected AbstractBaseCustomMongoRepository(MongoTemplate mongoTemplate, Class<T> entityClass) {
		this.mongoTemplate = mongoTemplate;
		this.entityClass = entityClass;
	}

	@Override
	public T save(T entity) {
		return mongoTemplate.save(entity);
	}

	@Override
	public Optional<T> findById(ID id) {
		Criteria criteria = Criteria.where(MongoConstants.STATUS).is(DocumentStatus.ACTIVE).and(MongoConstants.ID)
				.is(id);
		Query query = new Query(criteria);
		return Optional.ofNullable(mongoTemplate.findOne(query, entityClass));
	}

	@Override
	public boolean deleteById(ID id) {
		Criteria criteria = Criteria.where(MongoConstants.STATUS).is(DocumentStatus.ACTIVE).and(MongoConstants.ID)
				.is(id);
		Query query = new Query(criteria);
		Update update = Update.update(MongoConstants.STATUS, DocumentStatus.INACTIVE);
		return mongoTemplate.updateFirst(query, update, entityClass).getModifiedCount() > 0;
	}
}
