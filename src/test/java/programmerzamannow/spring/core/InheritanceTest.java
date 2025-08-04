package programmerzamannow.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamannow.spring.core.service.MerchantService;
import programmerzamannow.spring.core.service.MerchantServiceImpl;

public class InheritanceTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void inheritanceTest() {

        MerchantServiceImpl beanImpl = context.getBean(MerchantServiceImpl.class);
        MerchantService bean = context.getBean(MerchantService.class);

        Assertions.assertSame(bean, beanImpl);
    }
}
