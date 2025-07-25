package programmerzamannow.spring.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import programmerzamannow.spring.core.data.Foo;

@Slf4j
@Configuration
public class BeanNameConfiguration {

    @Primary
    @Bean(name = "fooFirst")
    public Foo foo1() {
        log.info("Create New Foo - 1");
        return new Foo();
    }

    @Bean(name = "fooSecond")
    public Foo foo2() {
        log.info("Create New Foo - 2");
        return new Foo();
    }
}
