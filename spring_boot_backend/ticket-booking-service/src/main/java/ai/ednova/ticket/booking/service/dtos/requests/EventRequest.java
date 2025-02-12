package ai.ednova.ticket.booking.service.dtos.requests;

import ai.ednova.ticket.booking.service.constants.Constants;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class EventRequest {
	private String name;
	private String description;
	private String location;
	private Integer totalSeats;
}
