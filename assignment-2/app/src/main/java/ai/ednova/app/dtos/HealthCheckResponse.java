package ai.ednova.app.dtos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HealthCheckResponse {
    private String message;
}
