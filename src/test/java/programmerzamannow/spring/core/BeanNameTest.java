package programmerzamannow.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamannow.spring.core.data.Foo;

public class BeanNameTest {


    @Test
    void testBeanName() {

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanNameConfiguration.class);


        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);
        Foo foo3 = context.getBean("fooFirst", Foo.class);
        Foo foo4 = context.getBean("fooSecond", Foo.class);

        Assertions.assertThrows(NoSuchBeanDefinitionException.class, () -> {
            // method name is foo2, but renamed with annotation as fooSecond
            Foo foo5 = context.getBean("foo2", Foo.class);
        });

        Assertions.assertSame(foo1, foo2);
        Assertions.assertSame(foo2, foo3);
        Assertions.assertNotSame(foo1, foo4);

    }
}
