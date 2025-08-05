package programmerzamannow.spring.core.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;
import programmerzamannow.spring.core.data.User;

import java.util.concurrent.atomic.AtomicLong;

public class LoginCountEvent extends ApplicationEvent {

    @Getter
    private static AtomicLong counter = new AtomicLong(0);

    public LoginCountEvent() {
        super(counter);
        counter.incrementAndGet();
    }
}
