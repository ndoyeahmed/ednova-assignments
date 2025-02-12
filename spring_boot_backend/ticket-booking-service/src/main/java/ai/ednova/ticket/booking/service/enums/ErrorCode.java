package ai.ednova.ticket.booking.service.enums;

import ai.ednova.ticket.booking.service.constants.Constants;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum ErrorCode {
	NOT_FOUND("001", "Not Found"), EVENT_NOT_FOUND("002", "Event not found"), INTERNAL_SERVER_ERROR("003",
			"Internal server error");
	private final String code;

	private final String message;

	ErrorCode(String code, String message) {
		this.code = Constants.ERROR_CODE_PREFIX + code;
		this.message = message;
	}
}
