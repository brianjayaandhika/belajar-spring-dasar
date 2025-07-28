package programmerzamannow.spring.core;

import lombok.Cleanup;
import lombok.SneakyThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamannow.spring.core.data.Connection;
import programmerzamannow.spring.core.data.Server;

public class LifeCycleTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        context.registerShutdownHook();
    }

    @AfterEach
    void tearDown() {
//        context.close();
    }

    @Test
    void testConnection() {
        Connection connection = context.getBean(Connection.class);
    }

    @Test
    void testServer() {
        Server server = context.getBean(Server.class);
    }
}
