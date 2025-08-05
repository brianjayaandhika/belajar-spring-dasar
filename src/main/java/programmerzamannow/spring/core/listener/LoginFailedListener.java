package programmerzamannow.spring.core.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import programmerzamannow.spring.core.event.LoginFailedEvent;
import programmerzamannow.spring.core.event.LoginSuccessEvent;

@Component
@Slf4j
public class LoginFailedListener implements ApplicationListener<LoginFailedEvent> {

    @Override
    public void onApplicationEvent(LoginFailedEvent event) {
        log.info("Failed login for user: {}", event.getUser());
    }
}
