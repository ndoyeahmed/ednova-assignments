package ai.ednova.ticket.booking.service.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import ai.ednova.ticket.booking.service.constants.MongoConstants;
import ai.ednova.ticket.booking.service.enums.DocumentStatus;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Field;

public class BaseEntity {
	@Id
	private String mongoId;

	@Field(MongoConstants.ID)
	private String id;

	@Version
	private Integer version;

	@Field(MongoConstants.STATUS)
	private DocumentStatus status;

	@CreatedDate
	private LocalDateTime createdAt;

	@LastModifiedDate
	private LocalDateTime updatedAt;

	@CreatedBy
	private UUID createdBy;

	@LastModifiedBy
	private UUID updatedBy;
}
