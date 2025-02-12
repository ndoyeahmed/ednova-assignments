package ai.ednova.ticket.booking.service.repositories.base;

import ai.ednova.ticket.booking.service.entities.BaseEntity;

import java.util.Optional;

public interface BaseCustomMongoRepository<T extends BaseEntity, ID> {
	T save(T entity);

	Optional<T> findById(ID id);

	boolean deleteById(ID id);
}
