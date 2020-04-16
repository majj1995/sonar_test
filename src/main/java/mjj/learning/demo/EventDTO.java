package mjj.learning.demo;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class EventDTO {
    private String userEmail;
    private EventType type;
    private LocalDateTime time;
    private EventAction action;
    private String description;
 }
