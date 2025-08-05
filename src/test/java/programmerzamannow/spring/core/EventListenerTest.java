package programmerzamannow.spring.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import programmerzamannow.spring.core.listener.LoginFailedListener;
import programmerzamannow.spring.core.listener.LoginSuccessListener;
import programmerzamannow.spring.core.listener.UserListener;
import programmerzamannow.spring.core.service.UserService;

public class EventListenerTest {

    @Configuration
    @Import({
            UserService.class,
            UserListener.class
//            LoginSuccessListener.class,
//            LoginFailedListener.class
    })
    public static class TestConfiguration {

    }

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(TestConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testEvent() {

        UserService bean = context.getBean(UserService.class);

        bean.login("eko", "eko");
        bean.login("khannedy", "eko");
        bean.login("eko", "salah");

    }
}
