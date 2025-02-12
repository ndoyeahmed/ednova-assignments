package ai.ednova.ticket.booking.service.exceptions.handler;

import ai.ednova.ticket.booking.service.constants.MessageConstants;
import ai.ednova.ticket.booking.service.dtos.responses.wrapper.ErrorResponse;
import ai.ednova.ticket.booking.service.dtos.responses.wrapper.ResponseWrapper;
import ai.ednova.ticket.booking.service.enums.ErrorCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
	@ExceptionHandler(value = {Throwable.class})
	public ResponseEntity<ResponseWrapper<Void>> handleGenericThrowable(Throwable throwable) {
		log.error(String.format(MessageConstants.GLOBAL_EXCEPTION_HANDLER_CAPTURE_MESSAGE,
				throwable.getClass().getName()), throwable);
		ErrorResponse errorResponse = ErrorResponse.from(ErrorCode.INTERNAL_SERVER_ERROR);
		return buildErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, List.of(errorResponse));
	}

	private ResponseEntity<ResponseWrapper<Void>> buildErrorResponse(HttpStatus httpStatus,
			List<ErrorResponse> errorResponses) {
		return ResponseEntity.status(httpStatus).body(ResponseWrapper.failure(errorResponses));
	}
}
