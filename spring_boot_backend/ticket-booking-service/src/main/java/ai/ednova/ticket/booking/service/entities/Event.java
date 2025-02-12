package ai.ednova.ticket.booking.service.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Event extends BaseEntity {
	private String name;

	private String description;

	private String location;

	private LocalDateTime date;

	private Integer totalSeats;

	private Integer availableSeats;
}
