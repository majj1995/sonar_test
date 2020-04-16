package mjj.learning.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping(value = "/event")
    public EventDTO getEvent() {
        return EventDTO.builder()
                .userEmail("595641927@qq.com")
                .type(EventType.LESSON)
                .time(LocalDateTime.now())
                .action(EventAction.PARTICIPATE)
                .description("软件工程与计算1")
                .build();
    }

}
