package ai.ednova.ticket.booking.service.dtos.responses.wrapper;

import ai.ednova.ticket.booking.service.constants.Constants;
import ai.ednova.ticket.booking.service.enums.ResponseStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class MetaResponse {
	private ResponseStatus status;

	@JsonFormat(pattern = Constants.RESPONSE_DATE_TIME_FORMAT, shape = JsonFormat.Shape.STRING)
	private LocalDateTime timestamp;
}
