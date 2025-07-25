package programmerzamannow.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamannow.spring.core.data.Foo;

public class PrimaryTest {


    @Test
    void testPrimary() {

        ApplicationContext context = new AnnotationConfigApplicationContext(PrimaryConfiguration.class);


        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);
        Foo foo3 = context.getBean("foo1",Foo.class);
        Foo foo4 = context.getBean("foo2", Foo.class);

        Assertions.assertSame(foo1, foo2);
        Assertions.assertSame(foo2, foo3);
        Assertions.assertNotSame(foo1, foo4);
    }
}
