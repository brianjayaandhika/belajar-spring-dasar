package programmerzamannow.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamannow.spring.core.client.PaymentGatewayClient;

public class FactoryTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testFactory() {

        PaymentGatewayClient bean = context.getBean(PaymentGatewayClient.class);

        Assertions.assertNotNull(bean);

        Assertions.assertEquals("https://example.com", bean.getEndpoint());
        Assertions.assertEquals("public", bean.getPublicKey());
        Assertions.assertEquals("private", bean.getPrivateKey());
    }
}
