package programmerzamannow.spring.core.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import programmerzamannow.spring.core.event.LoginCountEvent;
import programmerzamannow.spring.core.event.LoginFailedEvent;
import programmerzamannow.spring.core.event.LoginSuccessEvent;

@Component
@Slf4j
public class UserListener {

    @EventListener(classes = {LoginSuccessEvent.class})
    public void onLoginSuccessEvent(LoginSuccessEvent event) {
        log.info("Success login for user: {}", event.getUser());
    }

    @EventListener(classes = {LoginFailedEvent.class})
    public void onLoginFailedEvent(LoginFailedEvent event) {
        log.info("Failed login for user: {}", event.getUser());
    }

    @EventListener(classes = {LoginCountEvent.class})
    public void onLoginCountEvent() {
        log.info("Count login for user: {}", LoginCountEvent.getCounter());
    }
}

