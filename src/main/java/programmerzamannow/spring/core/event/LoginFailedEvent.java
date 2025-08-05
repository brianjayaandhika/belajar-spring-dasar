package programmerzamannow.spring.core.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;
import programmerzamannow.spring.core.data.User;

public class LoginFailedEvent extends ApplicationEvent {

    @Getter
    private final User user;

    public LoginFailedEvent(User user) {
        super(user);
        this.user = user;
    }
}
