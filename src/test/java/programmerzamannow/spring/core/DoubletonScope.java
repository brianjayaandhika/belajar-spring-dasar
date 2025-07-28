package programmerzamannow.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamannow.spring.core.data.Bar;

public class DoubletonScope {

    private ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
    }

    @Test
    void doubletonScope() {
        Bar bar1 = context.getBean(Bar.class);
        Bar bar2 = context.getBean(Bar.class);
        Bar bar3 = context.getBean(Bar.class);
        Bar bar4 = context.getBean(Bar.class);

        Assertions.assertNotSame(bar1, bar2);
        Assertions.assertNotSame(bar3, bar4);
        Assertions.assertSame(bar1, bar3);
        Assertions.assertSame(bar2, bar4);

    }
}
