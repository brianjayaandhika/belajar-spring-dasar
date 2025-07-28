package programmerzamannow.spring.core;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamannow.spring.core.data.Foo;

public class DependsOnTest {

    ApplicationContext context = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);

    @Test
    void testDependsOn() {
        Foo foo = context.getBean(Foo.class);

    }
}
