package programmerzamannow.spring.core.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamannow.spring.core.data.Foo;

class WithoutSpringBootTest {



    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(FooApplication.class);
        context.registerShutdownHook();
    }

    @Test
    void testSpringBoot() {
        Foo foo = context.getBean(Foo.class);

        Assertions.assertNotNull(foo);
    }
}